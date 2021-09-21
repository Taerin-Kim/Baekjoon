package test;

import java.util.Scanner;

public class boj11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 1번
		sc.nextLine();
		// 배열의 길이 t만큼
		String[][] arr = new String[t][2];

		// 반복-반복문 for t번 반복,

		for (int i = 0; i < t; i++) { // 2번
			arr[i] = sc.nextLine().split(" ");	
			//System.out.println(arr[i][0] + " " + arr[i][1]);
		}

		// 3번
		for (int i = 0 ; i < t; i++) {
			System.out.printf("Case #%d: %d\n", i+1, Integer.parseInt(arr[i][0])+Integer.parseInt(arr[i][1]));

		}

		// A+B =
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

		// System.out.printf("Case #%d", n);

	}

}
