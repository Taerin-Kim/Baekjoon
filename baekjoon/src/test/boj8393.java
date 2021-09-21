package test;

import java.util.Scanner;

public class boj8393 {
	public static void main(String[] args) {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램
		// 입력 3, 출력 6

		// 즉, 3 1+2+3

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}
}
