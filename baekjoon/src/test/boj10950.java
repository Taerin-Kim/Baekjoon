package test;

import java.util.Iterator;
import java.util.Scanner;

public class boj10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//nextint�� nextLine ����ó��
		sc.nextLine();
		
		// for(int i = t; i>0 ;t--)
		//for(int i=1; i<=t; t++)
		
		int[] arr = new int[t];
		//t�� ��ŭ �Է��� �޾���
		for(int i=0; i<t; i++) {
			String in = sc.nextLine();
			//�޾��� �Է°��� a, b�� ������ �޾���
			//�̶� �������� ���� ���ڿ��̱� ������ String ���
			//a,b ���ؾߵǱ� ����/ ������ ���� int�̱� ������ ��Ƽ���ļ� ���***
			int a = Integer.parseInt(in.split(" ")[0]);
			int b = Integer.parseInt(in.split(" ")[1]);
			//���Ѱ��� �迭�� �����
			arr[i] = a+b;
		} 
		//�׳� �������� �ּҰ����� ������ ������ for�� �ݺ�����
		//�迭�� index���� ��������
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
