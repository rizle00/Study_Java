package exam.changeType2;

public class Child extends Parent {
	@Override
	public void method1() {
		System.out.println("자식 클래스 메소드1");
		method3();
	}
	
	public void method3() {
		System.out.println("자식 클래스 메소드31111111");
		super.method1();
	}

}
