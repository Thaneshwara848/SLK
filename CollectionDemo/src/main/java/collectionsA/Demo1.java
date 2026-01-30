package collectionsA;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
class Dev1{}
public class Demo1 {
	public static void main(String[] args) {
//		List l = new List();// its a interface 
		 ArrayList al = new ArrayList();
		 al.add(100);
		 al.add(456);
		 al.add("Thanesh");
		 al.add(10.7);
		 al.add(true);
		 al.add(new Date());
		 al.add(new Dev1());
		 System.out.println(al);
		 System.out.println("===========");
		 for(int i=0;i<al.size();i++) {
			 System.out.println(al.get(i));
		 }
		 System.out.println("=================");
		 Iterator i =al.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
	}
}
