package study;
// default method : 인터페이스 내에 있는 일반 메소드 
interface Inter{
	default void method1() {
		System.out.println("method1() in Inter");
	}
	default void method2() {
		System.out.println("method2() in Inter");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in Inter");
	}
}

interface Inter2{
	default void method1() {
		System.out.println("method1() Inter2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in Inter2");
	}
}
class Parent{
	public void method2() {
		System.out.println("method2() in Parent");
		
	}
}
class Child extends Parent implements Inter, Inter2{
	public void method1() {
		System.out.println("method1() in Child");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method1();
		ch.method2();// **부모가 (클래스, 인터페이스 )두개면 클래스를 우선으로 함
		Inter.staticMethod();
		Inter2.staticMethod();
		
	}
}
