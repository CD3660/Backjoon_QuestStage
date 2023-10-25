package temp;

import java.io.*;
import java.util.*;

public class Step_3 {
	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		pick(0);
		System.out.println(sb.toString());
	}

	public static void pick(int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				if (i != m - 1) {
					sb.append(arr[i] + " ");
				} else {
					sb.append(arr[i] + "\n");
				}
			}
		} else {
			for (int i = 0; i < n ; i++) {
				arr[idx] = i + 1;
				pick(idx + 1);

			}
		}
	}
}
