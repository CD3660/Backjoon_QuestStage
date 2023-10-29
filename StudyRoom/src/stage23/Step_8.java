package stage23;

import java.io.*;
import java.util.*;

public class Step_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		int[][] max = new int[n][2];
		if (n > 1) {
			max[0][0] = arr[0];
			max[0][1] = arr[0];
			max[1][0] = arr[0] + arr[1];
			max[1][1] = arr[1];
			if (n > 2) {
				for (int i = 2; i < n; i++) {// 0은 이전과 연속하여 최대값, 다음 값 최대값 구할 때 사용할 수 없음, 1은 이전을 건너뛴 최대값
					max[i][0] = max[i - 1][1] + arr[i];
					max[i][1] = max(max[i - 2][0], max[i - 2][1]) + arr[i];
				}
			}
			System.out.println(max(max[n - 1][0], max[n - 1][1]));
		} else {
			System.out.println(arr[0]);
		}
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}