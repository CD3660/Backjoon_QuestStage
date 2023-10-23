package stage16;

import java.io.*;
import java.util.*;

public class Step_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stInt = new Stack<>();
		long sum = 0;
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp==0) {
				stInt.pop();
			} else {
				stInt.push(temp);
			}
		}
		while(!stInt.empty()) {
			sum+=(long)stInt.peek();
			stInt.pop();
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
}
