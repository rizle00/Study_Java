package pack01.exString;

import java.util.Scanner;

public class Ex02_StringNull {
public static void main(String[] args) {
	//기본형 데이터 타입  vs 참조형 타입
	// 두개의 차이를 3개 이상 설명할 수 있는지 ?
	// 저장방식 비교방식 네이밍 방식
	String str1 = null; // 참조형 데이터 타입인데 stack 에 참조를 시작하지 않음을 표시함. 
	//객체(Object): 참조형데이터 타입은 모두 참조를 시작해야만 , 내부에 있는 기능이나 값을 이용할 수 있다.
	Scanner sc = null;
	//모든 객체는 new 라는 키워드(문장)을 통해서 heap에 새로운 영역을 만들고 참조를 시작함. 
	String str2 = new String("A");
	String str3 = new String("A");
	if(str2==str3) {
		System.out.println("같음");
	} else {
		System.out.println("다름");
	}
//	if(sc!=null) {
//	sc.nextLine();
//	}
//	if(null!=sc) {
//		sc.nextLine();
//	}
//	
}
}
