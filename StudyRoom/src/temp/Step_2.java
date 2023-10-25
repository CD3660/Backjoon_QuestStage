package temp;

import java.io.*;
import java.util.*;

public class Step_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		HashMap<String, Boolean> user = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String chat = br.readLine();
			if (chat.equals("ENTER")) {
				count += user.size();
				user.clear();
			} else {
				user.put(chat, true);
			}
			if (i == n - 1) {
				count += user.size();
			}
		}
		bw.write(count + "\n");

		bw.flush();
		bw.close();
	}
}