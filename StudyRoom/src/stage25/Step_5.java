package stage25;

import java.io.*;
import java.util.*;

public class Step_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] distance = new long[n - 1];
		long[] oil = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n - 1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			oil[i] = Integer.parseInt(st.nextToken());
		}
		long lowPrice = oil[0];
		long result = 0;
		long tempDistance = 0;
		for(int i=0; i<n-1; i++) {
			tempDistance += distance[i];
			if(lowPrice>oil[i+1]) {
				result+=tempDistance*lowPrice;
				tempDistance=0;
				lowPrice=oil[i+1];
			}
		}
		result+=tempDistance*lowPrice;
		System.out.println(result);
	}
}