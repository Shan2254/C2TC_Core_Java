//Concept of multilevel Inheritance
package com.tns.session;
class Car{                             //parent class is car
	public void wholecar() {
		System.out.println("I am car");
	}
}
class Engine extends Car{              //car is parent and child is engine
	public void abc() {
		System.out.println("I am engine");
	}
}
class Transmission extends Engine {     //engine is parent of transmission
	public void upshift() {
		System.out.println("I am transmission");  //child class transmission will print this
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Transmission trans = new Transmission();
		trans.wholecar();
		trans.abc();
		trans.upshift();
	}
}
