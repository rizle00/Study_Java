package exam.testExtends;

// 부모 클래스 : 어떠한 다른 클래스가 자식 클래스로부터 선택 받는 순간. -> 부모 클래스
public class Parent_Class {
	// Parent_Class 멤버 : 필드(속성) , '인스턴스 멤버' -> 외부 클래스에서 사용시 인스턴스화 필요
	public String parent_field1 ="Public 출력";
	String parent_field2 ="Default";
	private String parent_field3 = "Private";
	
	public String getParent_field3() {
		return parent_field3;
	}

	public void setParent_field3(String parent_field3) {
		this.parent_field3 = parent_field3;
	}

	public void parentMethod() {
		String localValuable ="지역 변수";
		System.out.println("부모 클래스의 인스턴스 멤버(메소드) 입니다.");
	}
}
