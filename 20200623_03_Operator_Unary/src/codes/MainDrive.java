package codes;

public class MainDrive {

	public static void main(String[] args) {
		
		int num1 = 10;
		num1++;
		++num1;
		System.out.println(num1);
		
		
// 연산결과를 바로 syso에서 사용 가능.
		System.out.println(num1+10); // 22
//	단항 연산자를 syso에서 사용하면?
// 	 연산자가 뒤에 (num1++) : 다른 모든일을 다 처리하고 나서 num1을 증가.
//	연산자가 앞에 (++num1) : 우선 num1부터 증가시키고 나머지 1을 증가시켜라		
	System.out.println(num1++); // 출력 : 12, => num1 13으로 변경
	System.out.println(++num1); // num1 14로 증가 => 출력 :14
	
	
	
	
	
	
	int questionNum = 20;
	System.out.println(questionNum++); // 출력 : 20 => q :21/ 20
	System.out.println(++questionNum); // q : 22 => 출력 :22/ 22
	System.out.println(questionNum--); // 출력 : 22 => q :21/ 22
	System.out.println(++questionNum + 10); // q:22 => 출32
	System.out.println(questionNum++ + 2* 10); // 40
	}
}
