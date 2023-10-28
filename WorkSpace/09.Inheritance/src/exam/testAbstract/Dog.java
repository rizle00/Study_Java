package exam.testAbstract;

public class Dog extends Animal{

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("강아지가 숨을 쉽니다.");
	}
   
	@Override
	public int eat(String food) {
		System.out.println(food+"를 강아지가 맛있게 먹음");
		// TODO Auto-generated method stub
		return 10;
	}
}
