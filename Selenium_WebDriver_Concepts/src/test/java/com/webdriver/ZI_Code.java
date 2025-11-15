package com.webdriver;

public class ZI_Code {

	/*
	  for() 
	    {
		// Capture R&B, ICU in excel.
		if(! R&B & ICU == 0) 
		{
				// Capture policy no from excel
				// Move to CQ, check for HIB Rider in benefit info
				if(HIB Rider exists) 
				{
				   // Capture Plan code & Name
				   // Navigate to Claims Query. Check for existing cases using event dt, clm type, case status.
				    if(present yes) {
				    	//Write exception. SIMILAR CASE EXISTS. CASE NO:
				    }
				    else {
				     	// Proceed Claims Intimation.
				     	// Registration. Accept all policies.If no HIB Rider present for other policies, Write exception. "POLICY NO: 502-9874563 FOUND IN ACCEPTANCE BUT DONT HAVE HIB RIDER."
				     	   Also capture accepted policies count. Capture using tick count.
				     	// Evaluation
				     	// Select documents
				     	// Move to  case summary tab. Update edit case info.
				     		if(! R&B or ICU is in decimal values) 
				     		{
				     		 	// Liability computation for all accepted policies.
				     		 	// Allocate payout. Select PH only
				     		 	 if(Others roles present) 
				     		 	 {
				     		 	 	//Write exception. "ROLES PRESENT OTHER THAN PH"
				     		 	 	 continue; 
				     		 	 }
				     		 	 else {
				     		 	 	// Complete allocation.
				     		 	 	// Enter Comment & Save
				     		 	 	// Submit evaluation.
				     		 	 	// Case reassign.
				     		 	 	// Approve the case. WRITE EXCEPTION "CASE APPROVED SUCCESSFULLY. CASE NO:"
				     		 	 	 
				     		 	 	// Capture NRIC ID in excel 
  									// Navigate to Search in Maintain customer
									// Move to related policies section, capture all policies & ignore current policy from data file. Capture policies count. Save policies in arraylist
						 				if(policycount == 1) // Means only policy from data file exist in Maintain customer.
						 	 			{
						 	   				// Write exception in excel. "ONLY POLICY FROM DATA FILE EXIST IN MAINTAIN CUSTOMER"
							   				continue;
						 	 			}
						 	 			 else if(policycount > 1)
						 	 			 {
						 	  				for(int j=0;j<=arraylist.size();j++) 
						 	  					{
						 	  						// Navigate to CQ, Search for HIB Rider in benefit info
						 							if(HIB Rider exists) 
						 								{
						 									// Capture Plan Code & Name
						 									 // Navigate to Claims Query. Check for existing cases.
				    										if(present yes) 
				    										{
															    	//Write exception. "SIMILAR CASE EXISTS. CASE NO:  POLICY NO: 502-9874563"
															}
															else {
																// Proceed Claims Intimation.
				     											// Registration. Accept all policies.If no HIB Rider present for other policies, Write exception. Also capture accepted policies count.
				     											// Evaluation
				     											// Select documents
				     											if(! R&B or ICU is in decimal values) 
				     											{
				     												// Liability computation for all accepted policies.
				     		 										// Allocate payout. Select PH only
				     		 	 									if(Others roles present) 
				     		 	 									{
				     		 	 										//Write exception "ROLES PRESENT OTHER THAN PH"
				     		 	 	  									continue;
				     		 	 									}
				     		 	 									else 
				     		 	 									{
				     		 	 										// Complete allocation.
				     		 	 										// Enter Comment & Save
				     		 	 										// Submit evaluation.
				     		 	 										// Case reassign.
				     		 	 										// Approve the case WRITE EXCEPTION "CASE APPROVED SUCCESSFULLY. CASE NO: POLICY NO: 502-9874563 FROM MAINTAIN CUSTOMER"	
				     		 	 									}
				     		 	 									
				     											}
															}
															
						 								}
						 							else 
						 								{
						 									// Write exception in excel "NO HIB RIDER FOUND IN BENEFIT INFO FOR POLICY NO: 502-9874562 FROM MAINTAIN CUSTOMER"
						 								}
						 	  	}
						 	  	
						 	  }
				     		 	 					     		 	 	 
				     		 	 }
				     		 }
				     		 else {
				     		 	// Write exception. "R&B or ICU HAVE DECIMAL VALUES"
				     		 	 continue;
				     		 }
				     }
				   // 
				}
 				else {
 						// Write exception in excel. "NO HIB RIDER FOUND IN BENEFIT INFO FOR POLICY NO: 502-9874562"
   						// Capture NRIC ID in excel 
  						// Search in Maintain customer
						// Move to related policies section, capture all policies & ignore current policy from data file. Capture policies count. Save policies in arraylist
						 	if(policycount == 1) // Means only policy from data file exist in Maintain customer.
						 	 {
						 	   // Write exception in excel. "ONLY POLICY FROM DATA FILE EXIST IN MAINTAIN CUSTOMER"
							   continue;
						 	 }
						 	 else if(policycount > 1) {
						 	  	
						 	  	for(int j=0;j<=arraylist.size();j++) 
						 	  	{
						 	  		// Move to CQ, Search for HIB Rider in benefit info
						 			if(HIB Rider exists) 
						 			{
						 				// Capture Plan Code & Name
						 				 // Navigate to Claims Query. Check for existing cases.
				    						if(present yes) 
				    							{
												   //Write exception. "SIMILAR CASE EXISTS. CASE NO:" "  POLICY NO: 502-9874563"
												}
											else {
													// Proceed Claims Intimation.
				     								// Registration. Accept all policies.If no HIB Rider present for other policies, Write exception. Also capture accepted policies count.
				     								// Evaluation
				     								// Select documents
				     								if(! R&B or ICU is in decimal values) 
				     								  {
				     									  // Liability computation for all accepted policies.
				     		 							  // Allocate payout. Select PH only
				     		 	 							if(Others roles present) 
				     		 	 							   {
				     		 	 								  //Write exception. "ROLES PRESENT OTHER THAN PH"
				     		 	 	  								continue; 
				     		 	 								}
				     		 	 							else 
				     		 	 								{
				     		 	 								  // Complete allocation.
				     		 	 								  // Enter Comment & Save
				     		 	 								  // Submit evaluation.
				     		 	 								  // Case reassign.
				     		 	 								  // Approve the case.
				     		 	 								}
				     		 	 									
				     											}
															}
	
						 			}
						 			else 
						 			{
						 				// Write exception in excel.  "NO HIB RIDER FOUND IN BENEFIT INFO FOR POLICY NO: 502-9874562 FROM MAINTAIN CUSTOMER"
						 			}
						 	  	}
						 	  	
						 	  } 
					 }	 		
		}
		else {
   				//Write Exception. // Both R&B and ICU have zero values. 
				continue;	  
			 }
		}

	 * 
	 * 
	 * 
	 * 
	 */
}
