package exam.testAbstract;

public class Cat extends Animal{

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 숨을 쉽니다.");
	}
   
	@Override
	public int eat(String food) {
		System.out.println(food+"를 고양이가 맛있게 먹음");
		// TODO Auto-generated method stub
		return 10;
	}
}
