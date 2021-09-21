package test;

import java.util.Scanner;

public class boj11021_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A+B =
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// System.out.printf("Case #%d", n);
		
		int t = sc.nextInt(); // 1번
		sc.nextLine();
		// 배열의 길이 t만큼
		int[] arr = new int[t];

		// 반복-반복문 for t번 반복,

		for (int i = 0; i < t; i++) { // 2번
			String[] input = sc.nextLine().split(" "); // 2 3
			arr[i] = Integer.parseInt(input[0])+ Integer.parseInt(input[1]);
			
		}

		// 3번
		for (int i = 0 ; i < t; i++) {
			System.out.printf("Case #%d: %d\n", i+1, arr[i]);

		}


	}

}
