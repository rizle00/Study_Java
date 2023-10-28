package pack02.threadAttr;

public class ThreadA extends Thread {
//	public ThreadA() {
//		setName("ThreadA");
//	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName( )+ "실행중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
