package test;

import java.util.Scanner;

public class boj2884 {

	public static void main(String[] arsg) {
		// �ð蹮�� "45�� ���� �˶� �����ϱ�"
		/*
		 * ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð�
		 * H�� M���� �ǹ��Ѵ�. �Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������
		 * ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
		 */
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		// ���� 60�� �ɶ����� �ð� �ٲ�
		// �Է������� -45�� �Ǿ���

		// 0<=h<=23

		// �Ű澵�͵�
		// 1. 0�� 45�к��� ���� �� (23��, �� �ٲ�)
		// 2. 45�к��� ������ (��, �� �ٲ�)
		// 3. else
		
		 if(m<45) {
			if(h==0) {
				h = 23;
			}else {
				h = h-1;
			}
			m = (60-45) + m;
			System.out.println(h + " : " + m);
			
		} else {
			m = m-45;
			System.out.println(h + " : " + m);
		}
		
		
		
		/*
		
		if (h > 0 && h <= 23) {

			if (m - 45 < 0) {
				h = h - 1;
				m = (60 - 45) + m;
				System.out.println(h + ":" + m);
			} else {
				m = m - 45;
				System.out.println(h + " : " + m);
			}
		} else {
			h = 23 - h;
			m = (60 - 45) + m;
			System.out.println(h + " : " + m);
		}
	*/
	}
		
}
