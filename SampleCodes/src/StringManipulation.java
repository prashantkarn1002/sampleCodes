import java.util.Scanner;

public class StringManipulation {
	static int count =0;
	
	public void printMatrix(int cnt) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		String[] indStr = str.split(";");
		String[] lockStr = {};
		String[] priceStr = {};
		int rc = 0;
		int cc = 0;
		for(int i=0; i<indStr.length; i++) {
			lockStr = indStr[i].split(":");
			if(i==0)
				System.out.print("\t");
			System.out.print(lockStr[1].substring(1)+"\t");
			if(i == 0) {
				priceStr = lockStr[i].split(",");
				for(int j=0; j<priceStr.length;j++) {
					if(j%2==0) {
						rc = rc +1;
					} else {
						cc = cc + 1;
					}
					
				}
			}
		}
		System.out.println();
		String[][] matrix = new String[rc][cc];
		for(int i=0; i<indStr.length; i++) {
			lockStr = indStr[i].split(":");
			priceStr = lockStr[i].split(",");
			if(i == 0) {
				int col = 0;
				for(int k=0; k<priceStr.length;k++) {
					if(k%2 == 0) {
						matrix[col][i] = priceStr[k];
						col = col + 1;
					}
				}
			}
		}
		for(int i=0; i<indStr.length; i++) {
			lockStr = indStr[i].split(":");
			priceStr = lockStr[0].split(",");
			int row = 0;
			int col = i;
			for(int j=0; j<priceStr.length;j++) {
				if(j%2 != 0) {
					matrix[row][col+1] = priceStr[j];
					row = row +1;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) { 
	         for (int j = 0; j < matrix[i].length; j++) { 
	            System.out.print(matrix[i][j] + "\t");
	         }
	         System.out.println(); 
	      }
	}

}
