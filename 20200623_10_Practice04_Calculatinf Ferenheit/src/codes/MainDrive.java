package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �µ�: ");
		
		double Celsius = scan.nextDouble();
		
//		�Է¹��� �����µ��� ������ ȭ���� ��ȯ => ����� ���� ������ ����				
//		���� ������ ���� ���� ���
		
		double Ferenheit =  (Celsius * 1.8 +32);
				
		System.out.println("ȭ�� �µ�: " + Ferenheit);
		
		
		
		
		
		
	}
	
	
}
