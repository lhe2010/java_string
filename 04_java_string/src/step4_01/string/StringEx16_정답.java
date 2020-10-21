// 2020-10-20 화 3교시 17:32-17:49
// 2020-10-21 수 1교시 15:03-15:07
package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		int temp = -1;

		for (int i = 0; i < text.length(); i++) {
			if( i == 0) { // 맨처음 시작이면
				if(word.charAt(0) == text.charAt(0)) // 첫단어
					temp = i;
			} else { 	// 알파벳 또 나옴. 단어 시작
				if(text.charAt(i-1) == ' ' && word.charAt(0) == text.charAt(i)) {
					temp = i;
				}
			}
		}
		if(temp == -1) System.out.println("false");

		for (int i = 0; i < word.length(); i++) {
			System.out.printf("word.charAt(%d) == %s, text.charAt(%d) == %s\n",i, word.charAt(i), temp+i, text.charAt(temp+i));
			if(word.charAt(i) != text.charAt(temp+i)) {
				System.out.println("false");
				System.out.printf("word.charAt(%d) == %s, text.charAt(%d) == %s\n",i, word.charAt(i), temp+i, text.charAt(temp+i));
				break;
			}
		}
		System.out.println("true");
		
	}

}
