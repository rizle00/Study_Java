package pack01.exceptionCode;

public class Ex02_number {
public static void main(String[] args) {
	//1.숫자 외의 값을 숫자로 바꾸려고 하면 오류가 발생(예외)
	int number1;
	String str = "a100"; //경우의 수가 많은 경우 -> try catch
//	if() {
//	number1 = Integer.parseInt(str);
//	}
//	System.out.println(number1);
	//2.어떤 수를 0으로 나누려고 하면 오류 발생(예외)
	int number2 = 0;
	if(number2!=0) {
	System.out.println(10/number2);
	} else {
		System.out.println("/ by zero error");
	}
}
}
