package pack07.test;

import java.util.Random;
import java.util.Scanner;

public class Ex_DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random R =  new Random();
		
		
		while (true) {
			System.out.println("시작하시려면 1을 종료하시려면 0을 입력하세요");
			int start = sc.nextInt();
			if(start==1) {
				System.out.println("시작합니다");
				System.out.println("플레이어 수를 입력하세요");
				int userNum= sc.nextInt();
				int [] userNumArr = new int[userNum];
				for (int i=0; i<userNumArr.length; i++) {
					sc.nextLine();
					userNumArr[i] = R.nextInt(6)+1;
					System.out.println("플레이어"+(i+1)+"의 다이스:"+userNumArr[i]);
				} // 주사위 할당
				
				
			}// 게임시작
			else if(start==0) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}//게임종료
			else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}// 잘못된 접근
			
		} // 게임 시작 종료 점
		
		
	}//m

	
}//c
