package stage16;

import java.io.*;
import java.util.*;

public class Step_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> card = new ArrayDeque<Integer>();
		for (int i=0; i<n; i++) {
			card.offer(i+1);
		}
		while(card.size()!=1) {
			card.removeFirst();
			card.offer(card.poll());	
		}
		bw.write(card.getFirst()+"\n");
		
		bw.flush();
		bw.close();
	}
}
