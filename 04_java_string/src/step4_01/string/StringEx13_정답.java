// 2020-10-20 화 2교시 16:43-17:00
package step4_01.string;

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_정답 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		String sTemp = "";
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i; j < names.length; j++) {
				if(names[i].compareTo(names[j]) > 0) { // j가 사전순에서 앞인경우 
					sTemp = names[j];
					names[j] = names[i];
					names[i] = sTemp;
				}
			}
			System.out.println(Arrays.toString(names));
		}
	}
}
