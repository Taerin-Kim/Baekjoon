package test;

import java.util.Iterator;
import java.util.Scanner;

public class boj10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//nextint랑 nextLine 오류처리
		sc.nextLine();
		
		// for(int i = t; i>0 ;t--)
		//for(int i=1; i<=t; t++)
		
		int[] arr = new int[t];
		//t번 만큼 입력을 받아줌
		for(int i=0; i<t; i++) {
			String in = sc.nextLine();
			//받아준 입력값을 a, b랑 나눠서 받아줌
			//이때 가져오는 값은 문자열이기 때문에 String 사용
			//a,b 더해야되기 때문/ 나눠진 값은 int이기 때문에 인티저파세 사용***
			int a = Integer.parseInt(in.split(" ")[0]);
			int b = Integer.parseInt(in.split(" ")[1]);
			//더한값을 배열에 담아줌
			arr[i] = a+b;
		} 
		//그냥 가져오면 주소값으로 나오기 때문에 for문 반복으로
		//배열의 index값을 가져와줌
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}