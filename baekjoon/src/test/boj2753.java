package test;

import java.util.Scanner;

public class boj2753 {

	public static void main(String[] args) {
		//��������ϱ� �ݺ��� ����ؼ� �޷� ����ϴ� �� �˱� 
		//for���̶� if�� ���� ����ؾ��ҰŰ���
		
		//if���� ����ص� �ɰŰ��� 
		//�⵵ �Է��ϸ� �����̸� 1, �ƴϸ� 0���
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i%4==0 && i%100!=0) {
			System.out.println("1");
		} else if (i%400==0){
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}

/*
�̰� ���̼�
year = int(input())

if year%400 == 0 or (year%4 == 0 and year%100 != 0):
    print(1)
else:
    print(0)
*/

//java�� �غ���