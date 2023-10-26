package stage22;

import java.io.*;
import java.util.*;

public class Step_5 {
	static int n;
	static int result = 0;
	static int[] chess;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		chess = new int[n];
		queen(0);

		System.out.println(result);
	}

	public static void queen(int idx) {
		if (idx == n) {
			result++;
		} else {
			check: for (int i = 0; i < n; i++) {
				for (int j = 0; j < idx; j++) {
					if (chess[j] == i) { // 하단 줄
						continue check;
					}
					if (chess[j] + j == i + idx) {// 좌하단 대각선
						continue check;
					}
					if (chess[j] - j == i - idx) {// 우하단 대각선
						continue check;
					}
				}
				chess[idx] = i;
				queen(idx + 1);
			}
		}
	}
}
