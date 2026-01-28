package abstratclass;

import clas.A;

abstract class A
{
	int a;//0
	A(){
		
	}
	void abc() {
		
	}
	abstract void xyz();
}
class B 
{
}
class C extends A , B
{
	
}
public class Demo1 {
	public static void main(String[] args) {
		A a= new A();
	}
}
