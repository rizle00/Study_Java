package pack01.variable;

public class Ex03_Variable {
public static void main(String[] args) {
	int value = 10;
	int result= value+20;
	System.out.println(result);
	System.out.println(value);
	//int result = value+10;오류
	//The local variable value may not have been initialized
	//메인 메소드 내부에 있는 변수는 값 할당 즉 초기화 전에는 사용이 불가
}
}
