package stage16;

import java.io.*;
import java.util.*;

public class Step_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Boolean> vps = new Stack<>();
		while (true) {
			String str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			vps.clear();
			boolean temp = true;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					vps.push(true);
				} else if (str.charAt(j) == '[') {
					vps.push(false);
				} else {
					if (str.charAt(j) == ')') {
						if (vps.empty()) {
							temp = false;
							break;
						}
						if (vps.peek() == false) {
							temp = false;
							break;
						} else {
							vps.pop();
						}
					}
					if (str.charAt(j) == ']') {
						if (vps.empty()) {
							temp = false;
							break;
						}
						if (vps.peek() == true) {
							temp = false;
							break;
						} else {
							vps.pop();
						}
					}
				}
			}
			if (temp && vps.empty()) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}

		bw.flush();
		bw.close();
	}
}
