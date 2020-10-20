// 2020-10-20 화 1교시 15:15-15:20
package step4_01.string;

import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		String getAnswer = "";
		
		for (int i = 0; i < words.length; i++) {
			
			while(true) {
				System.out.println("문제 : " + words[i]);
				System.out.print("입력 : ");
				getAnswer = scan.next();
				
				if(words[i].equals(getAnswer)) {
					break;
				}
			}
		}
		
		System.out.println("[게임종료]");	
		scan.close();

	}

}
