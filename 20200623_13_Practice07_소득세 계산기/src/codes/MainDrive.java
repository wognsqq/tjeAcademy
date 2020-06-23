package codes;

import java.util.Scanner;

public class MainDrive {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("연 소득 금액을 만원 단위로 입력하세요 : ");
	double myYearIncome = scan.nextDouble();
//	내 소득이 어느 구간인지?
//	그 구간에 따른 실 수령액 단순 계산
	
	double realIncome = 0;
//  일단 0으로 초기화
	
	if (myYearIncome<=1000) {
	realIncome = myYearIncome * 0.94; // 6%징수금액
	
	}
	else if (myYearIncome <= 4000) {
	realIncome = myYearIncome * 0.85; // 15%징수 금액	
	}
	else if (myYearIncome <= 8000) {
	realIncome = myYearIncome *0.65; //35%징수
	
	System.out.println("실 수령액: "+ realIncome +"만원");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	