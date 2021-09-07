package test;

import java.util.Scanner;

public class boj1330_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); //입력받는 명령코드
		
		String input = sc.nextLine(); //공백포함한 문자열 받아오는것
		String[] arr = input.split(" ");   //나눌때 split 나눠서 배열로 만들어짐
		//String[] arr 스트링 배열, 변수명 arr

		
		//<반복문으로 인덱스 길이만큼 해서 반복해주기 - 동적..>
		//System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//입력1개 받는거
		int a= Integer.parseInt(arr[0]);
		//System.out.println(a);
		int b = Integer.parseInt(arr[1]);
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
