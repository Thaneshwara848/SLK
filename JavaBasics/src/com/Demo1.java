package com;

import java.util.Scanner;
class Employee
{
	Scanner sc = new Scanner(System.in);
	int myid;
	String name;
	
	public Employee() {
		System.out.println("ENter ID : ");		myid=sc.nextInt();
		System.out.println("ENter The NAME : ");	name=sc.next();
	}
	void display() {
		System.out.println("===============");
		System.out.println("My id is :"+ myid );
		System.out.println("My name is : "+ name );
	}
}
public class Demo1 {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.display();				
	}
}