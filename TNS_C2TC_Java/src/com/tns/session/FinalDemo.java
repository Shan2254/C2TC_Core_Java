package com.tns.session;

public class FinalDemo {
	public static void main(String[] args) {
		final int a = 10;
		System.out.println(a);
		
		a = 100;       //not allowing us to use variable 'a' as its already set a final value on top
		               //and so you can't alter the value of a
		System.out.println(a);
		//either change the variable to a different variable name or remove the final keyword
	}
}
