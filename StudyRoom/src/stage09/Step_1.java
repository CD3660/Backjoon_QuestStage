package stage09;

import java.util.Scanner;

public class Step_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str="";
		while (true) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			if (a==0&&b==0) {
				break;
			}
			if(a/b>0&&a%b==0) {
				str+="m";
			} else if (b/a>0&&b%a==0){
				str+="f";
			} else {
				str+="n";
			}		
		}
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='m') {
				System.out.println("multiple");
			} else if (str.charAt(i)=='f') {
				System.out.println("factor");
			} else {
				System.out.println("neither");
			}
		}
	}
}
