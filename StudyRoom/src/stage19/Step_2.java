package stage19;

import java.io.*;
import java.util.*;

public class Step_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(n * (n-1)+"\n");
		bw.flush();
		bw.close();
	}
}