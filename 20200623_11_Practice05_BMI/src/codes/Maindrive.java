package codes;

import java.util.Scanner;

public class Maindrive {

	public static void main(String[] args) {
		
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("키: ");
		double height = scan.nextDouble();
		System.out.print("몸무게: ");
		double weight = scan.nextDouble();
		
		
// BMI 계산: 체중: kg 단위 그대로, 키 - cm입력 => m단위 변환		
		double heightInMeter = height / 100; 
		
		double BMI =  weight/ (heightInMeter*heightInMeter);
		
		System.out.print("BMI:"+BMI);
		
		if (BMI <18.5) {
			System.out.print("저체중");
		}
		else if (BMI <25) {
			System.out.print("과제중");
		}
		else {
			System.out.print("비만");
		}
	
	
	
	
	}
}
