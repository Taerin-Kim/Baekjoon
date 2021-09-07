package test;

import java.util.Scanner;

public class boj1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		//nextLine - 문자(한줄), nextInt - 숫자
		
		//A B 첫째 줄에  A B 주어짐, A 와 B는 공백한칸으로 구분
		
		//입력1개 받는거
		int a= sc.nextInt();
		//System.out.println(a);
		int b = sc.nextInt();
		//System.out.println(b);
		
		// a가 b보다 클때 '>' 출력
		// a가 b보다 작을때 '<' 출력
		// a가 b보다 같을때 == 출력
		
		if(a>b) {
			System.out.println(">");
		} else if (a<b) {
			System.out.println("<");	
		} else if (a==b) {
			System.out.println("==");
		}
		
	}

}
