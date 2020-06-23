package codes;

import java.util.Scanner;

//실수령액 계산기 - Hard
// 누진세처럼 계산

public class MainDrive {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연 소득 금액을 만원 단위로 입력하세요 : ");
		double myYearIncome = scan.nextDouble();
		
//		실수령액이 계산될 변수
		
		double realIncome = 0; // 구간별 실수령액의 합산 => 0에서 출발.
		
		
//		얼마 정산해야할지 남은 금액 저장 변수.
		double remainCalculateIncome = myYearIncome; //전액 정산 필요에서 시작.
		
//		남은 정산금액이 얼마인지? (첫 질문 -> 총 번 수익이 얼마인지?)
//		1000만원 이하 : 전액 6% 징수로 계산 끝.
		if (remainCalculateIncome <= 1000) {
			
//			전액 6% 징수한걸 그대로 실수령액에 대입하는걸로 계산 끝.
			realIncome = remainCalculateIncome * 0.94;
		}
		else {
//			1000만원 넘어가면? 1000만원 은 6% 징수, 남은 금액은 따로 계산.
			
			realIncome += 1000 * 0.94;
					
//			정산 필요 금액을 1000만원 줄여주자. (1000만원은 정산 끝)
			remainCalculateIncome -= 1000;
			
//			추가 검사 진행.
//			남은 정산 금액이 => 3000을 넘냐 안넘냐.
			
			if (remainCalculateIncome <= 3000) {
//				남은 정산금액이 3천 이하.
				
//				남은 돈 전액 15% 징수해서 합산.
				realIncome += remainCalculateIncome * 0.85;
				
			}
			else {
//				3천 넘는 경우.
				
//				3천만원 : 15%징수, 그 이상 => 추가 계산 필요
				
				realIncome += 3000 * 0.85;
				
//				3천만원 추가 정산. => 남은 정산금액을 3천만원 줄여주자.
				remainCalculateIncome -= 3000;
				
//				남은 금액 : 4천 이하? 아닌가?
				if (remainCalculateIncome <= 4000) {
//					남은 금액 전부를 24% 징수해서 합산.
					realIncome += remainCalculateIncome * 0.76;
				}
				else {
//					4천 넘어감 => 4000에 대해서는 24%, 추가로 35% 징수구간 금액도 있다.
					realIncome += 4000 * 0.76;
					
//					남은 정산 금액을 4천 줄이자.
					remainCalculateIncome -= 4000;
					
//					나머지금액은 전부 35% 징수. => 실수령액 계산 끝.
					
					realIncome += remainCalculateIncome * 0.65;
					
					
				}
				
			}
			
			
		}
		
		
//		최종 실수령액 표시
		System.out.println("실제 수령액 : " + realIncome + "만원");
		
		
	}
	
}





