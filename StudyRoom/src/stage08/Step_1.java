package stage08;

import java.util.Scanner;

public class Step_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int num = scan.nextInt();
		int length =str.length();
		char[] numbers = new char[length];
		for (int i=0; i<length; i++) {
			numbers[i]=str.charAt(i);
		}
		int[] numbers2 = new int[length];
		for (int i=0; i<length; i++) {
			if((numbers[i]+0)>=65&&(numbers[i]+0)<=90) {
				numbers2[i]=numbers[i]-55;
			} else {
				numbers2[i] = numbers[i]-48;
			}
		}
		int sum=0;
		for (int i=0; i<length; i++) {
			int a = (int)(Math.pow(num, length-i-1));
			sum +=(numbers2[i]*a);			
		}
		System.out.println(sum);
	}
}
