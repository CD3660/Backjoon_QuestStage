package stage25;

import java.io.*;
import java.util.*;

public class Step_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] meet = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			meet[i][0] = Integer.parseInt(st.nextToken());
			meet[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(meet, (o1, o2)->{
			if(o1[1]==o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			}
			return Integer.compare(o1[1], o2[1]);
		});
		
		int result = 0;
		int end = 0;
		for(int i=0; i<n; i++) {
			if(end<=meet[i][0]) {
				end = meet[i][1];
				result++;
			}
		}
		System.out.println(result);
		
	}
}