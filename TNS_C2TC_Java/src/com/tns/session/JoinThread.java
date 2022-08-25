package com.tns.session;

class ChildThread extends Thread //Thread create using Thread Class
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am child thread.");
			try
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e)
			{

			}

		}


}}

//Tread Scheduler

public class JoinThread {

	public static void main(String[] args) throws InterruptedException
	{
	ChildThread m=new ChildThread();
	 m.start();
	m.join(2000);   //main thread wants to wait 

	for(int i=0;i<10;i++)
	{
		System.out.println("I am main thread.");
		Thread.sleep(2000);
	}

	}
}
