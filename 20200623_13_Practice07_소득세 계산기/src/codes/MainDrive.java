package codes;

import java.util.Scanner;

public class MainDrive {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("�� �ҵ� �ݾ��� ���� ������ �Է��ϼ��� : ");
	double myYearIncome = scan.nextDouble();
//	�� �ҵ��� ��� ��������?
//	�� ������ ���� �� ���ɾ� �ܼ� ���
	
	double realIncome = 0;
//  �ϴ� 0���� �ʱ�ȭ
	
	if (myYearIncome<=1000) {
	realIncome = myYearIncome * 0.94; // 6%¡���ݾ�
	
	}
	else if (myYearIncome <= 4000) {
	realIncome = myYearIncome * 0.85; // 15%¡�� �ݾ�	
	}
	else if (myYearIncome <= 8000) {
	realIncome = myYearIncome *0.65; //35%¡��
	
	System.out.println("�� ���ɾ�: "+ realIncome +"����");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	