package stage12;

import java.util.Scanner;

public class Step_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		int close =0;
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k= j+1; k<n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (m-close>m-sum&&m-sum>=0) {
						close = sum;
					}
				}
			}
		}
		System.out.println(close);
	}
}
