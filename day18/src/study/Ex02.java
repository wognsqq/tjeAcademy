package study;

abstract class Super{
	
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	public abstract void test5();
	public abstract void test6();
	public abstract void test7();
	public abstract void test8();
	public abstract void test9();
	public abstract void test10();

}
// 슈퍼를 상속하는 일반클래스를 만들어서 sub에 test10 까지 꼬라박자
// 중간 완충장치
class Adapter extends Super{

	@Override
	public void test1() {
	}

	@Override
	public void test2() {
	}

	@Override
	public void test3() {
	}

	@Override
	public void test4() {
	}

	@Override
	public void test5() {
	}

	@Override
	public void test6() {
	}

	@Override
	public void test7() {
	}

	@Override
	public void test8() {
	}

	@Override
	public void test9() {
	}

	@Override
	public void test10() {
	}
	
}

abstract class Sub extends Adapter{
	public void test1()//선언부
//	=public abstract void test1();
	{	//body : 몸통 :구현부 //어댑터를 상속하여 Sub클래스에서 다시 선언한 1, 5 외에 상속
		System.out.println("test1() overriding");
	}
	public void test5(){
		System.out.println("test2() overriding");
	}
}

abstract class Test{
	public void test() {
		
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.test1();
		sub.test2();
		sub.test3();
		sub.test4();
		sub.test5();
		sub.test6();
		sub.test7();
		sub.test8();
		sub.test9();
		sub.test10();
	}

}
