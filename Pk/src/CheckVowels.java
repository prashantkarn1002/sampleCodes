import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check:");
		String s1 = sc.nextLine();
		int l1 = s1.length();
		int countTot=0,countA=0,countE=0,countI=0,countO=0,countU=0;
		for(int i=0;i<l1;i++){
			String s2= ""+s1.charAt(i);
			if(s2.equalsIgnoreCase("a")){
				countA = countA + 1;
				countTot = countTot + 1;
			} else if(s2.equalsIgnoreCase("e")){
				countE = countE + 1;
				countTot = countTot + 1;
			} else if(s2.equalsIgnoreCase("i")){
				countI = countI + 1;
				countTot = countTot + 1;
			} else if(s2.equalsIgnoreCase("o")){
				countO = countO + 1;
				countTot = countTot + 1;
			} else if(s2.equalsIgnoreCase("u")){
				countU = countU + 1;
				countTot = countTot + 1;
			}
		}
		if(countTot>0){
			System.out.println("Total number of vowels present: "+countTot);
			if(countA>0){
				System.out.println("Total count of vowel A in String is: "+countA);
			} else if(countE>0){
				System.out.println("Total count of vowel E in String is: "+countE);
			} else if(countI>0){
				System.out.println("Total count of vowel I in String is: "+countI);
			} else if(countO>0){
				System.out.println("Total count of vowel O in String is: "+countO);
			} else if(countU>0){
				System.out.println("Total count of vowel U in String is: "+countU);
			}
		} else{
			System.out.println("No vowels present");
		}
	}
}
