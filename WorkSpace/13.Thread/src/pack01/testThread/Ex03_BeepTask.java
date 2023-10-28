package pack01.testThread;


//구현 : run <-
public class Ex03_BeepTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("ping");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch(Exception e) {
				System.out.println("나머지 오류에 대한 처리");
			}
		}
	}

}
