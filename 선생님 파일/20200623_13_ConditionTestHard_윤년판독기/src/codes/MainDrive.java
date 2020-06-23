package codes;

import java.util.Scanner;

// 20200623_13_ConditionTestHard02

public class MainDrive {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("윤년 여부 궁금한 년도 입력 : ");
		int year = scan.nextInt();
		
//		다른 풀이
		if (year % 400 == 0) {
			System.out.println("400으로 떨어지니 윤년.");
		}
		else if (year % 100 == 0) {
			System.out.println("100으로 떨어지니 윤년 X");
		}
		else if (year % 4 == 0) {
			System.out.println("4로 떨어지니 윤년.");
		}
		else {
			System.out.println("4로도 안떨어지니 윤년 아님.");
		}
		
		
		
//		4로 나눠떨어지는지 (4로 나눈 나머지가 0인가?) 검사
		if (year % 4 == 0) {
			
//			4로 떨어질때는 100으로 나눠지는지 추가 검사
			if (year % 100 == 0) {
//				400으로 떨어지는지 추가 검사 필요
				if (year % 400 == 0) {
					System.out.println("400으로 떨어지므로 윤년이 맞습니다.");
				}
				else {
					System.out.println("100으로 떨어지지만 400으로는 안나눠지므로 윤년 아님.");
				}
				
			}
			else {
//				2012, 2020 등 의 경우로 윤년 O.
				System.out.println("4로 떨어지면서 100으로는 안나눠지므로 윤년 맞음.");
			}
			
		}
		else {
//			4로 안떨어지니까 윤년 X.
			System.out.println("4로 떨어지지 않으므로 윤년 아님.");
		}
		
	}

}








