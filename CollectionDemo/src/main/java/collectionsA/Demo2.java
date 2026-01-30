package collectionsA;
import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
//		 ArrayList al = new ArrayList();
		LinkedList al = new LinkedList();
		 al.add(100);
		 al.add(456);
		 al.add(666);
		 al.add(777);
		 al.add(1,111);
		 al.add(999);
		 al.add(888);
		 Iterator i =al.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 System.out.println(al.contains(100));
		 System.out.println(al.getFirst());
		 System.out.println(al.getLast());
		 System.out.println(al.get(2));
		 al.remove(2);
		 System.out.println(al);
		 Collections.sort(al);
		 System.out.println(al);
		 Collections.reverse(al);
		 System.out.println(al);
		 System.out.println(al.getFirst());
		 System.out.println(al.getLast());
		 Collections.shuffle(al);
		 System.out.println(al);
		 System.out.println(al.isEmpty());
		 }
}
