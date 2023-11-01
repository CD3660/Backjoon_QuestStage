package stage25;

import java.io.*;
import java.util.*;

public class Step_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int result = 0;
		for(int i=0; i<n; i++) {
			result += arr[i]*(n-i);
		}
		System.out.println(result);
		
	}
}