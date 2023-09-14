package stage02;

import java.util.Scanner;

public class Step_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}
		if(a == b) {
			System.out.println("==");
		}
		if(a < b){
			System.out.println("<");
		}
	}
}