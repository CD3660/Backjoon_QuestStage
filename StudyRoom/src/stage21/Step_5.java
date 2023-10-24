package stage21;

import java.io.*;
import java.util.*;

public class Step_5 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			int temp = sc.nextInt();
			boolean[] cant = new boolean[(int) Math.pow(3, temp)];
			cantMaker(cant, 0, cant.length-1);
			sb = sb.delete(0, sb.length());
			for (int j = 0; j < cant.length; j++) {
				if (cant[j]) {
					sb.append("-");
				} else {
					sb.append(" ");
				}
			}
			System.out.println(sb.toString());
		}
	}

	public static void cantMaker(boolean[] cant, int left, int right) {
		if (right - left > 3) {
			cantMaker(cant, 0, cant.length / 3-1);
			cantMaker(cant, cant.length / 3 * 2, cant.length-1);
		} else if (right - left < 2) {
			cant[0] = true;
		} else {
			draw(cant, left, right);
		}
	}

	public static void draw(boolean[] cant, int left, int right) {
		cant[left] = true;
		cant[right] = true;
	}

}