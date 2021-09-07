package test;

import java.util.Scanner;

public class boj2884 {

	public static void main(String[] arsg) {
		// 시계문제 "45분 일찍 알람 설정하기"
		/*
		 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간
		 * H시 M분을 의미한다. 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날
		 * 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		 */
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		// 분이 60이 될때마다 시가 바뀜
		// 입력했을때 -45가 되야함

		// 0<=h<=23

		// 신경쓸것들
		// 1. 0시 45분보다 작을 때 (23시, 분 바뀜)
		// 2. 45분보다 작을때 (시, 분 바뀜)
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
