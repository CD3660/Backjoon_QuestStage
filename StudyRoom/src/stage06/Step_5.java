package stage06;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int length = str.length();
		
		char[] alp = new char[length];
		int[] count = new int[26];
		
		for (int i=0; i<length; i++) {
			alp[i] = str.charAt(i);
		}
		
		for (int i=0; i<length; i++) {
			for (int j=0; j<26; j++) {
				int a = alp[i];
				if (a==j+65) {
					count[j]++;
					break;
				}
				if (a==j+97) {
					count[j]++;
					break;
				}
			}
		}
		
		int max = 0;
		int error = 0;
		int show = 0;
		
		for (int i=0; i<26; i++) {
			if (count[i]>max) {
				max = count[i];
			}
		}
		for (int i=0; i<26; i++) {
			if (count[i]==max) {
				show=i;
				error++;
			}
		}
		
		
		
		if (error>1) {
			System.out.println("?");
		} else {
			char a = (char)(show+'A');
			System.out.println(a);
		}
		
	}
}