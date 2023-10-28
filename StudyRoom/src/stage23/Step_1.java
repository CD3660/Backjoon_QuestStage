package stage23;

import java.io.*;
import java.util.*;

public class Step_1 {
	static int a;
	static int b;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f1(n);
		f2(n);
		System.out.println(a + " " + b);
	}

	public static int f1(int n) {
		if (n == 1 || n == 2) {
			a++;
			return 1;
		}
		return f1(n - 2) + f1(n - 1);
	}

	public static int f2(int n) {
		int[] f2Arr = new int[n];
		f2Arr[0] = 1;
		f2Arr[1] = 1;
		for (int i = 2; i < n; i++) {
			b++;
			f2Arr[i] = f2Arr[i - 2] + f2Arr[i - 1];
		}
		return f2Arr[n - 1];
	}
}