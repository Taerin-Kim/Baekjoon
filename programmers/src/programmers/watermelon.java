package programmers;

import java.util.Scanner;

public class watermelon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		 //i는 나열되는 문자..갯수
		for (int i = 0; i < input; i++) {
			
			String a = "수";
			String b = "박";

			if (i % 2 != 0) { // 홀수일때
				System.out.printf(b); //3을 입력 받았을 때 수수수 가 나옴 우리가 원하는건 수박수 임... 배열에 넣으면 [] 형태로 나옴
				//어떤 방법이 좋을까....
				//답은 input은 고정, i는 가변**
			} else { // 짝수일때
				System.out.printf(a);
			}
		}
//		
//		for (int i=0; i<input; i++) {
//			if (i % 2 == 0) {
//				System.out.print("수");
//			} else {
//				System.out.print("박");
//			}
//		}
		
	}

}
