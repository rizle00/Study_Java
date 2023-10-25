package pack02.An;

public class TestMain {
public static void main(String[] args) {
	TestClass test = new TestClass()//; -> 주의
	{
		int testField2 = 30;
		//익명지역
		@Override
		void testMethod() {
			//super.testMethod();
			System.out.println("익명의 지역에서 재정의"+ testField2);
		}
	};
	test.testField = 3;
	test.testMethod();
//익명의 클래스 지역 만들기
	
	
	//인터페이스도 인스턴스화가 가능함.
	//인터페이스의 규칙상 메소드는 반드시 구현되어 있어야 한다.
	TestInterface[] tiArr = new TestInterface[10];
	TestInterface tiNull = null;
	TestInterface ti = new TestInterface() {
		int num = 10;
		@Override
		public void method() {
			System.out.println("인터페이스 인스턴스화!"+num);
		}
	};
	ti.method();
}
}
