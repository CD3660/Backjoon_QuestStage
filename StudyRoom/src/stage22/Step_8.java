package stage22;

import java.io.*;
import java.util.*;

public class Step_8 {
	static int[][] statBonus;
	static int[] team1;
	static int[] team2;
	static int gap;
	static int temp;
	static int teamCap1;
	static int teamCap2;
	static boolean first = true;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		statBonus = new int[n][n];
		team1 = new int[n / 2];
		team2 = new int[n / 2];
		teamCap1 = n / 2;
		teamCap2 = n / 2;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				statBonus[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		splitTeam(0);
		System.out.println(gap);
	}

	public static void splitTeam(int idx) {
		if (idx == statBonus.length) {
			sumBonus();
			return;
		}
		if (teamCap1 != 0) {
			team1[team1.length - teamCap1] = idx;
			teamCap1--;
			splitTeam(idx + 1);
			teamCap1++;
		}
		if (teamCap2 != 0) {
			team2[team2.length - teamCap2] = idx;
			teamCap2--;
			splitTeam(idx + 1);
			teamCap2++;
		}
	}

	public static void sumBonus() {
		temp = 0;
		for (int i = 0; i < team1.length; i++) {
			for (int j = 0; j < team1.length; j++) {
				temp += statBonus[team1[i]][team1[j]];
			}
		}
		for (int i = 0; i < team2.length; i++) {
			for (int j = 0; j < team2.length; j++) {
				temp -= statBonus[team2[i]][team2[j]];
			}
		}
		temp = Math.abs(temp);
		if (first) {
			gap = temp;
			first = false;
		} else if (gap > temp) {
			gap = temp;
		}
	}
}
