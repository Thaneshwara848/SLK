package com;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int arr[]= {3,2,3,5,6};
		for(int i=0;i<arr.length;i++) {
			System.out.println("I  : "+ arr[i]);
		}
		System.out.println("========== FOR EACH LOOP====");
		for(int x :arr) {
			System.out.println("I: "+x);
		}
		System.out.println("=====");
		int ar[]= new int[5];
		ar[0]=111;		ar[1]=222;
		ar[2]=333;	ar[3]=444;
		for(int x :ar) {
			System.out.println("I: "+x);
		}				
		System.out.println("===Enter the Sizoe of Array==");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int a[]= new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int z:a) {
			System.out.println(z);
		}
		
	}
}
