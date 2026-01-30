package com;

import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		m2();
		System.out.println("Hi m1 ");
	}
	static void m2() {
		m3();
		System.out.println("Hi m2 ");
	}
	static void m3() {
		try {
			 Scanner sc = new Scanner(System.in);
			// Read two integer numbers.
			   int num1 = sc.nextInt();
			   int num2 = sc.nextInt();
			System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
		}
		catch (InputMismatchException e) {
			System.out.println("Boss Please enter Number only...!");
		}
		catch (ArithmeticException ae) {
			System.out.println("We can not divide naything by 0 ");
		}
		finally {
			System.out.println("Thank you ");
		}
	}

}
