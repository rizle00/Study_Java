package pack01.method;

public class DAO {
	int intMethod() {
		return 3;
	}
	int intMethod(int num) {
		return num;
	}
	
	static void method() {
		System.out.println("static");
	}
	
	static void method(int num, String name) {
		System.out.println(num+name);
	}
}
