package poly;
class A{
	//same Constructor name + diff par + in same class = COL 
	void A() {
		System.out.println("Draw Pitcure ");
	}
	void A(int r) {
		System.out.println("Circle :   "+ (2 *3.14 * r));
	}
	void A(int l, int b) {
		System.out.println("REctanfle :"+ (l * b ));
	}
	void draw() {
		System.out.println("Draw Pitcure ");
	}
	void draw(int r) {
		System.out.println("Circle :   "+ (2 *3.14 * r));
	}
	void draw(int l, int b) {
		System.out.println("REctanfle :"+ (l * b ));
	}
	//same method name + diff par + in same class = MOL 
}
public class Demo1 {
	public static void main(String[] args) {
			A a = new A();
			a.draw();
			a.draw(10);
			a.draw(20,50);
	}

}
