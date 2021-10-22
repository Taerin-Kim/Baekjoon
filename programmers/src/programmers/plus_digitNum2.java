package programmers;

public class plus_digitNum2 {

	public static void main(String[] args) {
		int n = 0;
		solution(n);
	}

	// int타입으로 풀기

	static int solution(int n) {
		int answer = 0;
		while (n >= 1) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}

	//에러메세지 확인하기
}
