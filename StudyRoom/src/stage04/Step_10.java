package stage04;

import java.util.Scanner;

public class Step_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int length;
		length=scan.nextInt();
		double[] Arr1 = new double[length];

		for (int i = 0; i < length; i++) {
			Arr1[i] = scan.nextInt();
		}
		
		double max = 0;
		for (int i = 0; i < length; i++) {
			if (Arr1[i] > max) 	{
				max = Arr1[i];
			}
		}
		
		
		for (int i = 0; i < length; i++) {
			Arr1[i] = Arr1[i]*100/max;
		}
		
		double sum =0;
		for (int i = 0; i < length; i++) {
			sum += Arr1[i];
		}

		System.out.println(sum/length);
		
	}
}