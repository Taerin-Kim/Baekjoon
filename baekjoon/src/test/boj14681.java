package test;

import java.util.Scanner;

public class boj14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사분면에 속하는 위치 구하기 1,2,3,4
		//x,y 양수 음수
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) { // 1사분면 : x,y 양수 
			System.out.println("1");
		} else if (x<0 && y>0){ // 2사분면 : x<0, y>0
			System.out.println("2");
		} else if (x<0 && y<0) { // 3사분면 : x<0, y<0
			System.out.println("3");
		} else { //그 외
			System.out.println("4");
		}
	}

}
