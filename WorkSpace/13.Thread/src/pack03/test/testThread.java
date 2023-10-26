package pack03.test;

public class testThread extends Thread{
	
	private String name;
	public testThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(name+"다운로드중"+i+"%");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} System.out.println("다운로드 완료");
	}
}
