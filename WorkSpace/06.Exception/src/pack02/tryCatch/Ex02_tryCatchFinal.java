package pack02.tryCatch;

public class Ex02_tryCatchFinal {
public static void main(String[] args) {
	try {
		System.out.println("1.물조절");
		System.out.println("2.가스불 온");
		System.out.println(3/0);
//		System.out.println("3.가스불 오프");
//		System.out.println("4.종료 및 식사");
	} catch (Exception e) { // try 코드가 예외 발생시 실행
		System.out.println("예외발생(물넘침 이슈)");
//		System.out.println("3.가스불 오프");
//		System.out.println("4.종료");
	}finally {// 무조건 실행되어야 하는 코드 
		System.out.println("3.가스불 오프");
		System.out.println("4.종료 및 식사");
		}
}
}
