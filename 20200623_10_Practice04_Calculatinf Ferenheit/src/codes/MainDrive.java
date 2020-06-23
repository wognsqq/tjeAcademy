package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("섭씨 온도: ");
		
		double Celsius = scan.nextDouble();
		
//		입력받은 섭씨온도를 가지고 화씨로 변환 => 결과를 별도 변수에 저장				
//		섭씨 변수를 갖고 공식 계산
		
		double Ferenheit =  (Celsius * 1.8 +32);
				
		System.out.println("화씨 온도: " + Ferenheit);
		
		
		
		
		
		
	}
	
	
}
