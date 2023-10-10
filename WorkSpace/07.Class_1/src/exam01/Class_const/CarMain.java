package exam01.Class_const;

public class CarMain {
	public static void main(String[] args) {
		//클래스의 블럭킹 내부 -> 멤버
		// 멤버 -> 선언된 것( 변수, 클래스 ... 등등) => 필드 => 인스턴스 멤버
		// function (a,b) NaN
		//1. 내가 필요한 클래스가 있다면 해당 클래스 타입을 적어주고
		//2. 내가 사용할 이름을 주고 (변수명)
		//3. = new 클래스타입()
		Car car = new Car(601236);// 클래스의 인스턴스화
		//4. 인스턴스화 된 클래스의 멤버 접근은 객체 . ->을 찍으면 전부 나옴
		car.brand = "Kia";
		car.color = "Red";
		car.model = "Ev6";
		car.type = "suv";
		car.price = 35000000;
		System.out.println(car.brand+car.model+car.type+car.color+car.number+car.price);
		
	}
	
}
