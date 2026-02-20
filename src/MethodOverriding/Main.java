package MethodOverriding;

public class Main {
	
	public static void main(String[] args) {
		Bank b;
		 b = new SBI();  
	        System.out.println("SBI Rate of Interest is: " + b.getRateOfInterest());  
	        
	        b = new ICICI();  
	        System.out.println("ICICI Rate of Interest is: " + b.getRateOfInterest());  
	        
	        b = new AXIS();  
	        System.out.println("AXIS Rate of Interest is: " + b.getRateOfInterest());  
	    }  
	} 

