// 2020-10-19 월 3교시 17:03-17:10
package step4_01.string;

import java.util.Scanner;

public class StringEx05_정답 {

	public static void main(String[] args) {
		
		// 입력받아보기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 : ");
		String getJumin = scan.next();
		
		int age = 2020 - Integer.parseInt("19" + getJumin.substring(0, 2)) + 1;
		System.out.println(age + "세");

		// 문제 1) 나이 출력
		// 정답 1) 32세
		String jumin = "890101-2012932";
		age = 2020 - Integer.parseInt("19" + jumin.substring(0, 2)) + 1;	// (0,3)아님!
		System.out.println(age + "세");

		// 문제 2) 성별 출력
		// 정답 2) 여성
		if(jumin.charAt(7) == '2') {
			System.out.println("여성");
		} else if(jumin.charAt(7) == '1'){
			System.out.println("남성");
		}

	}

}
