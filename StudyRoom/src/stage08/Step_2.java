package stage08;

import java.util.Scanner;

public class Step_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		String re = "";

		int i = num1;
		while (true) {
			if (i % num2 == 0&& i/num2==0) {
				break;
			}
			if (10 <= (i % num2) && (i % num2) <= 36) {
				char char1 = (char) (i % num2 + 55);
				re += char1;
			} else {
				re += (i % num2);
			}
			i = i / num2;
		}
		char[] arr = new char[re.length()];
		for (int j=0; j<re.length(); j++) {
			arr[j]=re.charAt(re.length()-j-1);
		}
		
		re="";
		for (int j=0; j<arr.length; j++) {
			re=re+arr[j];
		}
		System.out.println(re);
	}
}
