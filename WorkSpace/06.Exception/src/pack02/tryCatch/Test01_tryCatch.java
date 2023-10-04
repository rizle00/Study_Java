package pack02.tryCatch;

import java.util.Scanner;

public class Test01_tryCatch {
public static void main(String[] args) {
//	1. 반복해서 입력받기
//	2. -1 입력 시 프로그램 종료
//	3. 입력값 숫자로 변경 후 할당
//	4. 누적합 구하기
//	5. 예외 처리 (숫자 외 값에 대한)
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	int num = 0;
	while(true) {
//		String inputData = sc.nextLine();		
//		if(inputData.equals("-1")) {
//			break;
//		} => 순서대로 코딩.
		try {
			num = Integer.parseInt(sc.nextLine());
			sum+=num;			
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력!!!");
		} if(num==-1) {
			break;
		}
	} System.out.println(sum);
	
}
}
