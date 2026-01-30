package comA;

import java.util.Scanner;
class Employee{
	static void insert() {}
	static void display() {}
	static void update() {}
	static void delete() {}
}
public class Project {
	public static void main(String[] args) {
		int ch=0;
		do {
			System.out.println("1 ) CREATE ");
			System.out.println("2 ) DISPLAY ");
			System.out.println("3 ) UPDATE ");
			System.out.println("4 ) DELETE ");
			System.out.println("5 ) EXIT ");
			Scanner sc = new Scanner(System.in);
			ch=sc.nextInt();
			if(ch==1) {Employee.insert();}
			if(ch==2) {}
			if(ch==3) {}
			if(ch==4) {}
			if(ch==5) {}
		} while (ch!=5);
	}
}
