package com.tns.session;

public class InstanceMethod {

	public class InstanceMethodExample  
	{  
	public static void main(String [] args)  
	{  
	//Creating an object of the class  
	Object obj = new InstanceMethod();  
	//invoking instance method   
	System.out.println("The sum is: "+((InstanceMethodExample) obj).add(12, 13));  
	}  
	int s;  
	//user-defined method because we have not used static keyword  
	public int add(int a, int b)  
	{  
	s = a+b;  
	//returning the sum  
	return s;  
	}  
	}
}
