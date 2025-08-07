package wipro;
import java.util.Scanner;

public class arr_matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array size(nxn)");
		int  n = sc.nextInt();
		int [][] matrix = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();			
				}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");		
				}
			System.out.println();
		}
	
		sc.close();
		
	}
}
