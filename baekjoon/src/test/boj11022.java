package test;

import java.util.Scanner;

public class boj11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//t는 몇번 반복해줄건지
		sc.nextLine();
		
		String[][] arr = new String[t][2];
		
				
		//나눈 입력받은 t번만큼 반복해주겠다
		for(int i = 1; i <= t; i++) {
			arr[i] = sc.nextLine().split(" ");	
		}
		//입력받은 값을 출력받겠다
		for(int i = 1; i <= t; i++) {
			
			System.out.printf("Case #%d: %d + %d = %d\n", i, Integer.parseInt(arr[i][0]), Integer.parseInt(arr[i][1]),Integer.parseInt(arr[i][0])+Integer.parseInt(arr[i][1]) );
			
		}


	}

}
