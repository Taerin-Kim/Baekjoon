package programmers;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" "); // �迭�� �����ֱ�

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		// ����n ����m
		//m��
		//�� n��
		
		//�ټ� 
		for(int i = 0; i< m ; i++) {
			//����
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
	}

}