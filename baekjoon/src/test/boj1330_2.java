package test;

import java.util.Scanner;

public class boj1330_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); //�Է¹޴� ����ڵ�
		
		String input = sc.nextLine(); //���������� ���ڿ� �޾ƿ��°�
		String[] arr = input.split(" ");   //������ split ������ �迭�� �������
		//String[] arr ��Ʈ�� �迭, ������ arr

		
		//<�ݺ������� �ε��� ���̸�ŭ �ؼ� �ݺ����ֱ� - ����..>
		//System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//�Է�1�� �޴°�
		int a= Integer.parseInt(arr[0]);
		//System.out.println(a);
		int b = Integer.parseInt(arr[1]);
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
