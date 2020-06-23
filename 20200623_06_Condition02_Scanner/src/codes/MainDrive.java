package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

// 	키보드 입력을 받아주는 Scanner  하나를 생성 => myScanner 변수에 담아둠		
		Scanner myScanner = new Scanner(System.in);

// 어떤 값을 입력할 지 안내 문구 띄워주기
		System.out.print("점수 입력 : " );
		
// 점수 : int로 저장하자
		int myScore = myScanner.nextInt();

// 저장된 myScore를 출력 (입력값 활용)
		System.out.println("내 점수:" +myScore);
		
		
// 내 점수가 70이상이면 합격, 60 이상이면 재시험, 그 이외에는 불합격
		if (myScore >= 70) {
			System.out.println("합격");			
		}
		else if (myScore >=60) {
			System.out.println("재시험");			
		}
		else {
			System.out.println("불합격");
		}
	}
	
	
}
