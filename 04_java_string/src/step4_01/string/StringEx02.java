//2020-10-19 월 1교시
package step4_01.string;

import java.util.Scanner;

/*
 * 문자열 비교 메서드 equals();
 * 문자열은 ==로 비교하지 않고 equals()메소드를 이용하여 비교한다. 
 */

public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "홍길동";
		System.out.print("이름을 입력하세요: ");
		String myName = scan.next();
		
		// 비교 불가
		if(name == myName) { // 불일치
			System.out.println("== 연산자 : 일치");
		} else {
			System.out.println("== 연산자 : 불일치");
		}
		
		// 비교 가능 
		if(name.equals(myName)) { // name이랑 myName 위치는 상관없다. 결과는 똑같지만 보통 기준을 앞에 쓴다. 
			System.out.println("equals : 일치");
		} else {
			System.out.println("equals : 불일치");
		}
		
		scan.close();

	}

}
