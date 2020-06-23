package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
			
		Scanner scan = new Scanner(System.in);
		System.out.print("È¦/Â¦ ÆÇ´Ü ¼ıÀÚ ÀÔ·Â: ");
		int number = scan.nextInt();
//		¼ıÀÚ°¡ È¦? Â¦? ÆÇ´Ü
		if (number%2 ==0) {
		System.out.println("Â¦¼ö");
		}
		else {
		System.out.println("È¦¼ö");
		}
	}
}
