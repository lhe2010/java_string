//2020-10-19 월 1교시-2교시
package step4_01.string;

import java.util.Arrays;

// 문자열 관련 메소드 ***
// 나중에는 자바꺼아니고 직접 만들어보기 

public class StringEx03 {

	public static void main(String[] args) {
		
		String str = "megait";
		System.out.println(str);
		
		// [1] 문자열의 길이 : length();
		int size = str.length(); // 문자열은 length();메소드 이고 배열은 length변수이다. 
		System.out.println(size);

		// [2] 문자열 1개 추출 (인덱싱) : charAt(index); 
		// 문자열도 배열이라고 생각하면 된다. 문자열에서 뽑아낸 하나는 문자이다. 
		char ch = str.charAt(0);
		System.out.println(ch); // m
		
		ch = str.charAt(size-1); // ***** 마지막 글자를 알고싶을때 자주 사용.
		System.out.println(ch); // t
		
		// [3] 문자열 여러개 추출 (슬라이싱) : substring(); // DB쿼리랑 자바스크립트에도 있다. 
		// 1) substring(index1, index2) : 마지막은 포함하지 않는다. (이상,미만)
		String rs = str.substring(4, 6);
		System.out.println(rs);	// it
		
		// 2) substring(index) : index부터 문자열 끝까지
		rs = str.substring(4);
		System.out.println(rs);	// it
		
		// [4] split("구분자") : 구분자로 잘라내기 - 결과는 문자열배열
		str = "[3] hello,java,android";
		String[] arr = str.split(","); // 개수는 알아서 구해줌
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// (참고) 이어붙이기. c에는 concat() java에는 없다. -> 빈거만들고 붙이기 
		String result = "[4] ";
		result += arr[0];
		result += ",";
		result += arr[1];
		result += ",";
		result += arr[2];
		result += ",";
		System.out.println(result);
		
		// [5] compareTo() : 문자열비교 - ASCII아니고 사전순서로 비교 
		// 항상 기준값이 시작
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);		// 음수(기준값이 작을 경우)

		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);		// 양수(기준값이 클 경우)
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);		// 0(같을 경우) 
										// 같은지 검사는 compareTo()보다 equals()쓰는게 가독성면에서 좋다. 
		
	}

}
