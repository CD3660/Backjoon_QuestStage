package stage09;

import java.util.Scanner;

public class Step_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		int[] arr= new int[test];
		for (int i=0; i<test; i++) {
			arr[i]=scan.nextInt();
		}
		int count = 0;
		for (int i=0; i<test; i++) {
			int factor = 0;
			for (int j=1; j<=arr[i];j++) {
				if(arr[i]%j==0) {
					factor++;
				}
			}
			if(factor==2) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
