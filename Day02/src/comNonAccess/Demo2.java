package comNonAccess;
//final class Car				// we cant inherit
class Car{
	final int speed= 250;
	int model=2025;
	String color="Red";
//	final void gare() {		// we can not over ride 
	void gare() {
		System.out.println("5 gare car ");
	}
}
class Benz extends Car{}
class Bmw extends Car{	
	@Override
	void gare() {
		System.out.println("Auto gare car ");
		System.out.println(speed);System.out.println(model);System.out.println(color);
	}
}
public class Demo2 {
	public static void main(String[] args) {
//		Car c  = new Car();
		Benz c= new Benz();
		System.out.println(c.speed);
		//c.speed=2500;						// we cant re assign the final varibale 
		//System.out.println(c.speed);
		c.gare();
		Bmw b = new Bmw();b.gare();
	}
}






























