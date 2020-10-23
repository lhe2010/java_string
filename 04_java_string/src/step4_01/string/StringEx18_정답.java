// 2020-10-21 수 1교시 15:24-15:48
package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
	문제) 영어단어 맞추기  
	영어단어가 전부 * 로 표시된다. 
	영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	 조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	전부 벗겨지거나 맞추면 종료 
*/

public class StringEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String word = "performance";
		String meaning = "공연";
		
		int score = 100;
		int size = word.length();
		int check[] = new int[size];  // 힌트 체크를 통해서 확인할수있다.
		int checksum, nRandom;
		
		while (true) {
			checksum = 0; nRandom = 0;
			
			// *가 다 벗겨지면 게임 종료
			for (int i = 0; i < check.length; i++) 
				checksum += check[i];
			if(checksum == size) break;
			
			System.out.println("\n뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i =0; i < size; i++) {
				if(check[i] == 1) {
					System.out.print(word.charAt(i));
				} else {
					System.out.print("*");
				}
			}
			System.out.print("\n영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			if(word.equals(me)) { 				// 정답을 맞춘경우 종료
				System.out.println("[정답]");
				break;
			} else {
				// 오답 - 랜덤으로 한글자씩 벗겨진다
				do {
					nRandom = ran.nextInt(size);
				} while(check[nRandom] != 0);
//				check[nRandom] = 1; 			// 힌트 벗겨지면 1
				// 같은 철자가 더 있으면 한번에 힌트 벗겨지게 
				for (int i = 0; i < word.length(); i++) {
					if(word.charAt(nRandom) == word.charAt(i))
						check[i] = 1;			// 힌트 벗겨진 경우 check 배열에 1저장
				}
				score -= 5;						// 점수는 5점씩 감점
				System.out.println("[현재 점수] " + score);
			}
		}
		System.out.println("\n[게임정답] " + word);
		System.out.printf("[게임종료] 점수는 %d점\n", score);
		scan.close();
	}

}
