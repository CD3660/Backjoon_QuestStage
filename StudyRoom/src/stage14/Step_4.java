package stage14;

import java.io.*;
import java.util.*;

public class Step_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[][] strArrN = new String[n][2];
		String[][] strArrM = new String[m][2];
		for (int i=0; i<n; i++) {
			strArrN[i][0] = br.readLine();
			strArrN[i][1] = i+1+"";
		}
		for (int i=0; i<m; i++) {
			strArrM[i][0]=br.readLine();
			strArrM[i][1]=""+i;
		}
		String[] tempArr = new String[n];
		for (int i=0; i<n; i++) {
			tempArr[i]=strArrN[i][0];
		}
		Arrays.sort(strArrN, (o1, o2)->{
			return o1[0].compareTo(o2[0]);
		});
		Arrays.sort(strArrM, (o1, o2)->{
			return o1[0].compareTo(o2[0]);
		});
		int count =0;
		for (int i=0; i<m; i++) {
			try {
				int a = Integer.parseInt(strArrM[i][0]);
				strArrM[i][0]=tempArr[a-1];
			} catch (Exception e) {
				while (true) {
					if(strArrN[count][0].equals(strArrM[i][0])) {
						strArrM[i][0]=strArrN[count][1];
						break;
					} else {
						count++;
					}
				}
			}
		}
		Arrays.sort(strArrM, (o1, o2)->{
			return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
		});
		for (int i=0; i<m; i++) {
			bw.write(strArrM[i][0]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
