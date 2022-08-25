package com.tns.session;
	
	class Demo extends Thread //Thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("I am first thread.");
				Thread.yield(); // Stop the execution of child thread and giving chance to the main thread.


			}


	}}

	//Tread Scheduler

	public class YeildMethod  {

		public static void main(String[] args) throws InterruptedException
		{
		Demo t=new Demo();
		 t.start();


		for(int i=0;i<10;i++)
		{
			System.out.println("I am second thread.");
			Thread.sleep(500);
		}

		}

}
