// 2020-10-21 수 1교시 15:08-15:24
package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		String newText = "";
		
		int temp = -1;
		
		for (int i = 0; i < text.length(); i++) {
			if(i == 0) {
				if(word.charAt(0) == text.charAt(0))
					temp = i;
			} else {
				if (text.charAt(i-1) == ' ' && word.charAt(0) == text.charAt(i)) {
					temp = i;
				}
			}
//			System.out.printf("word.charAt(%d) == %s, text.charAt(%d) == %s\n",i, word.charAt(i), temp+i, text.charAt(temp+i));
		}
		
		if(temp == -1) 
			System.out.println("없는 단어입니다. ");
		else { // 찾은경우. 
//			System.out.println("찾음");
			System.out.print("바꿀 단어 입력 : ");
			String newWord = scan.next();
			
			for (int i = 0; i < temp; i++) 
				newText += text.charAt(i);
			for (int i = 0; i < newWord.length(); i++) 
				newText += newWord.charAt(i);
			for (int i = temp + word.length(); i < text.length(); i++) 
				newText += text.charAt(i);
			
			System.out.println("바뀐 문자열 : " + newText);
		}
		
		scan.close();
	}

}
