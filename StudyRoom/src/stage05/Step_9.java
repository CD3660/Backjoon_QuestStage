package stage05;

import java.util.Scanner;

public class Step_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		String str1 = scan.next();
		String str2 = scan.next();
		String[] strArr1 = str1.split("");
		String[] strArr2 = str2.split("");
		
		String a = "", b="";
		a=strArr1[0];
		b=strArr1[2];
		strArr1[2]=a;
		strArr1[0]=b;
		a=strArr2[0];
		b=strArr2[2];
		strArr2[2]=a;
		strArr2[0]=b;
		str1 = strArr1[0]+strArr1[1]+strArr1[2];
		str2 = strArr2[0]+strArr2[1]+strArr2[2];
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		if (int1>int2) {
			System.out.println(int1);
		} else {
			System.out.println(int2);
		}
		
	}
}