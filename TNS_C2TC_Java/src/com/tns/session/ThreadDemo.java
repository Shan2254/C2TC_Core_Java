package com.tns.session;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Class");
		}
	}
}

public class ThreadDemo {
	
	public static void main(String[] args)
	{
		MyThread m = new MyThread();
		m.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Class");
		}
	}

}
