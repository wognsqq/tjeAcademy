package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

// 	Ű���� �Է��� �޾��ִ� Scanner  �ϳ��� ���� => myScanner ������ ��Ƶ�		
		Scanner myScanner = new Scanner(System.in);

// � ���� �Է��� �� �ȳ� ���� ����ֱ�
		System.out.print("���� �Է� : " );
		
// ���� : int�� ��������
		int myScore = myScanner.nextInt();

// ����� myScore�� ��� (�Է°� Ȱ��)
		System.out.println("�� ����:" +myScore);
		
		
// �� ������ 70�̻��̸� �հ�, 60 �̻��̸� �����, �� �̿ܿ��� ���հ�
		if (myScore >= 70) {
			System.out.println("�հ�");			
		}
		else if (myScore >=60) {
			System.out.println("�����");			
		}
		else {
			System.out.println("���հ�");
		}
	}
	
	
}
