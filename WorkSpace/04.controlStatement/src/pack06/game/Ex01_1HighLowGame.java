package pack06.gmae;

import java.util.Random;
import java.util.Scanner;

public class Ex01_1HighLowGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("하이 & 로우 게임 입니다.\n 랜덤한 숫자를 맞추세요.");
		System.out.println("시작하시려면 s 종료하시려면 아무거나 치세요.");
		String start = sc.nextLine();

		if (start.equals("s")) {
			
			System.out.println("난이도를 입력하세요.(1~5)");
			//String sLv = sc.nextLine();
			// 헬모드 시작점
			int slv = Integer.parseInt(sc.nextLine());
			int lv = slv * 100;
			int randomNumber = random.nextInt(lv) + 1;// 0~99 // 1~100
			int count = 1 ;//,i1=1;
			System.out.println("Start!");
			System.out.println("종료를 원하시면 0을 입력해 주세요");
			System.out.println("재시작을 원하시면 -1을 입력해 주세요");
			//재시작 시작
			//int re = -2;
			
			for (;;) {
				


				System.out.println("숫자를 입력해 주세요");
				int userNum = Integer.parseInt(sc.nextLine());
//				String end = sc.nextLine();
//
//				if (end.equals("-"))
//					continue;
//				{
//					String str = sc.nextLine();
//					int userNum = Integer.parseInt(str);
//					re=Integer.parseInt(str);
//					end = Integer.parseInt(str);
//					
//					while(re==-1) {
//						re=-2;
//						System.out.println("재시작 합니다");
//						System.out.println("난이도를 입력하세요.(1~5)");
//					String	sLv1 = sc.nextLine();
//						// 헬모드 시작점
//					int	 lv1 = Integer.parseInt(sLv1);
//						lv1 = lv1 * 100;
//					int	 randomNumber1 = random.nextInt(lv1) + 1;// 0~99 // 1~100
//						 i1 = 1;
//						System.out.println("Start!");
//						System.out.println("종료를 원하시면 0을 입력해 주세요");
//						System.out.println("재시작을 원하시면 -1을 입력해 주세요");
//						for (int end1 = 1; end1>=1; ) {
//
//							System.out.println("숫자를 입력해 주세요");
////							String end = sc.nextLine();
//				//
////							if (end.equals("-"))
////								continue;
////							{
//								String str1 = sc.nextLine();
//								 int userNum1 = Integer.parseInt(str1);
//								re =    Integer.parseInt(str1);
//								if (re==-1)
//									break;
//								end1 = Integer.parseInt(str1);
//								if (end1==0) { // 게임 중 종료
//									end=0;
//									break;
//									}
//								    
//								if (randomNumber1 == userNum1) {
//									System.out.println("정답 ! 축하합니다");
//									System.out.println("난이도" + lv1 + "," + i1 + "번 시도하셨습니다");
//									System.out.println("게임을 종료합니다");
//									break;
//									} else if (randomNumber1 > userNum1) {
//									System.out.println("High!");
//									} else {
//									System.out.println("Low!");
//									}
//								i1++; end1=1;}
//					}
							
						
					
					
					if (userNum==0) { // 게임 중 종료
						System.out.println("프로그램을 종료합니다");
						break;
					}else if (userNum == -1) {
						System.out.println("프로그램을 재시작합니다.");
						System.out.println("난이도를 입력하세요.(1~5)");
						slv = Integer.parseInt(sc.nextLine());
						
						randomNumber = random.nextInt(slv*100) + 1;
						System.out.println("Start!");
						System.out.println("종료를 원하시면 0을 입력해 주세요");
						System.out.println("재시작을 원하시면 -1을 입력해 주세요");
						count = 1;
						continue;
					}
					
					if (randomNumber == userNum) {
						System.out.println("정답 ! 축하합니다");
						System.out.println("난이도" + slv + "," + count + "번 시도하셨습니다");
						System.out.println("게임을 종료합니다");
						break;
					} else if (randomNumber > userNum) {
						System.out.println("High!");
					} else {
						System.out.println("Low!");
					}
					count++; 
					//end=1;
				}
			}
	}
	
//		} else {
//			System.out.println("프로그램을 종료합니다.");
}

//	if(userNum == -1) {
//		System.out.println("프로그램을 종료합니다.");
//		break;
//	}else if(userNum == 1) {
//		
//	}
//	}

