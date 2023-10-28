package pack03.test;

import java.util.Random;

//스캐너를 통해서 입력받은 파일을 다운로드
//1. 이름 2. 진행률
public class FileDownTask extends Thread {
	private String fileName;
	private int percent;//<= 0

	public FileDownTask(String fileName) { // 이름 관련 처리
		if(fileName == null || fileName.trim().length() == 0) {
			fileName = "이름 모르는 파일";
		}
		this.fileName = fileName;
	}
	
	//외부에서 Thread가 start되면 해야할 작업
	@Override
	public void run() {
		while(percent<=100) {
			percent += new Random().nextInt(10)+5;
//			percent+=5;
			if(percent>100) {
				percent = 100;
				System.out.println(fileName+"다운 완료");
				break;
			}
			System.out.println(fileName+"파일 다운로드중.."+percent+"%");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
