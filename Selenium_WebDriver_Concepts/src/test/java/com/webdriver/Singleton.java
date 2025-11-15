package com.webdriver;

public class Singleton {
	
	private static Singleton singleton_ref = null;
	
	private Singleton() {
		System.out.println("This is singleton class...");
	}
	
	public static Singleton getinstance() {
		
		if(singleton_ref==null) { 
			singleton_ref = new Singleton();
		}
		return singleton_ref;
	}
	
	
	public static void main(String[] args) {
		
		Singleton a = Singleton.getinstance();
		Singleton b = Singleton.getinstance();
		
		
		
		
		
	
	}

}
