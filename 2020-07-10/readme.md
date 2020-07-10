Ex 03
//		int 이하의 type들이 연산을 하면
//		피연산자들의 type이 모두 int로 자동 형변환됨.
//		피 연산자 중에 int type보다 큰 자료형이 있으면, 
//		가장 큰 자료형으로 자동 형변환되어서 연산됨.
//		타입 - 데이터를 저장하는 공간, 형식 
//		타입의 크기가 있는데 
//		boolean char, byte int long short ... 기본형 // 내부공간이 데이터를 표현하기 적당한 구조로 만들어져 있어
//		int에 데이터를 집어넣으면 소수점이 잘리는데, 
//		형변환 - 타입, 데이터를 넣는 공간을 바꾼다.
		
//		1byte - 8bit 2^8=256 반을 나워 음수 :128개 양수: 128개 
//		0을 양수 쪽에 포함하면 , 표현 개수와 숫자의 개수가 같음 음수쪽은, 양수는 0 포함하므로 127개, 127까지 표현
//		-2^7~(2^7-1)
//		Integer - 32bit =-2^31 ~ 2^31-1
//		형변환은 어떤 데이터 타입 속에 집어넣는 이야기
//		byte 데이터를 int로 옮겨담으면 데이터 손실이 일어나지 않는다. => 형변환 표시를 해주지 않아도 된다. 
//		int데이터를 주황색으로 옮겨담으면 손실이 일어날 수 있다. 
//		Character의 형변환은 아스키 코드로 하는데 0~2^8-1로 표현할 수 있는데 
//		캐릭터로 들어갈 때는, 캐릭터는 양수 값만 있으니까, 음수값 때문에 형변환표시를 해줘야함
//		float double 은 integer, long 보다 큼 , int에 들어간걸 float에 표현하면 형변환 표시를 해줘야함
//		long => float 형변환 필요 없음. total.nums.length => 정수만 표현이 됨 => float이하는 소수점 표현이 되는데,
//		옮겨담으면 .0000 으로 나옴 => 정수로 된 결과값을 넣으니 float에서는 잘려서 .0000이 되는거지
//		연산 자체를 float에서 하면 소수점이 나오겠지
//		integer보다 큰 값이 연산될 때는 
//		float average = (float)total / nums.length;
//		average = total / (float)nums.length;
//		average = total / 3.0F;   => 셋 중 하나 암거나 쓰면 됨..


Ex 04
//		"친구", value 값 // phoneBook은 static값 // 해쉬맵이 인스턴스니까 group에 할당할 수 있다..
//		HashMap group = (HashMap) phoneBook.get(groupName); 
//		친구 저장하는 해쉬맵, 학교 저장하는 해쉬맵, 회사 해쉬맵 따로 있음..
//		3개를 받을 수 있는 메소드 // 2개를 받을 수 있는 메소드 "회사"를 받는 키값, "학교"를 받는 키값.
//		phoneBook해쉬맵에 친구 학교 회사 기타 해쉬맵4개가 들어있다.  
//		출력 - Iterator를 동작 시킬 때 map에서 keyset 또는 entryset을 동작시켜야 함.
		

Ex05

//		for문 데이터의 i의 0번째는 a => 아무것도 없다, => else => "A가 오고 1로 감
//		i 가 1일때, K => else 1 i=2 일때 A, => if 로 가서 2가된다
//		d가 처음 등장했을때, containskey에서 키로 이미 존재하느냐? 아니오 => else,1 
//		이미 존재함? 예 => if=> key+1
//		A+1+1..// K+1+1...// D+1+1....
		
Ex08
//		primitive 는 값 하나밖에 없어서 wrapper class를 만들었다.

Ex14
//		Static이 붙은게 시간적으로 instance보다 앞서, 
//		Instance 가 생성되기 전에 참조변수를 못불러오져.  math.random() 메쓰 클래스의 인스턴스 점찍고 실행해야 하는데
//		static 이라서 메쓰는 바로 실행이 가능했다. new 할 필요없이
//		웹 프로그래밍은 24시간 364일 static이라는 변수는 올라갈때 , method area에 들어가 
//		스태틱 변수는 프로그램 종료할 때까지 있어, 누적으로 증가하는게 없어 
//		인스턴스가 생성될 떄 값을 공유할 수가 없어, 
//		스태틱이 안붙은 것은 인스턴스 멤버 생성한 다음에 가능해, 
//		스태틱 다음에 => 인스턴스 만들고 생성한것
//		스태틱 메소드는 클래스의 인스턴스를 생성하기 전부터 작동이 가능하기 때문에, 인스턴스를 생성하고 난 다음에 참조변수로 접근해서 사용가능하다.
//		

Ex16
//		생성자, constructor, public A(){}, 변수는 기본적으로 초기화를 하지않으면 사용할 수 없어
//		지역변수는 사용하기 전에는 명시를 해야하는데, 멤버변수는 해도되고 안해도되고.
//		변수는 사용 전에 초기화를 해야하는데, 클래스를 사용한다는 의미?
//		클래스 속에 만든 멤버변수와 멤버들을 사용하려 하는 것.
//		멤버 변수를 메모리 위에 올려서 사용한다는 것은 변수를 사용한다는 것
//		클래스의 멤버를 초기화 시키는 것이 생성자, 생성자 혼자서 하는 일이 아니라 new 생성자와 함꼐 하는 일.
//		instance를 생성할 때는 new 생성자와 함께. 메모리에 올려진 인스턴스 변수를 초기화 하는게 생성자가 하는 일
//		메쏘드가 오버로딩이 되듯이, 생성자도 오버로딩이 된다. 매개변수에 타입, 
//		생성자는 인스턴스가 만들어질때 실행
//		생성자- 메소드 // 생성자 - 생성자 끼리도 호출이 가능한데, 생성자-생성자일 경우 this(), 그 괄호에 달라고 하는 값을 넣어줘
//		매개변수 없는 것을 기본생성자. integer값을 달라는 생성자면 괄호안에 인티져 값을 넣자
