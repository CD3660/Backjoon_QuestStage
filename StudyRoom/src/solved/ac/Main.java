package solved.ac;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());

		int[][] arrM = new int[m][2];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrM[i][0] = Integer.parseInt(st.nextToken());
			arrM[i][1] = i;
		}
		Arrays.sort(arrN);
		Arrays.sort(arrM, (o1, o2) -> {
			return Integer.compare(o1[0], o2[0]);
		});
		
		int tempN = arrN[0], tempM = arrM[0][0];
		while (true) {
			if (tempN == n - 1 || tempM == m - 1) {
				if(tempN == n - 1 && arrN[tempN]>arrM[tempM][0]) {					
					break;
				}
				if(tempM == m-1 && arrN[tempN]>arrM[tempM][0]) {
					break;
				}
			}
			if(arrN[tempN]==arrM[tempM][0]) {
				tempN++;
				tempM++;
				arrM[tempM][0] = 1;
			} else {
				if(arrN[tempN]>arrM[tempM][0]) {
					tempN++;
				} else {
					arrM[tempM][0] = 0;
					tempM++;
				}
			}
			Arrays.sort(arrM, (o1, o2) -> {
				return Integer.compare(o1[1], o2[1]);
			});
			
		}

		bw.flush();
		bw.close();
	}
}
