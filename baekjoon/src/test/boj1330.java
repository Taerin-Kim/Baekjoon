package test;

import java.util.Scanner;

public class boj1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		//nextLine - ����(����), nextInt - ����
		
		//A B ù° �ٿ�  A B �־���, A �� B�� ������ĭ���� ����
		
		//�Է�1�� �޴°�
		int a= sc.nextInt();
		//System.out.println(a);
		int b = sc.nextInt();
		//System.out.println(b);
		
		// a�� b���� Ŭ�� '>' ���
		// a�� b���� ������ '<' ���
		// a�� b���� ������ == ���
		
		if(a>b) {
			System.out.println(">");
		} else if (a<b) {
			System.out.println("<");	
		} else if (a==b) {
			System.out.println("==");
		}
		
	}

}
