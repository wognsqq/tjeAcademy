package codes;

public class MainDrive {

	
	public static void main(String[] args) {
	
	int num1 = 80;
// num1이 50보다 크다면 "50 넘음" 문장 출력
	
	if (num1>50) {
	
		System.out.println("50넘음");
		
	}
	else {
		System.out.println("50 이하임");
	}
	
	
	int myScore = 55;
	
//	70점 이상 : 합격
//	(70은 안되지만) 60점 이상 :  실기 재시험
//	(60점도 안되면) 50점 이상: 필기 재시험	
//	그 이외 : 불합격
	
	if (myScore >= 70)
		System.out.println("합격");
	else if (myScore >= 60)
		System.out.println("실기 재시험");
	else if (myScore >= 50)
		System.out.println("필기 재시험");
	else {
		System.out.println("불합격");
	}
	}
}
