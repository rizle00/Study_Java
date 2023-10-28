package exam.testProtected1;

public class B  {
	public B() {
		
	}
	
	public void initA() {
		A a = new A();
		a.protected_feild4 = 4; //  protected 사용 가능. 같은 패키지
		
	}
	
	public A rtnA() {
		return new A();
	}
	public int rtnAField() {
		A a = new A();
		a.protected_feild4 = 4;
		return a.protected_feild4;
	}
}
