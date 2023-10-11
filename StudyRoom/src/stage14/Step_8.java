package stage14;

import java.io.*;
import java.util.*;

public class Step_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int length = str.length();
		int show = 0;
		for (int i=1; i<=length; i++) {
			HashMap<String, Integer> hm = new HashMap<>(length);
			for (int j=0; j<=length-i; j++) {
				hm.put(str.substring(j, j+i), 1);
			}
			show+=hm.size();
		}
		bw.write(show+"");
		bw.flush();
		bw.close();
	}
}
