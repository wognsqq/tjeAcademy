package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

// 입력 받아주는데 쓰는 도구 이름 : scan		
		Scanner scan = new Scanner(System.in);

// 안내문구 출력
		System.out.print("태어난 년도를 입력하세요:");
	
// scan을 이용해서 키보드로 정수 입력 받고 => int 변수에 대입		
		int birthYear = scan.nextInt();

// birthYear에 태어난 년도가 담김. =>한국나이로 변환		
		int koreanAge = 2020 -  birthYear + 1;
	
// 미성년자인지? 성인인지?
		if (koreanAge >= 20) {
			System.out.println("성인");
		}
		else {
			System.out.println("미성년자");
		}
		
		
		
	}
	
	
	
	
	
}
