package pack03.TypeChange;

public class Ex01_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수는 값의 허용범위 용도 등에 따라 여러 타입이 있다.
		// 이런 변수의 타입을 용도에 따라서 바꿀수 있는데 이걸 우리는 타입변환이라고 한다.
		// 1.자동 타입 변환(묵시적 형변환, UpCasting) 소->대
		byte byte_v = 127;
		short short_v = byte_v;
		int int_v = short_v;
		long long_v = int_v;
		// 2.강제 타입 변환(명시적 형변환, DownCasting) 대->소
		long long_v2 = 100;
		int int_v2 = (int) long_v2;// 강제 형변환.담으려는 작은 데이터 타입을 명시해줌.
		System.out.println(long_v2);
		System.out.println(int_v2);
		
		double double_v1=3.14;
		int_v2=(int)double_v1;
		System.out.println(double_v1);
		System.out.println(int_v2);
		int x=3, y=5;
		System.out.println(x/y);

	}

}
