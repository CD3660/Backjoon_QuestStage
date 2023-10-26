package stage20;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Step_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			if (temp.length() >= m) {

				map.put(temp, map.getOrDefault(temp, 0) + 1);

			}
		}

		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
					return Integer.compare(map.get(o2), map.get(o1));
				}
				if (o1.length() != o2.length()) {
					return Integer.compare(o2.length(), o1.length());
				}
				return o1.compareTo(o2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			sb.append(str+"\n");
		}
		bw.write(sb+"");

		bw.flush();
		bw.close();
	}
}
