package stage25;

import java.io.*;
import java.util.*;

public class Step_4 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String formular = sc.nextLine();
		String temp = "";
		char one;
		int result = 0;
		boolean minus = false;
		for (int i = 0; i < formular.length(); i++) {
			one = formular.charAt(i);
			if(one == '+' || one == '-') {//연산기호가 들어오면 minus가 이전에 등장했는지 여부에 따라 result에 더하거나 뺀다.
				if(minus) {
					result-=Integer.parseInt(temp);
				} else {
					result+=Integer.parseInt(temp);
				}
				if(one == '-') {//-를 받은 이후의 모든 숫자들은 -로 연산한다.
					minus = true;
				}
				temp="";//다음 숫자를 작성하기 위해 temp를 비워준다.
			} else {
				if(one=='0'&&temp.equals("")) {//숫자의 맨 앞에 0이 오는 경우 temp에 이어주지 않는다.
					continue;
				} else {
					temp+=one;
				}
			}
		}
		if(minus) {
			result-=Integer.parseInt(temp);
		} else {
			result+=Integer.parseInt(temp);
		}

		System.out.println(result);

	}
}