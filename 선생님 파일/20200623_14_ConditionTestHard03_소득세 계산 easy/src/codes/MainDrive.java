package codes;

import java.util.Scanner;

// �Ǽ��ɾ� ���� - Easy

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �ҵ� �ݾ��� ���� ������ �Է��ϼ��� : ");
		double myYearIncome = scan.nextDouble();
		
//		�� �ҵ��� ��� ��������?
//		�� ������ ���� �Ǽ��ɾ� �ܼ� ���
		double realIncome = 0; // �ϴ� 0���� �ʱ�ȭ
		
		
		if (myYearIncome <= 1000) {
			realIncome = myYearIncome * 0.94; // 6% ¡�� �ݾ�
		}
		else if (myYearIncome <= 4000) {
			realIncome = myYearIncome * 0.85; // 15% ¡�� �ݾ�
		}
		else if (myYearIncome <= 8000) {
			realIncome = myYearIncome * 0.76; // 24% ¡��
		}
		else {
			realIncome = myYearIncome * 0.65; // 35% ¡��
		}
		
		
		System.out.println("�� �Ǽ��ɾ� : " + realIncome + "����");
		
		
		
	}
	
}











