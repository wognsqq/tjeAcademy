package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �ҵ� �ݾ��� ���� ������ �Է��ϼ���");
		
		double myYearIncome = scan.nextDouble();
		
//		�Ǽ��ɾ��� ���� ����
		
		double realIncome = 0; // ������ �Ǽ��ɾ��� �ջ� => 0���� ���.
		
//		�� �����ؾ����� ���� �ݾ� ���� ����
		double remainClaculateIncome = myYearIncome; //���������ʿ信�� ����
//		���� ����ݾ��� ������? ( ù ���� - �� �� ������ ������?)
//		1000���� ���� : ���� 6% ¡���� ��� ��
		if (remainClaculateIncome <=1000) {
// 		���� 6%¡���Ѱ� �״�� �Ǽ��ɾ׿� �����ϴ°ɷ� ��� ��.
		realIncome = remainClaculateIncome *0.94;
//		1000���� �Ѿ��? 1000������ 6%¡��, ���� �ݾ��� ���� ���.
		realIncome += 1000 *0.94;
//		���� �ʿ� �ݾ��� 1000���� �ٿ�����. (1000���� ���� ��)
		remainClaculateIncome -= 1000;
//		�߰� �˻� ����.
//		���� ���� �ݾ��� => 3000�� �ѳ� �ȳѳ�.
		if (remainClaculateIncome =< 3000) {
//		���� ���� �ݾ��� 3õ����.
//		���� �� ���� 15% ¡���ؼ� �ջ�
		realIncome += remainClaculateIncome*0.85;
		
		}
		else {
		//3õ �Ѵ� ���.
		// 3õ���� " 15% ¡��, �� �̻� => �߰� ��� �ʿ�
		realIncome += 	
		}
		
		
		}
		
		
	}
}
