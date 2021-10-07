package programmers;

import java.util.Scanner;

public class phone_number {

	public static void main(String[] args) {
		// subString 사용하기
		// s는 4자리 이상 20 자리 미만
		System.out.println("핸드폰 번호를 숫자만 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		//solution(num);
		System.out.println(solution(num));

		// 먼저 번호의 길이를 가져와서 (매개변수의 길이가 가변적, 길이를 측정)
		// 인덱스 0번지부터 마지막-4 까지 replace로 별표로 바꿔줌

	}

	private static String solution(String phone_number) {
		String answer = "";

		int n = phone_number.length();

		for (int i = 0; i < n; i++) { //폰번호 길이 만큼을 반복해주는 거임
			if (i < n - 4) {
				answer += "*"; // answer 자기자신에 + *을 붙여준다는 의미
			} else {
				answer += phone_number.charAt(i);
			}
		}
		return answer;
	}
}

// 끝에서4글자 전까지for 문을 돌려 “*”을 찍고 String 의 + 성질을 이용

// toCharArray를 사용한 경우도 있음

//		public String solution(String phone_number) {
//			 
//	        char[] ch = phone_number.toCharArray(); // 출력 01033334444
//	        
//	        for(int i = 0; i < ch.length - 4; i++) {
//	            ch[i] = '*';
//	            // 출력 *1033334444, **033334444, ***33334444, 
//	            // ****3334444, *****334444, ******34444, *******4444
//	        }
//	 
//	        return String.valueOf(ch);
//	    }
