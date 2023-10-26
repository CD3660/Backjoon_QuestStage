package stage21;

import java.util.Scanner;

public class Step_7 {
 
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		sb.append((int) (Math.pow(2, n) - 1)).append('\n');
 
		Hanoi(n, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	public static void Hanoi(int N, int start, int mid, int to) {
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		Hanoi(N - 1, start, to, mid);
    
		sb.append(start + " " + to + "\n");
		Hanoi(N - 1, mid, start, to);
 
	}
}