package codes;

public class MainDrive {

	public static void main(String[] args) {
		
		int num1 = 10;
		num1++;
		++num1;
		System.out.println(num1);
		
		
// �������� �ٷ� syso���� ��� ����.
		System.out.println(num1+10); // 22
//	���� �����ڸ� syso���� ����ϸ�?
// 	 �����ڰ� �ڿ� (num1++) : �ٸ� ������� �� ó���ϰ� ���� num1�� ����.
//	�����ڰ� �տ� (++num1) : �켱 num1���� ������Ű�� ������ 1�� �������Ѷ�		
	System.out.println(num1++); // ��� : 12, => num1 13���� ����
	System.out.println(++num1); // num1 14�� ���� => ��� :14
	
	
	
	
	
	
	int questionNum = 20;
	System.out.println(questionNum++); // ��� : 20 => q :21/ 20
	System.out.println(++questionNum); // q : 22 => ��� :22/ 22
	System.out.println(questionNum--); // ��� : 22 => q :21/ 22
	System.out.println(++questionNum + 10); // q:22 => ��32
	System.out.println(questionNum++ + 2* 10); // 40
	}
}
