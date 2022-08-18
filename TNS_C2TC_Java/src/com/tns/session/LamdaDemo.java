package com.tns.session;

interface Anonymous{
	void show();
}
public class LamdaDemo {
	
	public static void main(String[] args) {
        Anonymous l= ()-> //Lambda expression
         {
       	  System.out.println("Lamda Demo for Simplification");
         };
    l.show();
	}


}
