package com.indiabix.generics;

import java.util.LinkedList;

public class Example2 
{

	public static void main(String[] args) {
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("Roshan");
		obj.add("chachire");
		String res=obj.get(0);
		System.out.println(res);

	}

}
