package codes;

import java.util.Scanner;

public class Maindrive {

	public static void main(String[] args) {
		
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Ű: ");
		double height = scan.nextDouble();
		System.out.print("������: ");
		double weight = scan.nextDouble();
		
		
// BMI ���: ü��: kg ���� �״��, Ű - cm�Է� => m���� ��ȯ		
		double heightInMeter = height / 100; 
		
		double BMI =  weight/ (heightInMeter*heightInMeter);
		
		System.out.print("BMI:"+BMI);
		
		if (BMI <18.5) {
			System.out.print("��ü��");
		}
		else if (BMI <25) {
			System.out.print("������");
		}
		else {
			System.out.print("��");
		}
	
	
	
	
	}
}
