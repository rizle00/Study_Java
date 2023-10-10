package pack01_method;

public class Computer {
	boolean isPower; // 기본 : false
	
	public void plus(int num1, int num2) {
		if (isPower) {
			System.out.println(num1+num2);
		} else {
			System.out.println("컴퓨터의 전원을 켜주세요");
		}
	}
	public static void main(String[] args) {
		Computer com = new Computer();
		com.plus(1,2);
		com.isPower = true;
		com.plus(5, 8);
		
	}
}
