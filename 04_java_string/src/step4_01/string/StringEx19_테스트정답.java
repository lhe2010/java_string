// 2020-10-21 수 2교시 16:04-16:12
package step4_01.string;

public class StringEx19_테스트정답 {

	public static void main(String[] args) {
		// 학생 정보와 성적이 담긴 데이터 이다 
		// 문제1) 전체 성적이 1등인 학생 이름 출력
		
		// student ==> 1.id 2.주소 3.번호
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		// score ==> 1.번호 2.국어 3.수학 4.영어
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"}, 	// 150
				{"1002" ,"10" ,"60" , "60"},	// 130
				{"1003" ,"23" ,"63" , "31"},	// 117
				{"1004" ,"45" ,"30" , "35"},	// 110
		};

		int maxIdx = -1;
		int maxSum = 0;
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum = 0;
			for (int j = 1; j < score[0].length; j++) {
				sum += Integer.parseInt(score[i][j]);
			}
			if(maxSum < sum) {
				maxIdx = i;
				maxSum = sum;
			}
		}
		for (int i = 0; i < student.length; i++) {
			if(student[i][2].equals(score[maxIdx][0]))
				System.out.printf("전체 성적이 1등인 학생은 %s 입니다. ", student[i][0]);
		}
	}
}
