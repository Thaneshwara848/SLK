package comA;
import java.util.InputMismatchException;
public class Demo3 {
	public static void main(String[] args) {
		//ArithmeticException
		
		//int a=10/0;
		//System.out.println(a);
		
		String name="Sandesh";
		System.out.println(name.length());
		name=null;
		//NullPointerException
		//System.out.println(name.length());
		
		
		//ArrayIndexOutOfBoundsException
		int arr[]= {50,20,30,50,600};
		System.out.println(arr[3]);
//		System.out.println(arr[6]);
		String num="100A";
		System.out.println(num);
		
//		NumberFormatException
//		int x =Integer.parseInt(num);
//		System.out.println(x);
		
//		InputMismatchException
	}
}
