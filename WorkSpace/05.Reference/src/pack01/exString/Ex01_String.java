package pack01.exString;

import java.util.Scanner;

public class Ex01_String {
public static void main(String[] args) {
	//String 일반 변수와 드람. 대문자로 시작 (Class,  계속 만들고 있는것.)
	//참조형 데이터 타입 (열거 클래스 String 인터페이스 배열)
	// stack 메모리에 값을 바로 담는 경우 (기본형 데이터 타입)
	// heap 메모리에 데이터를 담고 stack 메모리에 heap 메모리의 주소부를 저장하는 경우(참조형 데이터 타입)
	// ++ <- stack 메모리의 값 비교
	// stack : int num1=10, num2 =10: 10 : num1[10], num2[10] -> 값 비교 정확한 비교결과
	//stack : String str1="A", str2="B" : str1[100] , str2[200]
	Scanner sc = new Scanner(System.in);
	
	String str1 = "kmj";
	String str2 = "kmj";
	String str3 = sc.nextLine();
	System.out.println("str1: "+System.identityHashCode(str1));
	System.out.println("str2: "+System.identityHashCode(str2));
	System.out.println("str3: "+System.identityHashCode(str3));
	if (str1 ==str2) {
		System.out.println("메모리 번지수 같음");
	} else {
		System.out.println("메모리 번지수 다름");
	}
	if(str1.equals(str3)) {// String 은 값 비교를 equals를 통해 함
		  System.out.println("값 같음");
	} else {
			System.out.println("값 다름");
	}
}//m
}//c
