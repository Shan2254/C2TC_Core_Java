package com.tns.session;

class Counter
{
	int count;
	public synchronized void inc()
	{
		count ++;
	}
}

public class SynchronizationDemo {
	
	public static void main(String[] args) {
		Counter c = new Counter();
		c.inc();
		System.out.println(c.count);


	}

}
