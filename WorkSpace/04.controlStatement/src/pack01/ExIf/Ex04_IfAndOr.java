package pack01.ExIf;

public class Ex04_IfAndOr {
public static void main(String[] args) {
	int number=10;
	if(number%2==1) {
	System.out.println("홀수");
		}else {System.out.println("짝수");
		if(number%3==0) {
			System.out.println("3의배수");
		}else {
			System.out.println("3의배수 아님");
		}
	}
	
	if(number%2==0) {
		System.out.println("짝수 이며 3의 배수 아님");
	}else if(number%3==0) {
			System.out.println("홀수이며 3의 배수");
		} else {
			System.out.println("홀수이며 3의 배수 아님");
		}
	
	String result = number%3==0? "3의 배수" : "3의배수 x";
	if(number%2==0) {
		System.out.println("짝수"+result);
	}else {
		System.out.println("홀수"+result);
	} //삼항 연산자 사용
	
	if(number%2==0 && number%3==0) {
		System.out.println("짝수이며 3의배수");
	}else if(number%2==0 && number%3!=0){
		System.out.println("짝수이며 3의배수 아님");
		
	}else if(number%2!=0 && number%3==0) {
		System.out.println("홀수이며 3의배수");
	}else if(number%2!=0 && number%3!=0) {
		System.out.println("홀수이며 3의 배수 아님");
	} // 논리연산자 사용
	
	if(number%2==0) {
		if(number%3==0) {
			System.out.println("짝수이며 3의배수");
		}else {
			System.out.println("짝수이며 3의배수아님");
		}
	}else if(number%3==0) {
		System.out.println("홀수이며 3의배수");
	}else {
		System.out.println("홀수이며 3의배수 아님");
	} //if의 중첩
	} //경우의수!

}