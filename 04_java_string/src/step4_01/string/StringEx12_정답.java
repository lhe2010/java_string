// 2020-10-20 화 2교시 16:03-16:43
package step4_01.string;

import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */



public class StringEx12_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int count = 0;
		int identifier = -1; // 1로그인 -1로그아웃
		int userIdx = -1;	// ###cf. 로그인한 회원의 인덱스를 identifier로 설정하고 로그아웃시 -1로 바꿔주면 userIdx 변수가 필요없다! 
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		String[] items = {"사과", "바나나", "딸기"};
		String tempIn = "";
		
		
		while(true) {
			
			System.out.println("\n[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) { 		// 로그인
				System.out.println("\n[로그인메뉴]");
				if(identifier == 1) {
					System.out.println("[ERROR] 이미 로그인 되어있음");
					continue;
				}
				System.out.print("[아이디 입력] ");
				tempIn = scan.next();
				for (int i = 0; i < ids.length; i++) {
					if(tempIn.equals(ids[i])){ // 아이디 찾았을경우 
						userIdx = i;
						System.out.print("[비밀번호 입력] ");
						tempIn = scan.next();
						if(tempIn.equals(pws[i])) {
							System.out.println("[로그인 성공]");
							identifier = 1;
						} 
					}
				}
				if(identifier == -1) {
					System.out.println("[ERROR] 로그인 실패 - 존재하지 않는 아이디/패스워드 ");
				}				
				
			} else if (sel == 2) {	// 로그아웃
				if(identifier == 1) {
					identifier = -1;
					userIdx = -1;
					System.out.println("[로그아웃 성공]");
				} else if(identifier == -1) {
					System.out.println("[ERROR] 로그인 이후 이용할수 있는 메뉴입니다.");
				}
			} else if (sel == 3) {	// 쇼핑
				if(identifier == -1) {
					System.out.println("[ERROR] 로그인 이후 이용할수 있는 메뉴입니다.");
					continue;
				}
				System.out.println("\n[상품목록]");
				for (int i = 0; i < items.length; i++) {
					System.out.printf("%d) %s\n", i+1, items[i]);
				}
				int choice;
				while(true) {
					System.out.println("장바구니에 담을 아이템 선택 : ");
					choice = scan.nextInt();
					if(choice < 0 || choice > items.length) {
						System.out.println("[ERROR] 올바른 아이템을 선택하세요.");
						continue;
					} else {
						// 올바른 아이템 선택한 경우
						System.out.println(items[choice-1] + "선택!");
						jang[count][0] = userIdx;
						jang[count][1] = choice;
						count++;
						break;
					}
				} 	
			} else if (sel == 4) {	// 장바구니
				System.out.println("[관리자 장바구니 메뉴]");
				for (int i = 0; i < count; i++) {
					System.out.printf("[%d] {%d,%d} - %s님이 %s를 구매\n",i, jang[i][0], jang[i][1], ids[jang[i][0]], items[jang[i][1]-1]);
				}
			} else if (sel == 0) {
				System.out.println("[프로그램 종료]");
				break;
			}
			
		}

		scan.close();
	}
}