package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

// �Է� �޾��ִµ� ���� ���� �̸� : scan		
		Scanner scan = new Scanner(System.in);

// �ȳ����� ���
		System.out.print("�¾ �⵵�� �Է��ϼ���:");
	
// scan�� �̿��ؼ� Ű����� ���� �Է� �ް� => int ������ ����		
		int birthYear = scan.nextInt();

// birthYear�� �¾ �⵵�� ���. =>�ѱ����̷� ��ȯ		
		int koreanAge = 2020 -  birthYear + 1;
	
// �̼���������? ��������?
		if (koreanAge >= 20) {
			System.out.println("����");
		}
		else {
			System.out.println("�̼�����");
		}
		
		
		
	}
	
	
	
	
	
}
