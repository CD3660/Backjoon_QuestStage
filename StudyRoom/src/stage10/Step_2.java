package stage10;

import java.util.Scanner;

public class Step_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();

		int[] arr = { x, y, (w - x), (h - y) };
		int low = arr[0];
		for (int i=0; i<4; i++) {
			if(arr[i]<low) {
				low=arr[i];
			}
		}
		System.out.println(low);
	}
}
