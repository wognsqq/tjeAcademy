package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Ȧ/¦ �Ǵ� ���� �Է�: ");
		int number = scan.nextInt();
//		���ڰ� Ȧ? ¦? �Ǵ�
		if (number%2 ==0) {
		System.out.println("¦��");
		}
		else {
		System.out.println("Ȧ��");
		}
	}
}
