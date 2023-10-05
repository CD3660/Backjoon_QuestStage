package stage08;

import java.util.Scanner;

public class Step_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();
		
		int h= v-a;
		int d= h/(a-b)+1;
		if (v==a) {
			d=1;
		} else if(h%(a-b)>0) {
			d++;
		}
		
		System.out.println(d);
	}
}