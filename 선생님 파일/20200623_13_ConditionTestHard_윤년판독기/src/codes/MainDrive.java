package codes;

import java.util.Scanner;

// 20200623_13_ConditionTestHard02

public class MainDrive {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� �ñ��� �⵵ �Է� : ");
		int year = scan.nextInt();
		
//		�ٸ� Ǯ��
		if (year % 400 == 0) {
			System.out.println("400���� �������� ����.");
		}
		else if (year % 100 == 0) {
			System.out.println("100���� �������� ���� X");
		}
		else if (year % 4 == 0) {
			System.out.println("4�� �������� ����.");
		}
		else {
			System.out.println("4�ε� �ȶ������� ���� �ƴ�.");
		}
		
		
		
//		4�� �������������� (4�� ���� �������� 0�ΰ�?) �˻�
		if (year % 4 == 0) {
			
//			4�� ���������� 100���� ���������� �߰� �˻�
			if (year % 100 == 0) {
//				400���� ���������� �߰� �˻� �ʿ�
				if (year % 400 == 0) {
					System.out.println("400���� �������Ƿ� ������ �½��ϴ�.");
				}
				else {
					System.out.println("100���� ���������� 400���δ� �ȳ������Ƿ� ���� �ƴ�.");
				}
				
			}
			else {
//				2012, 2020 �� �� ���� ���� O.
				System.out.println("4�� �������鼭 100���δ� �ȳ������Ƿ� ���� ����.");
			}
			
		}
		else {
//			4�� �ȶ������ϱ� ���� X.
			System.out.println("4�� �������� �����Ƿ� ���� �ƴ�.");
		}
		
	}

}








