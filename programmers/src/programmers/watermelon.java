package programmers;

import java.util.Scanner;

public class watermelon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		// i�� �����ϴ� �� ��ŭ �ݺ�
		for (int i = 0; i < input; i++) {
			String a = "��";
			String b = "��";
			if (input % 2 > 0) { // �������� 1�϶� ��, Ȧ���϶�

				System.out.printf("%d+%d+%d", a, a + b);
			} else { // ¦���϶�
				System.out.printf("%d+%d", a, a + b);
			}
		}
	}

}
