package study;

interface Inter06{
	public abstract void inter06Method();
}
abstract class Super2{
	public abstract void super2Method();
	
}
class Sub3 extends Super2 implements Inter06{
	public void inter06Method() {
		System.out.println("inter06Method() overriding");
	}
	
	public void super2Method() {
		System.out.println("super2Method() overriding");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Sub3 s3 = new Sub3();
		Inter06 i6 = new Sub3();
		Super2 sp2 = new Sub3();
		
		s3.inter06Method();
		s3.super2Method();
		
		i6.inter06Method();
//		i6.super2Method();
//		i6의 권한으로 ~~~method접근 // 주소지 내의 연결된 메소드만 실행이 가능 
//		차근차근 올라가서(i6 - inter06 - interface Inter06)
		
//		sp2.inter06Method();
		sp2.super2Method();
				
	}
}






