package exam.testProtected2;

import exam.testProtected1.A;
import exam.testProtected1.B;

public class Main extends A {
	int protected_field4;
	public Main() {
		this.protected_feild4 = super.protected_feild4;
		// 생성자를 이용해서 접근해서  빼오기
	}
	
public static void main(String[] args) {
	B b =  new B();
	int num = b.rtnAField();
	
	A a = new A();
	a.public_field1 =1;
	//default : 같은 패키지 내부에서만 접근이 가능
	//private : 같은 클래스 내부에서만 접근이 가능
	//protected : 같은 패키지 내부 또느 해당 클래스를 상속받은 클래스에서 사용이 가능
}
}
