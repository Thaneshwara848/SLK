package comB;
class A
{
	A(){
		System.out.println("A class Consructor ");
		
	}
	A(int a ){
		System.out.println("A class with  parametrisez Consructor ");	
	}
}
class B extends A
{
	B(){
		System.out.println("B class COnstructyor");
	}
	B(int a ){
		System.out.println("B class with  parametrisez Consructor ");
	}
}
public class Demo2 {
	public static void main(String[] args) {
			B b1  = new B();
			System.out.println("==========");
			B b2  = new B(100);
			// as soon as we create child class objec 			
						// it will automacatocally will call the super default constr
	}
}
