package stage21;

import java.io.*;
import java.util.*;

public class Step_4 {
	static int[] temp;
	static int count = 0;
	static int test;
	static int show = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		test = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		temp = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		merge_sort(arr, 0, n - 1);
		bw.write(show + "\n");

		bw.flush();
		bw.close();
	}

	public static void merge_sort(int[] arr, int left, int right) {
		if (count == test) {
			return;
		}
		if (left < right) {
			int middle = (left + right) / 2;
			merge_sort(arr, left, middle);
			merge_sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

	public static void merge(int[] arr, int left, int middle, int right) {
		int i = left, j = middle + 1, k = left;
		while (i <= middle && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		} // temp[k]부터 마지막까지 값을 넣는다. 넣는 값은 arr[i]와 arr[j]의 값을 비교해 작은 쪽을 넣는다.
		while (i <= middle) {
			temp[k++] = arr[i++];
		}
		while (j <= right) {
			temp[k++] = arr[j++];
		} // 두 파츠 중 한 쪽이 완료 된 경우 나머지 한 쪽의 결과를 배열에 담음
		for (i = left; i <= right; i++) {
			count++;
			if (count == test) {
				show = temp[i];
				return;
			}

			arr[i] = temp[i];
		}
	}
}