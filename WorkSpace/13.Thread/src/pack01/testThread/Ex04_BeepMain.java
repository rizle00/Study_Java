package pack01.testThread;

public class Ex04_BeepMain {
public static void main(String[] args) throws InterruptedException {
	Ex03_BeepTask e3 = new Ex03_BeepTask();
//	Runnable run = new Ex03_BeepTask();
	Thread thread = new Thread(e3);
	thread.start();
	
	for (int i = 0; i < 5; i++) {
		System.out.println("THing main");
		Thread.sleep(500);
	}
	System.out.println("요기 코드");
}
}
