package programmers;

import java.util.Scanner;

public class watermelon_res {

	//문자열로 해서 뒤에 문자가 계속 추가되는 경우 즉 가변성이 있을때는 스트링빌더나 스트링버퍼를 사용하는게 낫다
	//스트링 빌더는 단일스레드에서 사용하는 편이고 스트링버퍼는 멀티스레드에서 사용하는 편
	//스트링은 단순 문자열을 조회할때 많이 사용
	public static void main(String[] args) { //메인메서드

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(solution(input)); //메서드에 나온 결과값을 불러옴 스트링으로 (아래 매서드가 스트링이니까)
	}

	public static String solution(int n) { //메서드 리턴타입은 String 
		String res = "";
		// i는 나열되는 문자..갯수
		for (int i = 0; i < n; i++) {

			//String a = "수";
			//String b = "박";

			if (i % 2 == 0) { // 짝수일때
				res += "수";  //대신에 a
			} else {
				res += "박"; //대신에 b를 집어넣을 수 있음
			}
		}
		return res;
	}
}
