//2020-10-19 월 1교시
package step4_01.string;

import java.util.Scanner;

/*
 *  [필기] 
 *  문자열중에 Scanner입력파트. 둘중하나쓰면됨. 여태는 nextInt();
 *  next()는 띄어쓰기가 안들어감. ex.외국이름 같은 경우. -> nextLine() 

 *  키보드-버퍼-메모리
 *  문자열사이에 숫자가 입력받으면 끝나버림. 숫자입력받을때 받은 엔터를 버퍼에서 가져와 흡수한것.
 *  -> 버퍼에서 빼주어야함. scan.nextLine();로 버퍼를 비워준다. 
 * 
 * 1) next() : 공백을 기준으로 한 단어만 입력받는다. 
 * 2) nextLine() : ENTER입력 전까지 전체를 입력받는다. 
 * 
 *  nextLine()은 버퍼 관련 이슈가 생길 수 있으니 버퍼를 정리해 주어야 한다. 
 *  
 */

public class StringEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : "); 		// 문자열
		//String name = scan.next();
		String name = scan.nextLine();
		System.out.println("name : " + name);
		
		// 버퍼 관련 이슈
		
		System.out.print("나이를 입력하세요 : ");		// 숫자
		int age = scan.nextInt();
		System.out.println("age : " + age);
		
		// 버퍼에 남아있는 enter를 제거(버퍼비우기)
		scan.nextLine();

		System.out.print("특이사항을 입력하세요 : ");	// 문자열
		String comment = scan.nextLine(); 
		System.out.println("comment : " + comment);
	
		scan.close();
	
	}

}
