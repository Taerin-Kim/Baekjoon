package codingTest;

public class palindrome {

	public static void main(String[] args) {
//		���� ����
//		 �տ������� ���� �� �ڿ������� ���� �� �Ȱ��� �ܾ �Ӹ����(palindrome)�̶�� �մϴ�. ���� �� racecar, 10201�� �縰����Դϴ�.
//
//		 
//
//		 �� �ڿ��� n, m�� �Ű������� �־��� ��, n �̻� m������ �ڿ��� �� �Ӹ������ ������ ������ return �ϵ��� solution �Լ��� �ϼ��ؾ� �մϴ�. 
//
//		 
//
//		���ѻ���
//
//		m�� 500, 000������ �ڿ����̸�, n�� m������ �ڿ����Դϴ�.
//		����� �� #1
//
//		1�̻� 100������ �Ӹ������ ������ ���� 18���� �ֽ��ϴ�.
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99
//		����� �� #2
//
//		100�̻� 300������ �Ӹ������ ������ ���� 20���� �ֽ��ϴ�.
//		101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, 212, 222, 232, 242, 252, 262, 272, 282, 292

	}
	
	// Ǯ�� ����

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
