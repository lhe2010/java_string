// 2020-10-21 수 3교시 17:43-17:50
// 2020-10-22 목 1교시 15:06-15:21
package step4_01.string;


//문제) moneyData 와 nameData 를 조합해서 userData를 아래와같이 만들어보세요
/*
* 100001/이만수/600
* 100003/유재석/7000
* 100001/이만수/100
* 100002/이영희/400
* 100001/이만수/600
* 100004/박명수/900
* 100001/이만수/130
* 100003/유재석/200
* 100002/이영희/700
* 100002/이영희/900
* 100004/박명수/800
*/

public class StringEx21_테스트정답 {

	public static void main(String[] args) {
		
		String nameData = "";
		nameData +=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";

		String userData = "";
		
		String[] nameSp = nameData.split("\n");
		String[] moneySp = moneyData.split("\n");
		
//		System.out.println(Arrays.toString(nameSp));
//		System.out.println(Arrays.toString(moneySp));
		
		for (int i = 0; i < moneySp.length; i++) {
//			System.out.printf("for - i = %d\n", i);
//			System.out.println(moneySp[i].split("/")[0]);
			for (int j = 0; j < nameSp.length; j++) {
//				System.out.printf("for - i = %d, j = %d\n", i, j);
				if(moneySp[i].split("/")[0].equals(nameSp[j].split("/")[0])){
//					System.out.println("찾음" + nameSp[j].split("/")[0]);
					userData += (moneySp[i].split("/")[0] + "/" + nameSp[j].split("/")[1] + "/" 
							+ moneySp[i].split("/")[1] + "\n");
				}
			}
		}
		System.out.println(userData);
	}
}
