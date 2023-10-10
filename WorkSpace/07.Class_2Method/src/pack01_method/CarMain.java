package pack01_method;

import java.util.Scanner;

public class CarMain {
public static void main(String[] args) {
	//1. car의 인스턴스 멤버 -> car가 인스턴스화 -> 객체 -> 객체. 사용이 가능
	// 유지 보수가 편하다. 재활용성 up
	Scanner sc = new Scanner(System.in);
	
	Car car = new Car();
//	for( int i = 0; i<10; i++) {
//		car.kmj_method(); // 반복 
//	}
	car.kmj_method();// 만들어진 메소드를 호출 -> 메소드의 중괄호 블러킹 시작과 끝.
	car.kmj_method1("김민주");
	car.kmj_method1("전지현");
	car.kmj_method2("김민주", "휴식");
	car.kmj_method3("국어", 89);
	car.kmj_method4("저것",car.rtnMethod1()+4);
	int result = car.rtnMethod1();
	System.out.println(result);
	System.out.println(car.rtnMethod2(33));
	
}
}
