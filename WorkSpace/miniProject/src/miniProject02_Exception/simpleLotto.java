package miniProject02_Exception;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class simpleLotto {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r =  new Random();
	int [] input = new int [6];
	int [] num = new int [6];
	int numCount = 6;

	while(true) {
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i-=1; break;
				}
			}
		}// 로또 번호 생성
		
		try {
			System.out.println("숫자를 입력하세요 \n 1. 수동 2. 자동 0. 종료");
			int mod  = Integer.parseInt(sc.nextLine());
			if (mod==0) {
				System.out.println("프로그램 종료");
				break;
			}
			if(mod == 1) {
		for(int i=0; i<input.length; i++) { 
			
			System.out.println("숫자를 입력하세요(1~45)"+numCount+"회");
			int inputNum = Integer.parseInt(sc.nextLine());
			numCount--;
			if(inputNum==-1) {
				System.out.println("프로그램 종료");
				break;
			} else if(inputNum>=1&&inputNum<=45){				
					input[i]=inputNum; //숫자입력
					for(int j=0; j<i; j++) {				
						if(input[i]==input[j]) {
						System.out.println("중복된 숫자입니다 \n 재입력 하세요");
							i--;
							numCount++; break;
						}
					}// 숫자 입력 및중복체크
			}else {
				System.out.println("숫자 범위 오류입니다 \n 재입력 하세요");
				i--;
				numCount++;
			} // 숫자 입력오류
		}// 숫자 입력 끝
		int count = 0;
		  for(int i =0; i<6; i++) {
			  for(int j =0; j<6; j++) {
				  if(input[i]==num[j]) {
					  count++;				 
				  }
			  }
		  } // 매치 확인
		  System.out.println(Arrays.toString(num));
		  System.out.println(Arrays.toString(input));
		  System.out.println(count+"개 맞음");//값비교
				switch(count) {
				case 6:
					System.out.println("1등 당첨");
					break;
				case 5:
					System.out.println("2등 당첨");
					break;
				case 4:
					System.out.println("3등 당첨");
					break;
				case 3:
					System.out.println("4등 당첨");
					break;
					default:
					System.out.println("꽝");
				}//등수 확인

			}//모드1 끝
			if(mod==2) {
				System.out.println("구매할 숫자를 입력하세요");
				int buyNum = Integer.parseInt(sc.nextLine());
				int [][] auto = new int [buyNum][6];
				for(int i=0; i<auto.length; i++) {
					for(int j=0; j<auto[i].length; j++) {
						auto[i][j]=r.nextInt(45)+1;
						for(int k=0; k<j; k++) {
							if(auto[i][j]==auto[i][k]) {
								j--; break;
							}
						}
					}
				}// 자동구매 완료
			
			int [] counts = new int [buyNum];
			  for(int i =0; i<buyNum; i++) {
				  int count = 0;
				  for(int j =0; j<6; j++) {
					  for(int k =0; k<6; k++) {
						  if(auto[i][j]==num[k]) {
							  count++;
							  
						  }
					  }
					  
				  }counts[i]=count;
				 
				
				  System.out.println((i+1)+"번"+counts[i]+"개 맞음");//값비교
						switch(counts[i]) {
						case 6:
							System.out.println("1등 당첨");
							break;
						case 5:
							System.out.println("2등 당첨");
							break;
						case 4:
							System.out.println("3등 당첨");
							break;
						case 3:
							System.out.println("4등 당첨");
							break;
							default:
							System.out.println("꽝");
						}//등수 확인
			  } System.out.println(Arrays.toString(num));
				 System.out.println(Arrays.deepToString(auto));
			  // 매치 확인
			}//모드 2 끝
		}//try
		catch (NumberFormatException e) {
			System.out.println("잘못된 입력입니다");
			
		}//catch
		
	}//프로그램
		
		
	
	
}//main
}
