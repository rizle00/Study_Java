package pack01;

import pack02.C; // 다른 패키지의 클래스 사용시 필요
import pack03.D;

//private 은 Class 내부에서의 공유 이기떄문에 Class 앞에 붙을 수 없음.
//멤버
//public 접근 제한자 (접근 제어자) :
//default 접근 제한자 : 같은 패키지 내부에서만 접근이 가능하다.
public class A {
	B b = new B();
	C c = new C();
	// 패키지는 클래스를 유일하게 구별하게 만드는 식별자
	pack03.A a = new pack03.A();
	
	public D publicD = new D();
//	D defaultD = new D(3);
//	 
//	 private D privateD = new D("a");
		
		public A() {
			System.out.println("public 생성자 : 파라메터 없음");
		}
		 A(int a) {
			System.out.println("default 생성자 : 파라메터 있음");
		}
		private A(String b) {
				System.out.println("private 생성자 : 파라메터 있음");
			}
	
}
