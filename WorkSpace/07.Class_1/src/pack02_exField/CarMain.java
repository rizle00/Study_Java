package pack02_exField;

public class CarMain {
public static void main(String[] args) {
	//자바시간에만 main메소드 씀. -> html , jsp , android화면
			//Car(Class) 설계도 -> 객체(car) 인스턴스화 -> 
			//객체화(인스턴스화)-> 설계도 클래스를 가지고 객체(제품)를 사용할수있는 상태로 바꾸는 식(과정)
			//클래스이름 객체화(변수이름) = "new" 클래스이름();
			//인스턴스화 된 객체 ↓(car)뒤에 .을 찍으면 모든 멤버가 보인다.
		Car carH = new Car();
		
		Car carK = new Car();
		carH.company = "현대";
		carH.type = "소형차";
		carH.maxSpeed = 200;
		
		carK.company = "기아";
		
		System.out.println(carH.company + carH.type + carH.maxSpeed + carH.color);
		// color 는 기본값 null
		System.out.println(carK.company);
}
}
