package exam.testAbstract;
//접근 제한자 abstract 클래스
public abstract class Animal { 
	//변수.
	public String kind;// 종류
	
	//abstract 키워드가 들어간 메소드는 구현부를 넣으면 x
	public abstract void breathe(); //메소드의 선언 , abstract라는 추상 클래스 명시가 있는 클래스만 메소드 선언이 가능함.

	//이거는 음식을 먹는 메소드, 파라메터로 음식을 받고, 메소드후 포만감을 int로 받아옴
	public abstract int eat(String food);
	//메소드의 정의
	public void method() {
		
	}
	
}
