package comZ;
import java.util.*;
import java.io.*;
class A{
	void display(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age ");
		int age = sc.nextInt();
		if(age> 60){
			throw new InvalidAgeException("Age must be less then 60 ");
		}	
		else if(age < 18 ){
			throw new InvalidAgeException("Age must be greated then 18  ");
		}
		else{
			System.out.println("Age is okay  ");
		}
	}
}
class Demo2{
	public static void main(String args[]) {
		try{
			A a = new A();
			a.display();
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){}
	}
}
class  InvalidAgeException extends RuntimeException
{
	InvalidAgeException(String msg){
		super(msg);
	}
}
