package test;

import java.util.Scanner;

public class boj14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��и鿡 ���ϴ� ��ġ ���ϱ� 1,2,3,4
		//x,y ��� ����
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) { // 1��и� : x,y ��� 
			System.out.println("1");
		} else if (x<0 && y>0){ // 2��и� : x<0, y>0
			System.out.println("2");
		} else if (x<0 && y<0) { // 3��и� : x<0, y<0
			System.out.println("3");
		} else { //�� ��
			System.out.println("4");
		}
	}

}
