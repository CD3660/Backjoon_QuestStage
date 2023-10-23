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
				try {
					map.put(temp, map.get(temp) + 1);
				} catch (Exception e) {
					map.put(temp, 1);
				}
			}
		}

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (o1.getKey().length() == o2.getKey().length()&&o1.getValue() == o2.getValue()) {
					return o1.getKey().compareTo(o2.getKey());
				} 
				if (o1.getValue() == o2.getValue()) {
					return Integer.compare(o2.getKey().length(), o1.getKey().length());
				} 
				return Integer.compare(o2.getValue(), o1.getValue());
			}
		});
		
		for (Entry<String, Integer> entry : list) {
			bw.write(entry.getKey()+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
