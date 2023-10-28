package pack02.threadAttr;

public class Main {
	public static void main(String[] args) {
//		Thread mainThread = Thread.currentThread();//작업중인 쓰레드를 가져옴
//		System.out.println(mainThread.getName());
//		
//		ThreadA tA = new ThreadA();
//		ThreadB tB = new ThreadB();
//		
//		System.out.println(tA.getName());
//		System.out.println(tB.getName());
//		tA.start();
//		tB.start();
		KmjThread thread = new KmjThread();
		new KmjThread().start();
		thread.start();
	
	}
}
