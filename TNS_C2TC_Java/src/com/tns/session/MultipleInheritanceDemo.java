package com.tns.session;

public class MultipleInheritanceDemo implements FirstInterface, SecondInterface {
	public static void main(String[] args) {
		System.out.println(laptopbrand);
		System.out.println(laptopcolor);
		
		//Method calls
		MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
		obj.documentation();
		obj.paint();
		obj.browsing();
		obj.programming();
	}
	
	@Override
	public void programming() {
		// TODO Auto-generated method stub
		System.out.println("I am programming");
	}

	@Override
	public void browsing() {
		// TODO Auto-generated method stub
		System.out.println("I am browsing");
	}

	@Override
	public void documentation() {
		// TODO Auto-generated method stub
		System.out.println("I am doing documentation");
		
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("I am painting");
	}




	
}
