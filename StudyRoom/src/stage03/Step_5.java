package stage03;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = "";
		
		for (int i = scan.nextInt()/4; i>0; i--) {
			a = a + "long ";
		}
		System.out.println(a + "int");
	}
}