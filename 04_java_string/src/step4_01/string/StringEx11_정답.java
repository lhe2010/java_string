// 2020-10-20 화 1교시 15:31-16:00
package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * } 
 */



public class StringEx11_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int SIZE = 100;
		
		String[][] items = new String[SIZE][2];
		for(int i = 0; i < SIZE; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int sel, choice;
		int categoryCnt = 0;
		int itemCnt = 0;
		String getCategory = "";
		String getItemName = "";
		boolean bCategoryExist = false;
		
		while(true) {

			System.out.println("\n[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]관리자 모드 종료");
			
			System.out.print("메뉴선택 : ");
			sel = scan.nextInt();
			
			if (sel == 1) { 		// 카테고리 관리
				System.out.println("\n[1] 추가");
				System.out.print("메뉴선택 : ");
				choice = scan.nextInt();
				
				if(choice == 1) {
					System.out.print("추가할 카테고리 명을 입력하세요: ");
					items[categoryCnt][0] = scan.next();
					categoryCnt++;
				}
				
			} else if (sel == 2) {	// 아이템 관리
				System.out.println("\n[1] 추가");
				System.out.print("메뉴선택 : ");
				choice = scan.nextInt(); 
				bCategoryExist = false;
				
				if(choice == 1) {
					System.out.print("추가할 카테고리명을 입력하세요: ");
					getCategory = scan.next();
					for (int i = 0; i < categoryCnt; i++) {
						if(items[i][0].equals(getCategory)) { // 카테고리 선택
							System.out.printf("[%s] 에 추가할 아이템을 입력하세요: ",getCategory);
							getItemName = scan.next();
							items[i][1] += (getItemName + "/");
							bCategoryExist = true;
						}
					}
					if(!bCategoryExist) {
						System.out.printf("\n[%s]는 존재하지 않는 카테고리입니다. \n", getCategory);
					}
				}
				
			} else if (sel == 3) {	// 전체품목 출력
				System.out.println();
				for (int i = 0; i < categoryCnt; i++) {
					System.out.println("[카테고리] " + items[i][0] + " : " + items[i][1]);
				}
			} else if(sel == 0) {
				break;
			}
		}
		scan.close();
	}

}
