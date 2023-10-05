package stage09;

import java.util.Scanner;

public class Step_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a= scan.nextInt();
		int b= scan.nextInt();
		
		int count=0;
		int show=0;
		for (int i=1; i<=a; i++) {
			if(a%i==0) {
				count++; 
			}
			if (count==b) {
				show = i;
				break;
			}
		}
		System.out.println(show);
	}
}
