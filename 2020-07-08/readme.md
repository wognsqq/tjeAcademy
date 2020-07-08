20200708
- 클래스 - 데이터 타입 - 자료형
 데이터를 보관하는 공간의 크기와 모양 => 타입
- int type => bit는 데이터를 한번 처리할 때 사용되는 메모리 수.(64bit)
- int byte => 연산할 때는 integer로 변환해서 연산
- 자바에서는 4바이트로 계산

- type은 크기가 정해져 있다. 정수, 실수 보관하는 타입이 다른데, 정수는 byte short int long // 어떤 데이터인지 표현할 때 중요한게, 부호 bit, significant bit.
- 정수를 표현하는 공간, 실수를 표현하는 공간이 다르게 만들어져 있다.

- primitive type, reference type...
*소스코드 나오지 않을 경우 - 
## Primitive type 
- 변수(이름,name)를 왜 사용하냐면, 램 안에 address가 다 지정되 있는데, 램에 데이터를 올리면, 올라간 지점에 정해진 주소가 데이터의 주소, => 이름표를 붙이자.(number score name..)
- ip주소와 port number로 통해 컴퓨터에 접속 => 아이피 주소 기억하기 힘드니, 도메인 사용=> 변수도 마찬가지 원리.
- int number; => int공간의 number이름표
- number = 100; =>number 공간의 값 = 100
- Primitive type은 이렇게 동작.. 비교적 덩치가 작아 바로 값에 대입해도 큰 상관이 없음..
- Primitive type은 비교적 작은 데이터 공간확보, 
## Reference type
- String name = new String("이순신"); , name은 이순신의 이름표
- new라는 연산자가 메모리 공간 확보(RAM 어딘가에), 이순신은 데이터 안에, 그 지점의 자리는 주소.
- 변수 이름 저장되는 공간과, 이름표 저장되는 공간이 다름..
- 주소를 참고해서 실제 데이터에 Access, 참고자료.


- .은 접근연산자. ss operator
- import java.util.Scanner; 자바 속에 유틸 속에 스캐너를 사용하겠다. (오라클에서 다 지정해줌)
- int num = sc.nextInt();
  System.out.println("num: "+num);
- nextint가 속한 클래스가 필요하므로 정의 해줌
- 변수는 사용하기 전에 초기화해야 하는데, 멤버변수는 자동초기화가 되고, 지역변수는 초기화를 하고 사용해야 함.
- 생성자는 new 연산자와 같이 생성됨. 생성자는 멤버변수 초기화 하는데 사용된다. 
- Scanner sc(생성자) = new와 함께 사용하여 실행할 수 있는 상태 (데이터가 올라가 있는 상태)=> 인스턴스 = 객체 = 오브젝트
- 메모리에 올라가면 주소가 얻어진다. 
- 데이터가 커서 한곳에 올려만 놓고, 주소만 메모리에 저장해서 사용..


Collection 은 데이터를 보관하는 곳 (주소만 보관)
- 클래스들을 보관 
- 배열로 데이터를 보관하게 되면, 
- int[] scores = now [] {100,12,84,95,24}; 크기가 5인 integer 타입 배열 - primitive type 배열 (각각 공간에 직접 데이터 저장)
- String[] fruits = new String[] {"사과","복숭아","포도"}; 사과 복숭아 포도의 주소만 저장되 있음. 문자는 다른 곳에 저장 - reference type (주소가 저장됨)
'''java
class Car(카 클래스에 주소 저장){
	int tire; (인스턴스)
	int door;
	
}




public class Ex01 {
	public static void main(String[] args) {
		new Car();
		Car[] cars = new Car[3];
 
'''

Ex02
- collection type을 저장할 때는 타입을 보통 지정 한다 <>
- <String> => 스트링 값만 저장한다.
- 제네릭은, 어떤 클래스를 만들 때, 클래스 안에서 다른 type을 사용할 수 있는데, 그 타입을 정의하는 것.
  ArrayList<제네릭> list = new ArrayList<제네릭>();
- Primitive type 8개를 클래스로 만든 것.
-   
