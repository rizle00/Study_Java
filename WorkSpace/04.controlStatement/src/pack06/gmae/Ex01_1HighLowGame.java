package pack06.gmae;

import java.util.Random;
import java.util.Scanner;

public class Ex01_1HighLowGame {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	Random random = new Random();
	System.out.println("하이 & 로우 게임 입니다.\n 랜덤한 숫자를 맞추세요.");
	System.out.println("시작하시려면 s 종료하시려면 아무거나 치세요.");
	String start = sc.nextLine();
	
	if (start.equals("s")) {
		
	System.out.println("난이도를 입력하세요.(1~5)");
	String sLv = sc.nextLine();
	int lv = Integer.parseInt(sLv);
	lv=lv*100;
	int randomNumber = random.nextInt(lv)+1;//0~99 // 1~100
	int i = 1;
	System.out.println("Start!");

	System.out.println("재시작 하시려면 \"-\" 를 치세요");
	while(true) {
		
		System.out.println("숫자를 입력해 주세요");
		String end = sc.nextLine();
		
		if (end.equals("-"))
			continue;
		{String str= sc.nextLine();
		 
		int userNum = Integer.parseInt(str);
		if(randomNumber==userNum) {
			System.out.println("정답 ! 축하합니다");
			System.out.println("난이도"+lv+","+i+"번 시도하셨습니다");
			break;
		} else if (randomNumber>userNum) {
			System.out.println("High!");
		} else {
			System.out.println("Low!");
		} i++;}
	
	}} else {
		System.out.println("프로그램을 종료합니다.");
	}
//	if(userNum == -1) {
//		System.out.println("프로그램을 종료합니다.");
//		break;
//	}else if(userNum == 1) {
//		
//	}
}
}
