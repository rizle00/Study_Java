package pack02.VariabelType;

public class Ex03_Char {
public static void main(String[] args) {
	//문자 문자열
	// 문자(char):하나의 글자만 저장 : 유니코드 '문''자'
	//문자열(String) : 하나 이상의 문자들을 의미함. "문자열"
	char char_1='a';
	char char_2='＆';
	char char_3=65;
	System.out.println(char_1+" "+char_2);
	System.out.println(char_1);
	System.out.println(char_3);
	//char 문자를 숫자로 변환하거나 숫자를 문자로 변환하는 등의 용도로 사용.
	// 문자가 아닌 숫자를 담을때는 short,int,long사용
	//Android 특수문자가 막혀있을때=>'\0041' 16진수
	//String 은 기본형 데이터 타입이 아님.->참조형 데이터 타입.
	// 첫글자가 대문자로 시작.
	String string_v1="김민주";
	System.out.println(string_v1);
	System.out.println(string_v1+10+10);//?
}
}
