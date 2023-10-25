package stage16;

import java.io.*;
import java.util.*;

public class Step_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Deque<Integer> man = new ArrayDeque<Integer>();
		for (int i=0; i<n; i++) {
			man.offer(i+1);
		}
		bw.write("<");
		while(man.size()>1) {
			for(int i=0;i<k-1;i++) {
				man.offer(man.poll());
			}
			bw.write(man.poll()+", ");
		}
		bw.write(man.poll()+">");
		
		
		
		bw.flush();
		bw.close();
	}
}
