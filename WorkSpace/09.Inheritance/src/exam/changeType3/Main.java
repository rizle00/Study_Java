package exam.changeType3;

public class Main {
	public static void main(String[] args) {
		//부모클래스  변수명 = 자식클래스; 자동타입변환
		// 자식클래스 변수명 = (타입)부모클래스; 강제 타입 변환
		// 강제형변환은 특정한 상황에서만 사용됨, 안드로이드나 특정 프레임워크
		child child = new child();
		parent parent = new parent();// new parent(); ->  오류
		//객체를 생성할 때 사용된 인스턴스 : instanceof 사용 된 인스턴스를 비교하여 강제 형변환 가능 여부를 확인
		//비교할 객체 instanceof 비교할 클래스
		parent = child;
		child = (child) parent;
		
		if(child instanceof parent) {
			System.out.println("true");
			//parent = child;
		}else {
			System.out.println("false");
		}
		
		if(parent instanceof child ) {
			child = (child) parent;// 타입 변환이 가능할때만 실행하게함 
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		parent = child; //  자동 타입 변환
		parent.method1();
		parent.method2();
		System.out.println("부모클래스 =  자식클래스 가능(0)");
		

		child =(child)parent;
		child.method1();
		child.method2();
		child.method3();
	}
}
