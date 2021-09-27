package test;

import java.util.Scanner;

public class boj11022_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//반복횟수가 안맞음 오답임

		int T = in.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();

			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
		}

		in.close();

	}

}
