package exam.testAbstract;

public class Main {
	
	//public abstract void method();abstract라는 추상 클래스 명시가 있는 클래스만 메소드 선언이 가능함.
	// abstract는 구현을 "강제"한다
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.breathe();
		
		Animal animal = new Cat();
		animal.breathe();
		System.out.println(animal.eat("fish"));
		
		Animal animal1 = new Dog();
		animal1.breathe();
		System.out.println(animal1.eat("fish"));
	}
}
