package pack03.TypeChange;

public class Ex02_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아래의 명령은 몇번의 캐스팅이 발생했는가?
		double sum=3.14f+12;
		System.out.println(sum);
		//2진수로는 소수점을 정확히 표현을 못함. 근사치를 계속해서 계산.
		//BigDecimal(x), 데이터의 정확한 계산은->Database
		//자동캐스팅, 2번 , 더블이라서
		//제일 큰 타입을 제외 한 타입의 개수만큼 타입변환이 발생.
		//줄에 있는 전체타입 개수-1
	}

}
