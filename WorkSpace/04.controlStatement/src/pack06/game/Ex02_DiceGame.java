package pack06.gmae;

import java.util.Random;
import java.util.Scanner;

public class Ex02_DiceGame {
public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	//Random r = new Random();
	//1.이 프로그램은 무한반복하는 프로그램 입니다.
	//콘솔창(1.게임시작 , -1.게임종료)
	//2.1번을 누르면 게임을 시작하고 -1을 입력하면 게임을 종료한다.
	//enter Key를 누르면!
	//컴퓨터가 주사위를 굴립니다. r.nextInt(6)+1;
	//enter Key를 누르면!
	//사용자가 주사위를 굴립니다. r.nextInt(6)+1;
	//눈금이 더 높은 팀이 이기는 게임입니다.
	System.out.println("시작 하시려면 1을, 종료하시려면 -1을 입력해주세요");
	
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int startEnd = Integer.parseInt(sc.nextLine());
		
		
		if(startEnd==1) {
			System.out.println("Game Start!");
			while(true) {
				System.out.println("If Enter \nCom roll the dice!");
				String comIn =sc.nextLine();
				int com = r.nextInt(6)+1;
				System.out.println("If Enter \nYou roll the dice!");
				String youIn = sc.nextLine();
				int you = r.nextInt(6)+1;
				if (com==you) {
					System.out.println("Draw");
					continue;
				}else if(com>you){
					System.out.println("Com : "+com+"   vs   You : "+you+" Com Win!");
				}else {
					System.out.println("Com : "+com+"   vs   You : "+you+" You Win!");
					
				}
				
			}
		}else if(startEnd==-1) {
			System.out.println("Game End.");
		}
		
}
}
