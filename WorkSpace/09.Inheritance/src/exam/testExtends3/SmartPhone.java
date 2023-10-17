package exam.testExtends3;

//3세대 폰 : 전화기능 + DMB  기능 + 스마트폰 기능
public class SmartPhone extends DmbPhone { // 상속의 중첩

	String internetSpeed;
	//부모 클래스가 먼저 생성이 되는데 DmbPhone은 3개의 파라미터를 입력받는 생성자 메소드가 존재
	//따라서 DmbPhone이 생성되기위한  String x2 , int x1 가 반드시 필요함
	
	public SmartPhone(String model, String color, int channel, String internetSpeed) {
		super(model, color, channel); // 부모클래스의 생성자가 따로 생성되어 있는 경우 생성자 호출 필요
		this.internetSpeed = internetSpeed;
	}
	
	@Override
	public void powerOn() {
		//super.powerOn();=> 부모 클래스에 있는 메소드를 그대로 사용
		System.out.println("옆에 있는 버튼 눌러서 전원  On");
	}
	
	public void onInternet() {
		System.out.println(internetSpeed+ "로 웹툰 봄");
	}
}
