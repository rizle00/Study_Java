package exam.testExtends2;

//   sum 메소드, minus 메소드 상속받음, (기존기능)+ (SubClass기능)
public class SubClass extends SuperClass { // 상속받기
	//@override <- 
	//부모클래스의 기능을 자식클래스가 물려받아 '형태를 유지'하고 기능을 바꿈 => 재정의!!
	//@ :  어노테이션 , 기계가 (Java)가 인식을 하는 주석
	
	
	public SubClass() {
		System.out.println("자식 클래스 생성자");
	}
	
	@Override
	public int sum(int x, int y) {
	// TODO Auto-generated method stub
	return super.sum(x, y)+1; // 부모 클래스의 기능을 수정 -> 재정의
							// super -> 부모 클래스를 호출하며 인스턴스화
	}
	
		 public int mul (int x, int y) {
			 return x*y;
		 }
		 public int div (int x, int y) {
			 return x/y;
		 }
}
