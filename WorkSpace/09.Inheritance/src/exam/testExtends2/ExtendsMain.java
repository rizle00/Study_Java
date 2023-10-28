package exam.testExtends2;

public class ExtendsMain {
	public static void main(String[] args) {
//		Object obj =1; 객체
//		obj = "aa"; 다형성 관려 추후...
//		obj = new SubClass();
		
		SubClass sub = new SubClass();
		System.out.println(sub.sum(3, 5));
		System.out.println(sub.minus(3, 5));
		System.out.println(sub.mul(3, 5));
		System.out.println(sub.div(3, 5));
		// debug F5 step into, F7 step return, F6 step over , F8 resume
	}
}
