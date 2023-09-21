package pack05.etc;

public class Ex01_Break {
public static void main(String[] args) {
	//break  뭔가를 멈출때 사용
	// 자바에서는 제어문의 정지용으로 사용(break1 => for, while, switch 하나를 멈춤)
	//제어문당 하나의 브레이크가 필요.
	int i=0;
	while(true) {
		System.out.println("브레이크로 제어문 중지");
		if (i>3) break; i++;
	}
	//무한루프, break 바로 밑에는 코드 작성이 무의미함. 작성오류
	// unreachable code
	i=0;
	while(true) {
		System.out.println("while실행중");
		if(i==999) {
			break; System.out.println(i);
		} i++;
	}
}
}
