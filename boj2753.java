package test;

import java.util.Scanner;

public class boj2753 {

	public static void main(String[] args) {
		//윤년출력하기 반복문 사용해서 달력 출력하는 법 알기 
		//for문이랑 if문 같이 사용해야할거같음
		
		//if문만 사용해도 될거같음 
		//년도 입력하면 윤년이면 1, 아니면 0출력
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
이건 파이선
year = int(input())

if year%400 == 0 or (year%4 == 0 and year%100 != 0):
    print(1)
else:
    print(0)
*/

//java로 해보기