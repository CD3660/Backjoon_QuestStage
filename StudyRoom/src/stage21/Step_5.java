package stage21;

import java.io.*;
import java.util.*;

public class Step_5 {
	static StringBuilder cant = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int length = (int) Math.pow(3, 12);
		cantMaker(0, length - 1);
		while (sc.hasNext()) {
			System.out.println(cant.subSequence(0, (int) Math.pow(3, sc.nextLong())));
		}
	}

	public static void cantMaker(int left, int right) {
		int temp = (right - left + 1) / 3;
		if (right - left > 3) {
			cantMaker(left, left + temp - 1);
			blackMaker(left+temp, left+temp*2-1);
			cantMaker(left + temp * 2, right);
		} else {
			draw();
		}
	}
	public static void blackMaker(int left, int right) {
		for(int i = left; i<=right; i++) {
			cant.append(" ");
		}
	}
	public static void draw() {
		cant.append("- -");
	}
}