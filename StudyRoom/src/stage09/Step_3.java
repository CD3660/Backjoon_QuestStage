package stage09;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int a = scan.nextInt();
			if (a == -1) {
				break;
			}
			String str = "";
			int sum = 0;
			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					sum += i;
					str += (i+" ");
				}
			}
			
			String[] arr = str.split(" ");
			
			if (sum == a) {
				System.out.print(a+" = ");
				for (int i=0; i<arr.length; i++) {
					if (i==arr.length-1) {
						System.out.println(arr[i]);
					} else {
						System.out.print(arr[i]+" + ");
					}
				}
			} else {
				System.out.println(a+" is NOT perfect.");
			}
		}
	}
}
