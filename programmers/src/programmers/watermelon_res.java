package programmers;

import java.util.Scanner;

public class watermelon_res {

	public static void main(String[] args) { //메인메서드

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(solution(input)); //메서드에 나온 결과값을 불러옴 스트링으로 (아래 매서드가 스트링이니까)
	}

	public static String solution(int n) { //메서드 리턴타입은 String 
		String res = "";
		// i는 나열되는 문자..갯수
		for (int i = 0; i < n; i++) {

			String a = "수";
			String b = "박";

			if (i % 2 != 0) { // 홀수일때
				res += b;
			} else {
				res += a;
			}
		}
		return res;
	}
}
