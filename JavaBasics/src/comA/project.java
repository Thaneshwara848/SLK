package comA;
import java.util.Scanner;
 class Employee
{
	Scanner sc = new Scanner(System.in);
	public int id , age ;
	public int salary;
	public String name ;
	public String desig;
	public Employee() {
		System.out.print("ENter ID : ");	id=sc.nextInt();
		System.out.print("ENter The NAME : ");name=sc.next();
		System.out.print("ENter the Age "); age = sc.nextInt();
	}
	public void display() {
		System.out.println("=============");
		System.out.println("ID :"+ id);
		System.out.println("Name :"+ name);
		System.out.println("Age : "+ age);
		System.out.println("Salary : "+ salary);
		System.out.println("Designatin " + desig);
	}
}
 final class Clerk  extends Employee{
	public Clerk() {
		salary=30000;
		desig="CLERK";
	}
	public void raiseSalary() {
		salary= salary+ 10000;
		System.out.println("Salary Raised....!");
	}
}
 final class Dev extends Employee{
	public Dev() {
		salary=50000;
		desig="Developer";
	}	
}
public class project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch1,ch2,ch3,ch4=0;
		Clerk c=null;
		Dev  d= null;
		do {
			System.out.println("1 ) CREATE ");
			System.out.println("2 ) DISPLAY ");
			System.out.println("3 ) Raise Salary ");
			System.out.println("4 ) Exit ");
			ch1 = sc.nextInt();
			if(ch1==1) {
				do {
					System.out.println("	1 ) CLERK ");
					System.out.println("	2 ) DEVELOPER ");
					System.out.println("	3 ) Exit ");
					ch2 = sc.nextInt();
					if(ch2==1) {  c = new Clerk();}
					if(ch2==2) {  d = new Dev();}
				} while (ch2!=3);
			}
			if(ch1==2) {
				do {
					
					System.out.println("	1 ) CLERK ");
					System.out.println("	2 ) DEVELOPER ");
					System.out.println("	3 ) Exit ");
					System.out.println("		TO WHome You want to Disply");
					ch3 = sc.nextInt();
					if(ch3==1) { 
						if(c!=null) {
							c.display();
						}
						else {
							System.out.println("No Clerk FOund ");
						}
					
						
					} 
					if(ch3==2) { d.display();}
				} while (ch3!=3);
			}
			if(ch1==3) {
				do {
					
					System.out.println("	1 ) CLERK ");
					System.out.println("	2 ) DEVELOPER ");
					System.out.println("	3 ) Exit ");
					System.out.println("		TO WHome You want to Disply");
					ch4 = sc.nextInt();
					if(ch4==1) { 
						if(c!=null) {
							c.raiseSalary();
						}
						else {
							System.out.println("No Clerk FOund ");
						}
					
						
					} 
//					if(ch3==2) { d.();}
				} while (ch4!=3);
			}
			if(ch1==4) {
				System.out.println("Thank you...!");
			}
		}while(ch1!=4);
	}
}