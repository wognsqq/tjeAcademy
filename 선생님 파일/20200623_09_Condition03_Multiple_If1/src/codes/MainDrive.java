package codes;

import java.util.Scanner;

// ������Ʈ �̸�
// 20200623_09_Condition03_Multiple_If

public class MainDrive {

	public static void main(String[] args) {
		
//		�ΰ��� �����͸� Scanner�� �Է�.
//		���� (int) / ��� (int)
		
		Scanner scan = new Scanner(System.in);
		
//		�ȳ� 1. ���� �Է�
		System.out.print("������ �Է��ϼ��� : ");
		
//		Ű����� ���� ���� �Է¹ޱ� (myScore�� ����)
		int myScore = scan.nextInt();
		
//		�ȳ� 2. ��� �Է�
		System.out.print("����� �Է��ϼ��� : ");
		
//		scan������ �ѹ� �� �̿��ؼ� => ��� �Է¹ޱ�
		int myRank = scan.nextInt();
		
		
//		���� �ο�.
//		������ 90�� �̻��̸� => ����� Ȯ��.
//		5�� �̳��� A+, �Ѿ�� A0
//		������ 80�� �̻� => ������ B+
//		���� 70�̻� => ������ B0
//		���� 60�̻� => ������ C0
//		�� �����δ� ���� F
		
		
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













