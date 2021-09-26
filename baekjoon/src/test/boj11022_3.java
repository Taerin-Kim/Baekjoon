package test;

import java.util.Scanner;

public class boj11022_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 1번
			sc.nextLine();
			// 배열의 길이 t만큼
			int[] arr = new int[t];

			// 반복-반복문 for t번 반복,
			for (int i = 0; i < t; i++) { // 2번
				String[] input = sc.nextLine().split(" ");
				arr[i] = Integer.parseInt(input[0])+ Integer.parseInt(input[1]);
			}

			// 3번
			for (int i = 0 ; i < t; i++) {
				System.out.printf("Case #%d: %d + %d = %d\n", i+1, (arr[0]), (arr[1]), arr[i]);

			}
	}

}
