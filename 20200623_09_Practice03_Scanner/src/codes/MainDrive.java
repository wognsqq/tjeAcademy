package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����: ");
		int koreanScore = scan.nextInt();
		
	
		System.out.print("���� ����: ");
		int mathScore = scan.nextInt();
		
	
		System.out.print("���� ����: ");
		int englishScore = scan.nextInt();
		
		
// �� ������ ��� ������ ���, ��� : ����/����		
		int avgScore = (koreanScore + mathScore + englishScore)/3;
		
		if (avgScore >=60) {
// ��������� 60�̻��̾, �Ѱ����̶� 40�̸��̸� ���� Ż��.
		if (koreanScore >= 40&&mathScore >= 40&& englishScore >= 40)	
						
			System.out.println("�հ�");
//	�� �����߿� 40�� �ȵǴ� ��� �߻�
		System.out.println("�������� ���հ�");
			}
		else {
			System.out.println("���հ�");
		}

	}

}