package stage06;

import java.util.Scanner;

public class Step_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		
		int length = scan.nextInt();
		String[] strArr = new String[length];
		int count =0;
		
		for (int i=0; i<length; i++) {
			strArr[i]= scan.next();
		}
		for (int i=0; i<length; i++) {
			if (groupWord(strArr[i])) {
				count++;
			}
		}
		System.out.println(count);
		
		
		

		
	}
	public static boolean groupWord(String str) {
		char[] charArr = new char[str.length()];
		for (int i=0; i<str.length(); i++) {
			charArr[i]=str.charAt(i);
		}
		for (int i=0; i<str.length()-1; i++) {
			if (charArr[i]==charArr[i+1]) {
				charArr[i]='0';
			}
		}
		String str2 = "";
		for (int i=0; i<str.length(); i++) {
			if (charArr[i]!='0') {
				str2+=charArr[i];
			}
		}
		char[]charArr2 = new char[str2.length()];
		for (int i=0; i<str2.length();i++) {
			charArr2[i]=str2.charAt(i);
		}
		for (int i=0; i<str2.length(); i++) {
			for (int j=i; j<str2.length(); j++) {
				if (charArr2[i]==charArr2[j]&&i!=j) {
					return false;
				}
			}
		}
		return true;
	}
}
