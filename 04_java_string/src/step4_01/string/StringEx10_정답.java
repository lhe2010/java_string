// 2020-10-20 화 1교시 15:20-15:31
package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */

public class StringEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		String nextWord = "";
		String sRun = "종료"; 
		int nRun = 0;

		while(nRun != -1) {
			System.out.println("제시어 : " + start);
			
			while(true) {
				System.out.print("입력 : ");
				nextWord = scan.next();
				
				if(nextWord.equals("종료")) {
					nRun = -1;
					System.out.println("[게임종료]");
					break;
				}
				
				if(nextWord.charAt(0) == start.charAt(start.length()-1)) {
					start = nextWord;
					break;
				} else { // 틀림
					System.out.printf("%c로 시작하는 단어를 입력하세요!\n", start.charAt(start.length()-1));
				}
			}
		}
		scan.close();
	}
}
