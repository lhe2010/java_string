// 2020-10-19 월 3교시 17:16-17:19
package step4_01.string;

import java.util.Arrays;

public class StringEx07_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] strSplit = str.split(",");
		for (int i = 0; i < strSplit.length; i++) {
			name[i] = strSplit[i].split("/")[0];
			score[i] = Integer.parseInt(strSplit[i].split("/")[1]);
		}
		
		System.out.println("name : " + Arrays.toString(name));
		System.out.println("score : " + Arrays.toString(score));
		
				
		
		

	}

}
