package stage09;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int i=2;
		while(a!=1) {
			while(true) {
				if(a%i==0&&a!=1) {
					System.out.println(i);
					a/=i;
				} else {
					i++;
					break;
				}
			}
		}
	}
}
