package programmers;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" "); // 입력받은 문자열을 바로 빈칸으로 구분해서 나누어 배열값으로 넣어주기

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		// 가로n 세로m
		//m줄수
		//n 별갯수
		
		//줄수 먼저
		for(int i = 0; i< m ; i++) {
			//그다음 별수
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
	}

}
