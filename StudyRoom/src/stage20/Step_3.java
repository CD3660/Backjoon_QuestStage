package stage20;

import java.io.*;
import java.util.*;

public class Step_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Boolean> man = new HashMap<>();
		man.put("ChongChong", true);
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String man1 = st.nextToken();
			String man2 = st.nextToken();
			if(man.containsKey(man1)) {
				man.put(man2, true);
			} else if(man.containsKey(man2)) {
				man.put(man1, true);
			}
		}
		bw.write(man.size()+"\n");

		bw.flush();
		bw.close();
	}
}
