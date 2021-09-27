package test;

import java.util.Scanner;

public class boj11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		// t는 몇번 반복해줄건지

		sc.nextLine();
		String[][] arr = new String[t][2];

		// 나눈 입력받은 t번만큼 반복해주겠다

		for (int i = 0; i < t; i++) { // 기원 : 배열 0 ~ t-1 까지라서 i=0, i<t로 바꿔줘야함

			arr[i] = sc.nextLine().split(" ");

		}

		// 입력받은 값을 출력받겠다

		for (int i = 0; i < t; i++) { // 기원 : 여기 i=0부터 시작, i<t로 바꿔줌

			System.out.printf("Case #%d: %s + %s = %d\n",

					// 기원 : 1,2,3번째는 굳이 int 처리안해줘도 됨

					// 기원 : for문에서 i=0으로 바뀜에 따라, i => i+1 로 변경

					i + 1, arr[i][0], arr[i][1], Integer.parseInt(arr[i][0]) + Integer.parseInt(arr[i][1]));

		}

	}

}
