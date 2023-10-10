package pack01_method;

public class Calculator {
	public void plus (int num1, int num2) { // void : 결과를 호출하는 부분에서 받아올 수 없음.
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public void minus (int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}
	
	public int mul (int num1 , int num2) {
		int result = num1*num2;
		return result;
	}
	
	public double div (double num1, double num2) {
		double result = num1/num2;
		return result;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.print("두 수의 합 :");
		cal.plus(3, 5);
		System.out.print("두 수의 차 : ");
		cal.minus(3, 5);
		System.out.println("두 수의 곱 :"+cal.mul(3,5));
		System.out.println("두 수의 나누기 :"+cal.div(3, 5));
	}
}

