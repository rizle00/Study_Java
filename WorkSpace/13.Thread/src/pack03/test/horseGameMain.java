package pack03.test;

import java.util.Scanner;

public class horseGameMain {
public static void main(String[] args) {
	
//	new Thread(()->{
//		//슬라이드 하는 메소드
//	}).start();
	
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("2~5까지의 수 입력 : 경기하는 말 개수");
		int inputNum = Integer.parseInt(sc.nextLine());
		if(inputNum>=2 && inputNum<=5) {
			horseDAOa dao = new horseDAOa(inputNum); //  3-> scanner 이용, 2~5 체크
			break;
		}
	}
	sc.close();
	
	
	
	
//	horseDTOa dto = new horseDTOa("1번마");
//	dto.setHorseThread(new Thread(()->{
//		System.out.println("문자열");
//	}));
//	dto.getHorseThread().start();
	
			
}
}
