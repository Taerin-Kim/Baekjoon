package programmers;

import java.util.Scanner;

public class Even_Odd2 {

	public static void main(String[] args) {
		System.out.println("짝수와 홀수, 정수만 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String a = "Even";
		String b = "Odd";
		
		if(num % 2 == 0) {
			
			System.out.printf("\"%s\"", a);
			
		} else {
			System.out.printf("\"%s\"", b);
		}

	}

}
