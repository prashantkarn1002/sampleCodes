import java.util.Scanner;
import java.util.regex.Pattern;

public class MatrixPathCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter total columns: ");
		int columns= sc.nextInt();
		System.out.println("Enter matrix elements: ");
		String m[][] = new String[rows][columns];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				m[i][j] = sc.next();
			}
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if(j == 0)
					System.out.print(m[i][j]);
				else
					System.out.print("\t" + m[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Enter the row to start count: ");
		int rs = sc.nextInt();
		System.out.println("Enter the column to start count: ");
		int cs = sc.nextInt();
		System.out.println("Enter the row to end count: ");
		int re = sc.nextInt();
		System.out.println("Enter the column to end count: ");
		int ce = sc.nextInt();
		int count = 0;
		for(int i=rs; i<=re; i++) {
			for(int j=cs; j<=ce; j++) {
				if(!Pattern.matches("[a-zA-z]", m[i][j])) {
					count = count + Integer.parseInt(m[i][j]);
				} else {
					i = i + 1;
					j = j - 1;
					count = count + Integer.parseInt(m[i][j]);
				}
				if(j == ce) {
					i = i + 1;
					count = count + Integer.parseInt(m[i][j]);
				}
				if(j == ce && i == re) {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
