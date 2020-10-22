// 2020-10-22 목 1교시 15:21-15:55
package step4_01.string;

import java.util.Arrays;

//문제1) 위 데이터 는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
/*
  =====================
	10001 김철수 2670
	10002 이영희 1950
	10003 유재석 4080
	10004 박명수 7130
   =====================		  
 */


public class StringEx22_테스트정답 {

	public static void main(String[] args) {
		
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		
		String[] dataSp1 = data.split("\n");	// dataSp = data를 줄마다 자른 배열
		String[] temp = new String[3];			// temp = dataSp를 /로 자른 임시 배열

		String[][] eaTotal = new String[10][3];	// eaTotal = 사람별 TOTAL 테이블 (결과값)
		int eaCnt = 0;							// eaTotal에 저장된 회원의 수 
		boolean isExist;				
		
		for (int i = 0; i < 3; i++) 
			eaTotal[0][i] = "0";
		
		for (int i = 0; i < dataSp1.length; i++) {
			isExist = false;
			temp = dataSp1[i].split("/");
			
			if(eaCnt == 0) {
				eaTotal[0][0] = temp[0];
				eaTotal[0][1] = temp[1];
				eaTotal[0][2] = temp[2];
				eaCnt++;
			} else {
				for (int j = 0; j < eaCnt ; j++) {
					if(temp[0].equals(eaTotal[j][0])) { // 학번이 같으면 점수 더함
						isExist = true;
						eaTotal[j][2] = Integer.toString(Integer.parseInt(eaTotal[j][2]) + Integer.parseInt(temp[2])); 
					}
				}
				
				if(!isExist) {		// 다 탐색후 없으면 eaTotal에 추가
					eaTotal[eaCnt][0] = temp[0];
					eaTotal[eaCnt][1] = temp[1];
					eaTotal[eaCnt++][2] = temp[2];
				}
			}
		}

		for (int i = 0; i < eaCnt; i++) {
			if(i == 0) 			System.out.print("=====================\n");
			System.out.println(Arrays.toString(eaTotal[i]));
			if (i == eaCnt-1)	System.out.print("=====================\n");
		}
	}

}
