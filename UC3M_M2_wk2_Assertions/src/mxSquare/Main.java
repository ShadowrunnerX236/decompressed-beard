package mxSquare;

public class Main {
	
	public static void main(String[] args) {
	int n=5;
	int [][] mx = new int [n][n];
	
	for (int i=n-1; i >= 0; i--) {
		System.out.println();
	    for (int j=0; j < n; j++) {
	        if (i < j) {
	            mx[i][j] = 0;
	        } else if (i == j) {
	            mx[i][j] = 1;
	        } else {
	            mx[i][j] = 2;
	        }
	        System.out.print(mx[i][j]);
	   }
	}
	}
}
