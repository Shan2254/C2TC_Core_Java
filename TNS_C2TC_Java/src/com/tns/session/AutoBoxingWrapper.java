package com.tns.session;

import java.util.ArrayList;

public class AutoBoxingWrapper {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		Integer i=new Integer(10);
		l.add(i);
		
		System.out.println(l);
		

	}
}
