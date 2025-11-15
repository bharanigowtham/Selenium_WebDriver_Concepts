package com.webdriver;

import com.google.cloud.vision.v1.*;
import com.google.protobuf.ByteString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class ZH_ReadtextfromImages {  //not working...

	public static void main(String[] args) throws Exception {
        try (ImageAnnotatorClient vision = ImageAnnotatorClient.create()) {
            ByteString imgBytes = ByteString.readFrom(Files.newInputStream(Paths.get("./handwritten-note.jpg")));

            Image img = Image.newBuilder().setContent(imgBytes).build();
            Feature feat = Feature.newBuilder().setType(Feature.Type.DOCUMENT_TEXT_DETECTION).build();
            AnnotateImageRequest request = AnnotateImageRequest.newBuilder()
                    .addFeatures(feat)
                    .setImage(img)
                    .build();
            
            List<AnnotateImageRequest> requests = List.of(request);
            BatchAnnotateImagesResponse response = vision.batchAnnotateImages(requests);
            AnnotateImageResponse res = response.getResponses(0);

            System.out.println("Extracted Text:\n" + res.getFullTextAnnotation().getText());
        }
	}
}
