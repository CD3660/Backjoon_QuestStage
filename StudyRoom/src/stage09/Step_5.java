package stage09;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		

		int sumPrime=0;
		int primeMin=0;
		
		for (int i=m; i<=n; i++) {
			int fact = 0;
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					fact++;
				}
				if (fact>2) {
					break;
				}
			}
			if (fact==2) {
				sumPrime+=i;
				if(primeMin==0) {
					primeMin=i;
				}
			}
		}
		if (primeMin>0) {
		System.out.println(sumPrime);
		System.out.println(primeMin);
		} else {
			System.out.println("-1");
		}
	}
}
