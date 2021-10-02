package programmers;

import java.util.Scanner;

public class phone_number {

	public static void main(String[] args) {
		// subString 사용하기
		// s는 4자리 이상 20 자리 미만
		System.out.println("핸드폰 번호를 숫자만 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();

	}

	private String solution(String phone_number) {
		String answer = "";

		int n = phone_number.length() - 4;
		for (int i = 0; i < n; i++) {
			answer += "*";
		}
		
		return answer;

		// 끝에서4글자 전까지for 문을 돌려 “*”을 찍고 String 의 + 성질을 이용

		// toCharArray를 사용한 경우도 있음

	}

}
