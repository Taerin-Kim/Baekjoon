package programmers;

import java.util.Scanner;

public class Even_Odd3 {

	public static String main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String answer = "";

		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}

		return answer;
		
		//프로그래머스 런타임에러뜸
	}

}
