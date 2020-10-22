// 2020-10-20 화 1교시 15:15-15:20
// 2020-10-22 목 2교시 16:26-16:29	// 1번 조건 문제 섞는거 까먹어서 다시 추가
package step4_01.string;

import java.util.Arrays;
import java.util.Random;
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

public class StringEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		String getAnswer = "";

		// 조건1. 문제를 섞는다.
		for (int i = 0; i < 100; i++) {
			int nRand = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[nRand];
			words[nRand] = temp;
		}
		
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
		// ###cf. for안에 while만 넣을거면 while(i < words.length)로 한번에 가능.
		
		System.out.println("[게임종료]");	
		scan.close();

	}

}
