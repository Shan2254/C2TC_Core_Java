package com.tns.session;

public class MethodOverloading {
	public static void main(String[] args)
	{
		Test1 obj = new Test1();
		//method calls
		obj.m();
		obj.m(2);
		obj.m(1.0);
		
		obj.m('g');
		obj.m(101);
		obj.m(2.3f);
	}

}
class Test1{
	public void m()
	{
		System.out.println("No argumrnts");
	}
	public void m(int i)
	{
		System.out.println("Integer Argument");
	}
	public void m(double d)
	{
		System.out.println("Double Argument");
	}
}