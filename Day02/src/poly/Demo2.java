package poly;
class Bank
{
	Bank(){
		System.out.println("Hi Wlecome to BANK ");
	}
	public void roi() {
		System.out.println("10 % ");
	}
}
class Sbi extends Bank
{
//	Bank(){
//		System.out.println("Hi Wlecome to Sbi BANK ");
	// Constructor overriding is not possible in Java
	//because constructors are not inherited by subclasses
//	}
}
class Axis extends Bank
{
//	Bank(){
//		System.out.println("Hi Wlecome to BANK ");
//	}
	@Override
	public void roi() {
		System.out.println("12 % ");
	}
	// same method name  + same signature + same parament + 
	//but in child class  
}
public class Demo2 {
	public static void main(String[] args) {
		Bank s = new Sbi();s.roi();
		Axis a = new Axis();a.roi();
	}
}
