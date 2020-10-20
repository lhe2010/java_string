// 2020-10-20 화 3교시 17:32-17:49
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
			if(word.charAt(0) == text.charAt(i)) {
				temp = i;
			}
		}
		if(temp == -1) System.out.println("false1");

		for (int i = 0; i < word.length(); i++) {
			System.out.printf("word.charAt(%d) == %s, text.charAt(%d) == %s\n",i, word.charAt(i), temp+i, text.charAt(temp+i));
			if(word.charAt(i) != text.charAt(temp+i)) {
				System.out.println("false2");
				System.out.printf("word.charAt(%d) == %s, text.charAt(%d) == %s\n",i, word.charAt(i), temp+i, text.charAt(temp+i));
				break;
			}
		}
		System.out.println("true");
		
	}

}
