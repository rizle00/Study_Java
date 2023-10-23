package pack01.testInterface;

//  class => interface
public interface TestInterface {
//  인터페이스에서 구현하는 모든 것들은 추상 메소드, 상수
	//클래스를 만들기 위한 설계도
	//여러 개발자가 같은 인터페이스를 상속받고 각자의  DAO를 만들고 병합하면 오류없이 코드 호출이 가능함.(Spring MVC)
	//final -> 상수 고정값, 초기값 설정 후 변경이 불가능
	String SERVER_IP ="192.168.0.46"; // cmd -> ipconfig
	void search();//->  선언
	void insert();
	
}
