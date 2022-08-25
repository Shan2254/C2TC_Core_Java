package com.tns.session;
import java.util.Scanner;
public class UserDefinedException {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter age:- ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if (age > 18)
		{
			System.out.println("You can cast your vote");
		}
		else
		{
			throw new cantvote("You cannot cast your vote");
		}
	}

}
class cantvote extends RuntimeException   // Unchecked Exception
{
	public cantvote(String msg)
	{
		super(msg);
	}
}