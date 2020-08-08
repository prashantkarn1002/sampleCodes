import java.util.LinkedList;

public class LinkedListEg {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Java");
		l1.add("is");
		l1.add("very");
		l1.add("secured");
		System.out.println("Add: "+l1);
		l1.add(1, "also");
		System.out.println("Add: "+l1);
		l1.add("very");
		System.out.println("Add: "+l1);
		l1.remove(1);
		System.out.println("Add: "+l1);
		l1.remove("very");
		System.out.println("Add: "+l1);
		
	}
}
