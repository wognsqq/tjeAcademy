package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수: ");
		int koreanScore = scan.nextInt();
		
	
		System.out.print("수학 점수: ");
		int mathScore = scan.nextInt();
		
	
		System.out.print("영어 점수: ");
		int englishScore = scan.nextInt();
		
		
// 세 과목의 평균 점수를 계산, 평균 : 총합/개수		
		int avgScore = (koreanScore + mathScore + englishScore)/3;
		
		if (avgScore >=60) {
// 평균점수가 60이상이어도, 한과목이라도 40미만이면 과락 탈락.
		if (koreanScore >= 40&&mathScore >= 40&& englishScore >= 40)	
						
			System.out.println("합격");
//	세 과목중에 40이 안되는 경우 발생
		System.out.println("과락으로 불합격");
			}
		else {
			System.out.println("불합격");
		}

	}

}