package comNonAccess;
class Employee
{
	int x =1000; 							// instance var	 
	static String company="SLK";			// statci var 
	static void display() {					// static method 
		System.out.println("Hi DIsplay");
	}
	void abc() {}							// instance method
}
public class Demo1 {

	public static void main(String[] args) {
	
			Employee e = new Employee();
			e.display();
			System.out.println(e.company);
			System.out.println("================");
			Employee.display();
			System.out.println(Employee.company);
	}

}

//		final class , final variable, Final Method 
//		Abstract , Abstract class , ainterface 