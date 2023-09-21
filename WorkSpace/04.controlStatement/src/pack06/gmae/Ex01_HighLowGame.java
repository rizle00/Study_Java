package pack06.gmae;

import java.util.Scanner;

public class Ex01_HighLowGame {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
			System.out.println("1~20 사이의 숫자를 입력하세요");
			String inputNumber = sc.nextLine();
			System.out.println(inputNumber);
			int a = Integer.parseInt(inputNumber);
			if(a<1 || a>20) {
				System.out.println("범위 안의 숫자를 입력하시오.\n게 임 오 버");
			} 
			System.out.println(a+10);
			
			int b = Integer.parseInt(inputNumber);
			
				
			}
}
}
