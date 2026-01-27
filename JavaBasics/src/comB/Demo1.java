package comB;
// aquaring the proprty from parent to Child 
// parent----- SUper ------BASE 
class Parent
{
	int site = 5 ; 
	int money = 100000;
	String car="BMW";
	String land =" 5 acer";
	private int brush = 2 ;	
	void use() {
		System.out.println("SITE :" + site);
		System.out.println("Money :" + money);
		System.out.println("CAR : "+ car);
	}
}
// child ------- SUB ---------- DERIVED 
class Child  extends Parent
{
	int money = 5000;
	void use() {
		System.out.println("SITE :" + site);
		System.out.println("Money :" + money);
		System.out.println("Parent Money :" + super.money);

		System.out.println("TOTAL Money :" +(super.money +   money));
		System.out.println("CAR : "+ car);
		//System.out.println("parent Brush " + brush);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Parent p = new Parent();		p.use();
		System.out.println("================");
		Child c = new Child();		c.use();
	}
}
