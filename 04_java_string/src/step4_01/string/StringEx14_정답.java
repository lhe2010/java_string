// 2020-10-20 화 3교시 17:04-17:11
package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * . equals() 메서드 사용없이 문자의 일치여부 비교
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */

public class StringEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		int cnt = 0;

		if(name.length() != myName.length()) {
			System.out.println("false");
			
		} else {
			for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i) == myName.charAt(i)) {
					cnt++;
				}
			}
		}
		if(cnt == name.length())	System.out.println("true");
		else 						System.out.println("false");
		
	}

}
// ### cf. cnt말고도 boolean 변수로 isCorrect를 둬서 
// cnt++ 대신 하나라도 틀리면 false로 바꾸게 하는 방법도 있다. 
