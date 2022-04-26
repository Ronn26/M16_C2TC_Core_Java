package com.indiabix.multithreading;

class Parent1 extends Thread
{
	public void run()
	{
		//Thread.sleep(1000);
		System.out.println("Exception occurred");
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.start();
		try
		{
			p.interrupt();
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
		
	}
}
