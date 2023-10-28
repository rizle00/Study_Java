package pack03.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("다운로드 하실것을 입력하세요 -1 입력시 종료");
			String name =sc.nextLine();
			if(name.equals("-1")) {
				break;
			}
		testThread thread = new testThread(name);
		thread.start();
		}
	}//main
}
