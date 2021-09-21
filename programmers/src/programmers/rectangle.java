package programmers;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" "); // 배열로 나눠주기

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		// 가로n 세로m
		//m줄
		//별 n개
		
		//줄수 
		for(int i = 0; i< m ; i++) {
			//별수
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
	}

}
