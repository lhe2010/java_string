// 2020-10-20 화 3교시 17:11-17:28
// 비밀번호 검사로 응용가능 
package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numCnt = 0;
		int lowCnt = 0;
		int uppCnt = 0;
		
//		System.out.print("입력 : ");
//		String text = scan.next();
		String text = "123123";
		
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if(ch >= 65 && ch <= 90) uppCnt++;
			if(ch >= 97 && ch <=122) lowCnt++;
			if(ch >= 48 && ch <= 57) numCnt++;
					
		}
		
//		System.out.printf( "upp = %d, low = %d, num = %d\n", uppCnt, lowCnt, numCnt);
		if(numCnt == 0) {
			System.out.println("문자만 있다.");
		} else if(numCnt > 0 && (lowCnt + uppCnt) > 0) {
			System.out.println("문자와 숫자가 섞여있다. ");
		} else if(numCnt > 0 && (lowCnt + uppCnt) == 0 ) {
			System.out.println("숫자만 있다.");
		}

		scan.close();
	}

}
