package codes;

public class MainDrive {

	public static void main(String[] args) {
		
//  한 남자의 프로필설정.
	
	int userAge = 35;
	double userHeight = 175.5;
	double userWeight = 85.3;
	int money = 100000;
	boolean isHandsome = true;
	
// 	소개를 받을 수 있을지 ? 요구사항을 비교연산자 / 논리연산자의 조합으로 표현		
	
//  1번사람의 이상형 : 키가 180이상인 사람.
	
	System.out.println(userHeight>=180);
	
//  2번 : 잘생겼으면 OK
	System.out.println(isHandsome);
//  3번 : 자산이 100만원 이상이면 OK
	System.out.println(money>= 1000000);
//  4번 : 나이가 28이상, 키가175이상.
	System.out.println(userAge>=28 && userHeight >=175);
//  5번 : 자산이 천만원 이상이거나, 키가 180이상.
	System.out.println(money>=10000000 || userHeight >=180);
//  6번 : 빚만 없으면 된다.
	System.out.println(!(money < 0)); //0보다 작으면 걔는 빼고 
//  응용 : 마르지 않았으면 좋겠다. => (키 - 100)*0.9 < 체중
	System.out.println((userHeight - 100) * 0.9 < userWeight);
	
	}
}
