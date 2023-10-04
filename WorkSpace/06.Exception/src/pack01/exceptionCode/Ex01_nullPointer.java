package pack01.exceptionCode;

import java.util.Scanner;

public class Ex01_nullPointer {
public static void main(String[] args) {
	
	int []a = null;
	//참조형 데이터 타입은 아직 객체 참조를 시작하지 않음(null)상태에서는 모든 기능 사용X
	// 객체를 사용할 때 null이 아닌 상태에서만 쓰게끔 만들면 된다.
	Scanner sc = null;
	String str = null;
	if(str != null) {

		System.out.println(str.length());
		
	}
	if(sc!=null) {
		sc.nextLine();
	}
	System.out.println(a[0]);
	
	System.out.println("here");
}
}
