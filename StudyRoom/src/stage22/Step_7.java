package stage22;

import java.io.*;
import java.util.*;

public class Step_7 {
	static int[] arr;
	static int[] arrCalc;
	static int[] calc = new int[4];
	static int max;
	static int min;
	static int temp;
	static boolean First;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int[Integer.parseInt(br.readLine())];
		arrCalc = new int[arr.length-1];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			calc[i] = Integer.parseInt(st.nextToken());
		}
		find(0);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void find(int idx) {
		if(idx == arr.length-1) {
			temp = arr[0];
			for(int i=0; i<arrCalc.length; i++) {
				temp = calc(temp, arr[i+1], arrCalc[i]);
			}
			if(!First) {
				max = temp;
				min = temp;
				First = true;
			} else if(temp>max) {
				max = temp;
			} else if(temp<min) {
				min = temp;
			}
		}
		for(int i=0; i<4; i++) {
			if(calc[i]==0) {
				continue;
			}
			calc[i]--;
			arrCalc[idx] = i;
			find(idx+1);
			calc[i]++;
		}
	}
	
	public static int calc(int a, int b, int type) {
		switch (type) {
		case 0:
			return a+b;
		case 1:
			return a-b;
		case 2:
			return a*b;
		case 3:
			return a/b;
		default:
			return 0;
		}
	}

}
