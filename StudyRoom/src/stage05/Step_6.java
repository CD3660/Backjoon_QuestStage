package stage05;

import java.util.Scanner;

public class Step_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		int[] intArr1 = new int[26];
		int[] intArr2 = new int[str.length()];		
		
		for (int i = 0; i < 26; i++) {//intArr1에 -1 모두 부여함.
			intArr1[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {//intArr2에 문자에 해당하는 아스키 코드 값 저장
			char alp = str.charAt(i);
		
			intArr2[i] = alp;
		}
		
		for (int i = 0; i < 26; i++) {//a부터 반복문 작성
			for (int j = 0; j < str.length(); j++) {//알파벳 하나를 정하고 intArr2의 값이 알파벳과 같아지면 intArr1에 j값을 부여함.
				if (intArr2[j] == i + 97) {//intArr2의 j번째 알파벳이 i+97과 같은 경우
					intArr1[i] = j;//intArr1[i] i번째 알파벳이 처음으로 등장한 지점 이 j번째라고 입력하기
					break;
				}
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(intArr1[i] + " ");
		}

	}
}
// a = 97 z = 122