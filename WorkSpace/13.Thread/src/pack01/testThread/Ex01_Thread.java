package pack01.testThread;

import java.awt.Toolkit;

public class Ex01_Thread {
	//자바 애플리케이션이 실행되는 동안은 Thread 라는 객체가 동작
	// window로부터 소리를 제공바아 사용 (Toolkit) :  중요 x 공부  x
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
		// Thread.sleep : 동작중인 프로세스를 휴지시킴. (딜레이 발생) ms
		for (int i = 0; i < 5; i++) {
			//for문은 컴퓨터 속도에 따라 차이가 있지만 0.0001초 내 5번 동작
			toolkit.beep();
			System.out.println("qqq");
			try {
				//진행중인 쓰레드(작업)이 슬립을 만났을 때 오류가 생길 가능성이 있음. -> 강제로 try,catch
				//file(IO)
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
