import java.util.Scanner;

public class study02 {
	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		pick(0, 0);

		System.out.println(sb.toString());
	}

	public static void pick(int idx, int start) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				if (i != m - 1) {
					sb.append(arr[i] + " ");
				} else {
					sb.append(arr[i] + "\n");
				}
			}
		} else {
			for (int i = start; i < n - m + idx + 1; i++) {
				arr[idx] = i + 1;
				pick(idx + 1, i + 1);

			}
		}
	}
}
