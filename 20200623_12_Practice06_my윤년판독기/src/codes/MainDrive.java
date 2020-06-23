package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("윤년 여부 궁금한 년도 입력 :");
		
		int year =  scan.nextInt() ;
		
//4로 나눠 떨어지는지 (4로 나눈 나머지가 0인가?)검사	
		if (year %4 == 0) {
			
		}
		else {
// 4로 안떨어지니까 윤년 x
		System.out.println("4로 떨어지지 않으므로 윤년X");
		
		}
		if(year % 100 == 0) {
//		추가 검사 필요			
		}
		else if {
//		2012, 2020등의 경우로 윤년.
		System.out.println("4로 떨어지면서 100으로는 안나눠지므로 윤년 맞음");	
		}
		else {
// 		4로 안떨어지니까 윤년 x
		System.out.println("4로 떨어지지 않으므로 윤년 아님");
		}
	}	
	}
	
