package pack01.variable;

public class Ex01_Variable {
	public static void main(String[] args) {
		//변수라는 것은 값을 저장하기 위한 것.
		//변수의타입 변수이름 ;<= 변수의 선언  : 이타입의 변수를 해당 이름으로 사용할 것을 미리 알려줌.
		//변수의 값 할당 : 변수명 = '변수타입에 맞는 값';
		int 변수;
		변수=10;
		System.out.println(변수);
		int x,y,z;
		x=5; y=10; z=15;
		int a=1, b=2, c=3;
		//println 반드시 변수 하나 이거나 합을 통해서 하나로 합쳐진것만 가능
		//syso(x) 가능
		//syso(x,y) 불가능 : 변수가2개임
		//syso(x+""+y+""+z); 숫자형 변수의 합을 막는다	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a+""+b+""+"c");
		//1.블럭킹 내부에서 같은 이름의 변수는 선언이 불가능하다.
		//2.변수이름규칙: 첫번째 글자는 소문자로 시작하고 의미있는 단어들을 연결해서 사용
		//단어들의 연결은 대문자로 구분한다. ex) int carMaxSpeed 차 최대속도. ※카멜
		//3.자바 예약어는 사용할 수 없다.ex) class, void, int 등 이미 기능중인 것
		
		}
}
