package comA;

public class Demo1 {
	public static void main(String[] args) {
		String n1= "Suresh";
		String n2="Suresh";
		String n3="suresh";
		String n4=new String("Suresh");
		String n5=new String("Suresh");
		System.out.println(n1==n2);
		System.out.println(n1==n3);
		System.out.println(n1==n4);
		System.out.println(n4==n5);			// refrence 
		System.out.println(n4.equals(n5));	// contant or value 
		String name="suResH iS a jAVa trINer  ";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(name.startsWith("s"));
		System.out.println(name.endsWith("Z"));
		System.out.println(name.charAt(0));
		System.out.println(name.equals(name));
		System.out.println(name.equalsIgnoreCase(name));
		System.out.println(name.isEmpty());
		System.out.println(name.replace("s", "Z"));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		String words[]=name.split(" ");
		for(String wrd:words) {
			System.out.println(wrd);
		}
		n1.concat("Kuamr");		// string is immutable / we cant chage 
		System.out.println(n1);
		StringBuffer sb= new StringBuffer("Developer");// mutbale we can modify 
		System.out.println(sb);		
		sb.append("Sr ");		System.out.println(sb);
		sb.insert(0,"Sr ");		System.out.println(sb);
		sb.delete(0, 3);		System.out.println(sb);
		sb.reverse();			System.out.println(sb);
		
		
	}
}
