package pack02.tryCatch;

public class Ex03_tryCatchOrder {
public static void main(String[] args) {
	// 0으로 나눈경우
	// 문자열을 숫자로
	// null
	// 오류의 경우마다 다르게
	try {
		int a = Integer.parseInt("bri00");
		String str = null;
		System.out.println(str.length());
		System.out.println(0/0);
	}catch(NumberFormatException e) {
		System.out.println("숫자가 아닌 값 오류 입니다.");	
		}
	catch(NullPointerException e) {
		System.out.println("Null 오류 입니다");
	}catch(ArithmeticException e) {
		System.out.println("0으로 나눠서 오류입니다");
	}	
	catch (Exception e) {//Exception 모든 오류의 기본 처리가 있는 클래스
		 System.out.println("그 외 오류입니다.");
	}
}
}
