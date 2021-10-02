package codingTest;

public class palindrome {

	public static void main(String[] args) {
//		문제 설명
//		 앞에서부터 읽을 때 뒤에서부터 읽을 때 똑같은 단어를 팰린드롬(palindrome)이라고 합니다. 예를 들어서 racecar, 10201은 펠린드롬입니다.
//
//		 
//
//		 두 자연수 n, m이 매개변수로 주어질 때, n 이상 m이하의 자연수 중 팰린드롬인 숫자의 개수를 return 하도록 solution 함수를 완성해야 합니다. 
//
//		 
//
//		제한사항
//
//		m은 500, 000이하의 자연수이며, n은 m이하의 자연수입니다.
//		입출력 예 #1
//
//		1이상 100이하의 팰린드롬은 다음과 같이 18개가 있습니다.
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99
//		입출력 예 #2
//
//		100이상 300이하의 팰린드롬은 다음과 같이 20개가 있습니다.
//		101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, 212, 222, 232, 242, 252, 262, 272, 282, 292

	}
	
	// 풀이 과정

	class Solution {
		public int solution(int n, int m) {
			int answer = 0;
			for (int i = n; i <= m; i++) {
				if (checkPalindrom(i + "")) {
					answer++;
				}
			}
			return answer;
		}

		private boolean checkPalindrom(String arg) {
			int j = arg.length() - 1;
			for (int i = 0; i < arg.length() / 2; i++, j--) {
				if (arg.charAt(i) != arg.charAt(j)) {
					return false;
				}
			}
			return true;
		}
	}

}
