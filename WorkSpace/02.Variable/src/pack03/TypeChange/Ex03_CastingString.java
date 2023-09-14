package pack03.TypeChange;

public class Ex03_CastingString {
public static void main(String[] args) {
	String num1="10", num2="20";
	System.out.println(num1+num2);
	int int_v1=10, int_v2=20;
	System.out.println(int_v1+int_v2);
	//String의 연산법칙 : Concatenation(연결)
	//String의 +는 문자열의 연결을 의마하며
	//어떤 변수를 String에 더해도 그 변수의 타입은 자동으로 String이 된다.
	//Java에서도 연산 순서는 왼쪽부터
	//따로 연산이 필요한 식이 있다면 ()처리를 해주면 된다.
	System.out.println("10"+(10+20));
	//숫자->String: +String해주면 끝.
	//WrapperClass(포장):String을 WrapperClass로 싸주면 해당 타입으로 변함
	//double->Double, byte->Byte, short->Short,..
	//☆int->Integer☆ parse메소드
	int number1= Integer.parseInt(num1);
	int number2=Integer.parseInt("10");
	System.out.println(number2);
	
	String numberString=10+"";
	System.out.println(numberString+10);
	
}
}
