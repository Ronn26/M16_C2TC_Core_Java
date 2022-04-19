//class for multilevel Inheritance

package com.indiabix.task;



class Principal
{
	void accept()
	{
		System.out.println("Fr.Sarang");
	}
}
class Teacher extends Principal
{
	void print()
	{
		System.out.println("Mr. Ramesh Tichkule");
	}
}
class Student extends Teacher
{
	void display()
	{
		System.out.println("Roshan Chachire");
	}
}
public class Task1 {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.accept();
		obj.print();
		obj.display();
	}
}

