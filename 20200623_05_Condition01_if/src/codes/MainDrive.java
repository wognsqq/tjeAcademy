package codes;

public class MainDrive {

	
	public static void main(String[] args) {
	
	int num1 = 80;
// num1�� 50���� ũ�ٸ� "50 ����" ���� ���
	
	if (num1>50) {
	
		System.out.println("50����");
		
	}
	else {
		System.out.println("50 ������");
	}
	
	
	int myScore = 55;
	
//	70�� �̻� : �հ�
//	(70�� �ȵ�����) 60�� �̻� :  �Ǳ� �����
//	(60���� �ȵǸ�) 50�� �̻�: �ʱ� �����	
//	�� �̿� : ���հ�
	
	if (myScore >= 70)
		System.out.println("�հ�");
	else if (myScore >= 60)
		System.out.println("�Ǳ� �����");
	else if (myScore >= 50)
		System.out.println("�ʱ� �����");
	else {
		System.out.println("���հ�");
	}
	}
}
