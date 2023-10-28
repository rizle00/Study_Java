package pack03.test;

import java.util.Random;
import java.util.Scanner;

public class HorseDAO{
// 사람 수 입력 기능, 사람수 만큼 말달리기 기능-> 스레드 생성, 스레드 완료시 순위 정하기 
	HorseDTO dto = new HorseDTO();
	public HorseDAO() {
		// TODO Auto-generated constructor stub
	}
	public void inputNum() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("인원수를 입력하세요 2~5");
		try {
			int inputNum = Integer.parseInt(sc.nextLine());
			if(inputNum>1&&inputNum<6) {
			dto.setUserNum(inputNum);
			break;
			} else {
				System.out.println("범위 안의 값을 입력하세요");
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다");
		}
		}
		
	}


	public Thread [] makeHorse() {
		String nameArr[] = new String [dto.getUserNum()];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = dto.getName()+(i+1);
		}
		
		Thread [] threadArr = new Thread [dto.getUserNum()];
		for (int i = 0; i < threadArr.length; i++) {
			final int idx = i; //  바뀌는 수는 올라갈 수 없음. 람다?
			threadArr[i] = new Thread() {
				@Override
				public void run() {
					Random r = new Random();
					int horseRun =0;
					while(true) {
						
						int random= r.nextInt(20)+1;
						System.out.println(nameArr[idx]+"말이 달립니다, "+random+"m");
						horseRun += random; 
						
						if(horseRun>100) { 
							System.out.println("말이 들어왔습니다"+horseRun);
							break;}
					
					}
			}
		};
		}return threadArr;
	}

	public void horseRun() {
		Thread[] threads = makeHorse();
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
	}
	
}//class