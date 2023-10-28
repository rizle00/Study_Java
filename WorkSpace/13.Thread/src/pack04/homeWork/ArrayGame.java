package pack04.homeWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayGame {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random r =  new Random();
			int level;
			int inputNum;
		System.out.println("난이도를 입력하세요 1 ~");
		while(true) {
		try {
			level = Integer.parseInt(sc.nextLine());
			if (level<1) {
				System.out.println("1이상의 숫자를 입력하세요");
			} else {
				System.out.println("난이도 입력 완료");
				break;
			}
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요");
		}
		}
		
		 String listArr[] = new String[level];
		 listArr[r.nextInt(level)] = "정답";
		 int count = 1;
		 while(true) {
			 while(true) {
					try {
						System.out.println("답을 맞춰 주세요");
						inputNum = Integer.parseInt(sc.nextLine());
						if (inputNum<1) {
							System.out.println("1이상의 숫자를 입력하세요");
						} else  if(inputNum>listArr.length) {
							 System.out.println("까지의 숫자를 입력하세요");
						 } break;
					} catch (Exception e) {
						System.out.println("숫자를 입력하세요");
					}
					}
			 if(listArr[inputNum]==null) {
				 System.out.println("틀렸습니다 정답을 입력해주세요");
				 count++;
			 } else {
				 System.out.println("정답입니다"+count+"번 시도 하셨습니다");
				 break;
			 }
		 }
		
		
 	}
}
