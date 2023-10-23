package stage16;

import java.io.*;
import java.util.*;

public class Step_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Boolean> vps = new Stack<>();
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			vps.clear();
			boolean temp=true;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='(') {
					vps.push(true);
				} else {
					if(vps.empty()) {
						temp=false;
						break;
					}
					vps.pop();
				}
			}
			if(temp&&vps.empty()) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
