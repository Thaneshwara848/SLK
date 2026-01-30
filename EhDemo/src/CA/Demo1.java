package CA;
import java.util.*;
import java.io.*;
import java.sql.SQLException;
class A{
	void display() throws IOException,SQLException,NullPointerException{
		for(int i=0;i<=20;i++){
			System.out.println("I : "+ i);
			if(i==18) throw new NullPointerException();
			if(i==16) throw new ArithmeticException();
			if(i==15) throw new IOException();
			if(i==10) throw new SQLException();
			
		}
	}
}
public class Demo1{
	public static void main(String args[]) {
		try{
			A a = new A();
			a.display();
		}
		catch (NullPointerException e) {
				System.out.println("Null poinet Excepton raised ...!");
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
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
