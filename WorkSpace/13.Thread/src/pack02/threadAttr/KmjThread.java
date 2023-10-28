package pack02.threadAttr;

import java.util.Scanner;

//일반 클래스 : start 기능 x
// 일반 클래스 : run 이 override (재정의) x
// runnable 인터페이스 상속 or runnable을 상속받은 thread 객체를 상속

public class KmjThread extends Thread  {
	
//	private int number;
//	public KmjThread(int number) {
//		this.number = number;
//	}
	@Override
	public void run() {
		System.out.println("구구단");
		Scanner sc = new Scanner(System.in);
		int inputNum;
		while(true){
			try {
				System.out.println("숫자를 입력하세요");
			inputNum = Integer.parseInt(sc.nextLine());
			break;
		} catch (Exception e) {
			System.out.println("잘못 입력");
		}}
		
		for (int i = inputNum; i < 10; i++) {
			System.out.println(i+"단입니다");
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
				
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
