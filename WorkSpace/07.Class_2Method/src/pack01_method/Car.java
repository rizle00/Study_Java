package pack01_method;

public class Car {
	// 멤버. 필드, 속성, 인스턴스변수(iv), 메소드
	// 클래스 중괄호 사이에 있는 모든 것  은 멤버
	// 변수, 클래스 등등 선언되어 있는 것 은 필드, 속성, 인스턴스 변수, iv
	// 기능을 담당 -> 메소드 : ex) main 메소드 -> 자바 프로그램의 시작 기능을 담당
	 // Method 의 선언  (정의)
	// 접근 제한자 : public > protected > default > private : 지금은 public (공공의)
	// 리턴 타입 : void 이냐 void 가 아니냐
	// 1. 접근제한자 2. 리턴타입 3. 메소드명 4.(매개변수-파라미터) 5. {
		//코드 }
	
	//class 타입 외 -> 소문자 시작, 카멜
	public void kmj_method ( ) {
		System.out.println("void 형태는 return 타입이 없음.??");
		System.out.println("현재 method는 클래스의 blocking 안에 있음");
		System.out.println("↑ kmj_method 는 클래스의 멤버, 인스턴스 멤버");
	}
	// (x, y) ->
	// 파라미터, 매개 변수 ( 메소드 동작 시 필요한 값이 있다면 "뭐든" 받아올 수 있음)
	// 변수 선언 (받아오기 위한 그릇)
	// 메소드의 파라미터 
	//정의 = 호출 : 변수 초기화 식
	//파라미터가 2개 이상은 , <- 로 구분
	public void kmj_method1(String name) {
		System.out.println(name+"(이)가 공부 중");
		
	}
	public void kmj_method2(String name, String state) {
		System.out.println(name + "(이)가"+ state + "중");
	}
	public void kmj_method3(String subject, int score) {
		System.out.println(subject+" : "+score+"점 입니다");
	}
	public void kmj_method4(String content, int number) {
		for(int i =0;  i<number ; i++) {
		System.out.println(content+(i+1)+"번째 출력중...");
		}
	}
	//뭐든지 내가 필요한 것(리턴)
	//void가 아닌 경우에는 주어진 리턴타입을 반드시 "반환해줄 것" => return
	// void 로 만들어진 것은 변수에 담기지 않음.
	public int rtnMethod1() {
		int result = 1;
		System.out.println("rtnMethod");
		return result;		
	}
	public int rtnMethod2(int number) {
		System.out.println("rtnMethod2");
		return number;// 기본값
		
	}
}
