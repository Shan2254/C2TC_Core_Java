package com.tns.session;

class User extends Thread{
	public void run() {
		for (int i=1; i<=5;i++) {
			//System.out.println(i);
			System.out.println("User Thread");
			try {
				Thread.sleep(1000); // stop working  for specific amount of time 

			}
			catch(InterruptedException e) {
				System.out.println("e");
		}

			System.out.println(i);
		}

}
public class SleepMethod {
	
	public static void main(String args[]) {
		// Main thread
		User u =new User();
		//Call run () method
		u.start(); // to start a thread.

	}
}

}
