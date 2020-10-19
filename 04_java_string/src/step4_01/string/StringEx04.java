//2020-10-19 월 2교시
package step4_01.string;

// 문자열 관련 형변환

public class StringEx04 {

	public static void main(String[] args) {

		// 문자열 -> 숫자 	ex) "10" > 10
		String strNum = "10"; 
		int num = Integer.parseInt(strNum);
		System.out.println(num + 1);		// 11 cf. parseInt없으면 결과는 101
		
		// 숫자 -> 문자열	ex) 10 > "10"
		
		// 방법 1)
		strNum = num + ""; 					// 글자로 바뀜
		System.out.println(strNum + 1);		// 101
		
		// 방법 2)
		strNum = Integer.toString(num);
		System.out.println(strNum + 1);		// 101

		// 방법 3)
		strNum = String.valueOf(num);
		System.out.println(strNum + 1);		// 101
		
		// (번외) 숫자와 문자는 한몸 - ASCII (A65/a97) 
		// 1) 문자 -> 숫자
		char ch = 'a';
		int aNum = (int)ch;
		System.out.println(aNum);			// 97
		
		// 2) 숫자 -> 문자
		ch = (char)(aNum+1);
		System.out.println(ch);				// b
		
	}

}
