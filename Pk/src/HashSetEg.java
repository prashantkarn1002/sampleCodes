import java.util.*;

public class HashSetEg {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("Arun");
		hset.add("Jay");
		hset.add("Pravin");
		hset.add("Xyz");
		Iterator<String> itr = hset.iterator();
		System.out.println(hset);
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		HashSet<String> hset1 = new HashSet<String>();
		hset1.add("Pratik");
		hset1.add("Jay");
		hset1.add("Ronak");
		hset.addAll(hset1);
		System.out.println(hset);
		hset.removeAll(hset);
		System.out.println(hset);
	}
}