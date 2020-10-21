// 2020-10-21 수 2교시 16:12-16:57
package step4_01.string;

public class StringEx20_테스트정답 {

	public static void main(String[] args) {
		
		String [][] student = {
				{"aaa", "신촌", "1001"}, 
				{"bbb", "강남", "1002"},
				{"ccc", "대치", "1003"} ,
				{"ddd", "강동", "1004"}};
		String[][] score = {
				{"번호" ,"과목","점수"},
				{"1001" ,"국어","20"},	{"1002" ,"국어","50"},	{"1003" ,"국어","60"},	{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},	{"1002" ,"수학","15"},	{"1003" ,"수학","80"},	{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},	{"1002" ,"영어","90"},	{"1003" ,"영어","30"},	{"1004" ,"영어","70"}
		};		//	128					// 155					// 170					// 157		
		
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		
		String[][] stdSum = new String[student.length][3]; // 이름/학점/총점을 저장하는 배열
		
		int tempSum = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < student.length; i++) {			// 임시배열 초기화 (이름 복사)
			stdSum[i][0] = student[i][0];	// [0]이름
			stdSum[i][1] = student[i][2];	// [1]학번
			stdSum[i][2] = "0";				// [2]총점
		}
		
		for (int i = 1; i < score.length; i++) {
			tempSum = 0;
			
			for (int j = 0; j < stdSum.length; j++) {
				if(score[i][0].equals(stdSum[j][1])) {	// 학번이 같은 사람의 행에 += sum
					tempSum = Integer.parseInt(stdSum[j][2]) + Integer.parseInt(score[i][2]);
					stdSum[j][2] = Integer.toString(tempSum);
				}
			}
		}
		
		// 최종성적이 1등인 학생 찾기
		for (int i = 0; i < stdSum.length; i++) {
			if(stdSum[maxIdx][2].compareTo(stdSum[i][2]) < 0) {
				maxIdx = i;
			}
		}
//		// 테스트 프린트
//		for (int i = 0; i < stdSum.length; i++) {
//			System.out.println(Arrays.toString(stdSum[i]));
//		}
		System.out.printf("전체 성적이 1등인 학생은 %s이다. \n", stdSum[maxIdx][0]);
	}
}
