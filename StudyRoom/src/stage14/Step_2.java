package stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] strArr = new String[n];
		for (int i=0; i<n; i++) {
			strArr[i]=br.readLine();
		}
		int count =0;
		for (int i=0; i<m; i++) {
			String temp = br.readLine();
			for (int j=0; j<n; j++) {
				if(temp.equals(strArr[j])) {
					count++;
					break;
				}
			}
		}
		bw.write(count+"");

		bw.flush();
		bw.close();
	}
}
