package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연 소득 금액을 만원 단위로 입력하세요");
		
		double myYearIncome = scan.nextDouble();
		
//		실수령액이 계산될 변수
		
		double realIncome = 0; // 구간별 실수령액의 합산 => 0에서 출발.
		
//		얼마 정산해야할지 남은 금액 저장 변수
		double remainClaculateIncome = myYearIncome; //전액정산필요에서 시작
//		남은 정산금액이 얼마인지? ( 첫 질문 - 총 번 수익이 얼마인지?)
//		1000만원 이하 : 전액 6% 징수로 계산 끝
		if (remainClaculateIncome <=1000) {
// 		전액 6%징수한걸 그대로 실수령액에 대입하는걸로 계산 끝.
		realIncome = remainClaculateIncome *0.94;
//		1000만원 넘어가면? 1000만원은 6%징수, 남은 금액을 따로 계산.
		realIncome += 1000 *0.94;
//		정산 필요 금액을 1000만원 줄여주자. (1000만원 정산 끝)
		remainClaculateIncome -= 1000;
//		추가 검사 진행.
//		남은 정산 금액이 => 3000을 넘냐 안넘냐.
		if (remainClaculateIncome =< 3000) {
//		남은 정산 금액이 3천이하.
//		남은 돈 전액 15% 징수해서 합산
		realIncome += remainClaculateIncome*0.85;
		
		}
		else {
		//3천 넘는 경우.
		// 3천만원 " 15% 징수, 그 이상 => 추가 계싼 필요
		realIncome += 	
		}
		
		
		}
		
		
	}
}
