package codes;

public class MainDrive {

	public static void main(String[] args) {
		
//  �� ������ �����ʼ���.
	
	int userAge = 35;
	double userHeight = 175.5;
	double userWeight = 85.3;
	int money = 100000;
	boolean isHandsome = true;
	
// 	�Ұ��� ���� �� ������ ? �䱸������ �񱳿����� / ���������� �������� ǥ��		
	
//  1������� �̻��� : Ű�� 180�̻��� ���.
	
	System.out.println(userHeight>=180);
	
//  2�� : �߻������� OK
	System.out.println(isHandsome);
//  3�� : �ڻ��� 100���� �̻��̸� OK
	System.out.println(money>= 1000000);
//  4�� : ���̰� 28�̻�, Ű��175�̻�.
	System.out.println(userAge>=28 && userHeight >=175);
//  5�� : �ڻ��� õ���� �̻��̰ų�, Ű�� 180�̻�.
	System.out.println(money>=10000000 || userHeight >=180);
//  6�� : ���� ������ �ȴ�.
	System.out.println(!(money < 0)); //0���� ������ �´� ���� 
//  ���� : ������ �ʾ����� ���ڴ�. => (Ű - 100)*0.9 < ü��
	System.out.println((userHeight - 100) * 0.9 < userWeight);
	
	}
}
