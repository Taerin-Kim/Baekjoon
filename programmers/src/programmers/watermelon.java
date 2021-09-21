package programmers;

import java.util.Scanner;

public class watermelon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		// i는 나열하는 수 만큼 반복
		for (int i = 0; i < input; i++) {
			String a = "수";
			String b = "박";
			if (input % 2 > 0) { // 나머지가 1일때 즉, 홀수일때

				System.out.printf("%d+%d+%d", a, a + b);
			} else { // 짝수일때
				System.out.printf("%d+%d", a, a + b);
			}
		}
	}

}
