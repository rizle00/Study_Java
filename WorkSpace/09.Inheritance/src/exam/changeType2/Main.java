package exam.changeType2;

import exam.testExtends2.SuperClass;

public class Main {
public static void main(String[] args) {
	// 자식 클래스를 만들고 사용하게 되면 모든 기능을 사용할 수 있음
	Child child = new Child();
	child.method1();
	child.method2();
	child.method3();
	System.out.println("-----");
	Parent parent = child;
	parent.method1();
	parent.method2();
	
	parent = new Child2();
	parent.method1();
	parent.method2();
	
	//parent라는 더 큰 범위안에 다양한 자식클래스를 바꿔가면서 사용하는게 가능함
	//실질적으로  parent 하나만 메모리에 있고 , 내부에 있는 메소드 구조를 유연하게 바꿔가면서 사용이 가능
	//프로모션 자동 타입 변환 
}
}
