package pack03;

import pack01.A;

//private 은 Class 내부에서의 공유 이기떄문에 Class 앞에 붙을 수 없음.
//멤버
public class D {
	A pack1_A = new A();
	// 패키지는 클래스를 유일하게 구별하게 만드는 실별자
	pack03.A pack3_A = new pack03.A();
	public D publicD = new D();
	D defaultD = new D(3);
	private 
	D privateD = new D("a");
	public D() {
		System.out.println("public 생성자 : 파라메터 없음");
	}
	 D(int a) {
		System.out.println("default 생성자 : 파라메터 없음");
	}
	private D(String b) {
			System.out.println("private 생성자 : 파라메터 없음");
		}
}
