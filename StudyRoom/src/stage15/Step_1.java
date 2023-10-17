package stage15;

import java.io.*;
import java.util.*;

public class Step_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			int a=arr[i][0];
			int b=arr[i][1];
			int t=1;
			int count = 2;
			while(true) {
				if(a%count==0&&b%count==0) {
					a/=count;
					b/=count;
					t*=count;
				} else {
					count++;
				}
				if(count>a||count>b||a==1||b==1) {
					break;
				}
			}
			bw.write(a*b*t+"\n");
		}
		bw.flush();
		bw.close();
	}
}
