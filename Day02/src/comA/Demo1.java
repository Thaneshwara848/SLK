package comA;
class A{
	int a=10000;
}
class B extends A
{
	B(){		// no returen type , CN and Class name must be same 
		System.out.println("Hi B class ");
	}
	void abc() {	// we have return type , can be anything 
		System.out.println("Hi ABC method ");
	}
	int a=1000;
	void display(int a) {
		System.out.println(a);	// 100
		System.out.println(this.a);	// 1000
		System.out.println(super.a);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		B  b = new B();	// as soon as we create a obj only constr will get call 
		//b.abc();		// we have to Call manually 
		b.display(100);
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			