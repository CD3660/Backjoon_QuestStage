package stage06;

import java.util.Scanner;

public class Step_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		char[] spell = new char[str.length()];
		
		for (int i=0; i<str.length(); i++) {
			spell[i] = str.charAt(i);
		}
		
		int show=1;
		
		
		
		for (int i=0; i<str.length(); i++) {
			if (spell[i] != spell[str.length()-1-i]) {
				show = 0;
			}
		}
		System.out.println(show);
	}
}