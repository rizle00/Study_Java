package exam.finalExtends;

public class AirPlaneMain {
	public static void main(String[] args) {
		SuperSonicAirPlane ssa = new SuperSonicAirPlane();
		ssa.takeOff();
		ssa.flyMode = SuperSonicAirPlane.SUPERSONIC; // static  인스턴스화 불필요 ssa.SUPERSONIC;
		ssa.fly();
		ssa.land();
		
		int intValue = 10;
		double doubleValue = intValue;
		//  자동 형변환 : 더 큰 그릇에 작은 그릇을 담음. 어떤 처리가 필요 없음. Casting
		System.out.println(intValue);
		System.out.println(doubleValue);
		
		//  강제 형변환 : 더 큰 -> 더 작은. 어떤 처리가 필요함(데이터 타입 명시). 데이터 유실
		doubleValue =3.14;
		intValue =(int) doubleValue;
		System.out.println(intValue);
	}
}
