package interfac;


















interface I
{
	int a;
	public static final int x=100;
	I(){		
	}
	void abc() {
		// withbody no	
	}
	void aaa();
	abstract void xyz();
	public abstract void a();
}
interface J 
{

}
interface K extends J,I
{	
}
public class Demo1 {
	public static void main(String[] args) {
		I i = new I();
	}
}
	