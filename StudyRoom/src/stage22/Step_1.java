package stage22;

import java.io.*;
import java.util.*;

public class Step_1 {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		arr = new int[m];
		check = new boolean[n];
		
		find(0);

		System.out.println(sb.toString());
	}
	public static void find(int index) {
		if(index==m) {
			for(int i=0; i<m; i++) {
				if(i!=m-1) {
					sb.append(arr[i]+1+" ");
				} else {
					sb.append(arr[i]+1+"\n");
				}
			}
		} else {
			for(int i=0; i<n; i++) {
				if(check[i]) {
					continue;
				} else {
					check[i] = true;
					arr[index] = i;
					find(index+1);
				}
				check[i]=false;
			}
		}
	}
}