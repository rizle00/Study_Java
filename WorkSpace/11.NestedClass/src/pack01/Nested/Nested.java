package pack01.Nested;

public class Nested {
	//클래스 내부에 선언 된 것 멤버
	//멤버의 종류 : 필드 메소드 생성자 클래스
	// 인스턴스 : 클래스가 인스턴스화(객체) 과정을 거쳐야만 사용가능 객체. -> 접근방법
	// 스태틱 : 클래스에 접근하면 사용 가능 클래스. -> 접근방법
	// 구분? 선언 방식에 따라?`
	
	public int field;
	public static int field2;
	
	public void method() {
		System.out.println("mehtod1" + field2);
	}
	
	public static void method2() {
		Nested nes = new Nested();
		System.out.println("method2" + nes.field);
		// 스태틱에 인스턴스를 올려서
	}
	
	public class NesInner{
		public NesInner() {
		}
		String iField;
		public void iMethod() {
			System.out.println("iMethod");
		}
	}
	
	public static class NesInner2{
		public NesInner2() {
			// TODO Auto-generated constructor stub
		}
		static int iint;
		String iField;
		public void iMethod() {
			System.out.println("static");
		}
	}
	
	public void nesInner3(){
		class NesInner3{
			String ifield;
			public void iMethod() {
				System.out.println("in method");
			}
		}
		NesInner3 nes = new NesInner3();
		nes.ifield = "aa";
		nes.iMethod();
	}// 클래스 지역 클래스...
	
	public void method4() {
		int num = 10;
	}
}
