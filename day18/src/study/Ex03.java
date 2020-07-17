package study;

interface Inter03 {
	public abstract void inter03Method();
}

interface Inter04 {
	public abstract void inter04Method();
}

interface Inter05 {
	void inter05Method();
}

// 인터페이스 - 인터페이스 이면 extends. 일반 클래스는 implements
interface SubInter extends Inter03, Inter04, Inter05 {

}

class Sub2 implements SubInter { //부모 상속받은 자식 클래스의 접근제한자는 부모의 것 보다 같거나 넓어야함}
//	=public abstract void inter03Method();
	public void inter03Method() {
		System.out.println("inter03Method() overriding");
	}
	public void inter04Method() {
		System.out.println("inter04Method() overriding");
	}
	public void inter05Method() {
		System.out.println("inter05Method() overriding");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Inter03 i3 = new Sub2();
		Inter04 i4 = new Sub2();
		Inter04 i5 = new Sub2();
			Sub2 s2 = new Sub2();
		
		s2.inter03Method();
		s2.inter04Method();
		s2.inter05Method();
		
		i3.inter03Method();
//		i3.inter04Method(); 접근은 할수 있으나 권한이 없다.
//		i3.inter05Method();
		
//		i4.inter03Method();
		i4.inter04Method();
//		i4.inter05Method();
		
//		i5.inter03Method();
		i5.inter04Method();
//		i5.inter05Method();
		
		
	}
}
