package codingTest;

public class PositionalNumber {

	public static void main(String[] args) {
		//�ڿ��� N�� 1�� �ڸ� ���ڸ� ���ϸ�
		//10���� ���� �������� ���ϸ� �ȴ�.
		//1�� �ڸ� ���ڸ� ���ϱ� 123 % 10 = 3;
		//�ʿ� ������ 1�� �ڸ� ���ڸ� �����ϰ� 1�� �ڸ��� �����ϱ� ���ؼ� 10���� ���� ���� ���
		//123 / 10 = 12 -> �̴� 123�� 10�� �ڸ��� 100�� �ڸ��� ���������� ��ĭ �̵��� ����� ����
		//12�� 1���ڸ��� ���ϸ� 123�� 10���ڸ��� ���ѰͰ� ����.
		 
		 
		//���� 123
		//123 % 10 = 3 ->1�� �ڸ� ����
		//123 / 10 = 12
		//12 % 10 = 2 ->10�� �ڸ� ����
		//12 / 10 = 1
		//1 % 10 = 1 -> 100�� �ڸ� ����
		//1 / 10 = 0 -> ���̻� �̵���ų �ڸ����� ���ٴ� ����� �˰� ��
		//�� �ڸ��� 3 2 1 �� ���� 6�� �����ϸ� �˴ϴ�.
	}

}