package com.indiabix.multithreading;

class A extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running");
	}
}
public class Example2
{

	public static void main(String[] args) 
	{
		A obj=new A();
		obj.start();

	}

}
