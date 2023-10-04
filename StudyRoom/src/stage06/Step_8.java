package stage06;

import java.util.Scanner;

public class Step_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] strArr = new String[20];

		for (int i = 0; i < 20; i++) {
			strArr[i] = scan.nextLine();
		}
		String[] strGrade = new String[20];
		String[] strScore = new String[20];

		for (int i = 0; i < 20; i++) {
			String temp;
			temp = strArr[i].substring(strArr[i].length() - 2);
			temp = temp.replace(" ", "");
			strGrade[i] = temp;
		}
		for (int i = 0; i < 20; i++) {
			String temp;
			temp = strArr[i].substring(strArr[i].length() - 6, strArr[i].length() - 2);
			temp = temp.replace(" ", "");
			strScore[i] = temp;
		}

		String[] grade = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P" };
		String[] score = { "4.5", "4.0", "3.5", "3.0", "2.5", "2.0", "1.5", "1.0", "0", null };
		double sumGrade = 0.0000;
		double sumScore = 0.0000;

		for (int i = 0; i < 20; i++) {
			double dd = Double.parseDouble(strScore[i]);
			int pass = 0;
			for (int j = 0; j < 10; j++) {
				try {
					if (strGrade[i].equals(grade[j])) {
						double d = Double.parseDouble(score[j]);
						sumGrade += (d * dd);
					}
				} catch (Exception e) {
					pass++;
				}
			}
			if (pass == 0) {
				sumScore += dd;
			}
		}
		System.out.println(sumGrade / sumScore);

	}
}
