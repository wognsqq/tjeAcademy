package codes;

import java.util.Scanner;

//�Ǽ��ɾ� ���� - Hard
// ������ó�� ���

public class MainDrive {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �ҵ� �ݾ��� ���� ������ �Է��ϼ��� : ");
		double myYearIncome = scan.nextDouble();
		
//		�Ǽ��ɾ��� ���� ����
		
		double realIncome = 0; // ������ �Ǽ��ɾ��� �ջ� => 0���� ���.
		
		
//		�� �����ؾ����� ���� �ݾ� ���� ����.
		double remainCalculateIncome = myYearIncome; //���� ���� �ʿ信�� ����.
		
//		���� ����ݾ��� ������? (ù ���� -> �� �� ������ ������?)
//		1000���� ���� : ���� 6% ¡���� ��� ��.
		if (remainCalculateIncome <= 1000) {
			
//			���� 6% ¡���Ѱ� �״�� �Ǽ��ɾ׿� �����ϴ°ɷ� ��� ��.
			realIncome = remainCalculateIncome * 0.94;
		}
		else {
//			1000���� �Ѿ��? 1000���� �� 6% ¡��, ���� �ݾ��� ���� ���.
			
			realIncome += 1000 * 0.94;
					
//			���� �ʿ� �ݾ��� 1000���� �ٿ�����. (1000������ ���� ��)
			remainCalculateIncome -= 1000;
			
//			�߰� �˻� ����.
//			���� ���� �ݾ��� => 3000�� �ѳ� �ȳѳ�.
			
			if (remainCalculateIncome <= 3000) {
//				���� ����ݾ��� 3õ ����.
				
//				���� �� ���� 15% ¡���ؼ� �ջ�.
				realIncome += remainCalculateIncome * 0.85;
				
			}
			else {
//				3õ �Ѵ� ���.
				
//				3õ���� : 15%¡��, �� �̻� => �߰� ��� �ʿ�
				
				realIncome += 3000 * 0.85;
				
//				3õ���� �߰� ����. => ���� ����ݾ��� 3õ���� �ٿ�����.
				remainCalculateIncome -= 3000;
				
//				���� �ݾ� : 4õ ����? �ƴѰ�?
				if (remainCalculateIncome <= 4000) {
//					���� �ݾ� ���θ� 24% ¡���ؼ� �ջ�.
					realIncome += remainCalculateIncome * 0.76;
				}
				else {
//					4õ �Ѿ => 4000�� ���ؼ��� 24%, �߰��� 35% ¡������ �ݾ׵� �ִ�.
					realIncome += 4000 * 0.76;
					
//					���� ���� �ݾ��� 4õ ������.
					remainCalculateIncome -= 4000;
					
//					�������ݾ��� ���� 35% ¡��. => �Ǽ��ɾ� ��� ��.
					
					realIncome += remainCalculateIncome * 0.65;
					
					
				}
				
			}
			
			
		}
		
		
//		���� �Ǽ��ɾ� ǥ��
		System.out.println("���� ���ɾ� : " + realIncome + "����");
		
		
	}
	
}





