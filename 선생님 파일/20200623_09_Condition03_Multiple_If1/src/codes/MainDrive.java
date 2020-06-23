package codes;

import java.util.Scanner;

// 프로젝트 이름
// 20200623_09_Condition03_Multiple_If

public class MainDrive {

	public static void main(String[] args) {
		
//		두개의 데이터를 Scanner로 입력.
//		점수 (int) / 등수 (int)
		
		Scanner scan = new Scanner(System.in);
		
//		안내 1. 점수 입력
		System.out.print("점수를 입력하세요 : ");
		
//		키보드로 실제 점수 입력받기 (myScore에 저장)
		int myScore = scan.nextInt();
		
//		안내 2. 등수 입력
		System.out.print("등수를 입력하세요 : ");
		
//		scan변수를 한번 더 이용해서 => 등수 입력받기
		int myRank = scan.nextInt();
		
		
//		학점 부여.
//		점수가 90점 이상이면 => 등수를 확인.
//		5등 이내면 A+, 넘어가면 A0
//		점수가 80점 이상 => 무조건 B+
//		점수 70이상 => 무조건 B0
//		점수 60이상 => 무조건 C0
//		그 밑으로는 전부 F
		
		
		if (myScore >= 90) {
			
			if (myRank <= 5) {
				System.out.println("A+");
			}
			else {
				System.out.println("A0");
			}	
		}
		else if (myScore >= 80) {
			System.out.println("B+");
		}
		else if (myScore >= 70) {
			System.out.println("B0");
		}
		else if (myScore >= 60) {
			System.out.println("C0");
		}
		else {
			System.out.println("F");
		}
		
		
		
	}
	
}













