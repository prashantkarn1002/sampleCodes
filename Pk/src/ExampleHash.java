import java.util.*;

public class ExampleHash {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		
		//Already existing students
		System.out.println("Please enter the current strength of Class: ");
		int length = sc.nextInt();
		for(int i=0;i<length;i++){
			hm.put(sc.nextInt(), sc.next());
		}
		System.out.println("Present Students:");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+". "+m.getValue());
		}
		
		//Newly Joined Students
		System.out.println("Any newly joined students Y/N: ");
		String yN = sc.next();
		if(yN.equalsIgnoreCase("y")){
			HashMap<Integer, String> hm1 = new HashMap<Integer,String>();
			System.out.println("Please Enter the number of newly joined students: ");
			int length1 = sc.nextInt();
			for(int i=0;i<length1;i++){
				hm1.put(sc.nextInt(), sc.next());
			}
			System.out.println("Newly Added Students: ");
			for(Map.Entry m:hm1.entrySet()){
				System.out.println(m.getKey()+". "+m.getValue());
			}
			length = length + length1; 
		}
		System.out.println("Total Strength of Students: "+length);
	}
}
