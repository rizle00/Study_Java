package Cafe;


public class CafeMain {	
	public static void main(String[] args) {
		CafeDAO dao = new CafeDAO();
		System.out.println("한울 카페에 오신 것을 환영합니다");
		MenuDTO[] cMenus  = dao.selectRead(); //카페메뉴 호출
		//초기화 위치 신경써야함. 
		while(true) {
			System.out.println("===============================");
			System.out.println("로그인 하시려면 1을");
			System.out.println("종료하시려면 0을 눌러주세요");
			int start = dao.inputNum();
			if(start == 0) {
				System.out.println("===============================");
				System.out.println("프로그램을 종료합니다");
				System.out.println("이용해 주셔서 감사합니다");
				break;
			} else if(start==1) {
				System.out.println("===============================");
				System.out.println("로그인 합니다");
				int check =dao.loginCheck();
				dao.menus(check);// 사용자메뉴 호출
				dao.displayC(cMenus); // 카페메뉴 출력
				while(true) {
					dao.displayM(null); //사용자메뉴 출력
					int sel =dao.selectMenu();//유저 메뉴 고르기
					
					if(check ==1) {// 유저 관리자 분기
						switch(sel) {
						case 0 : dao.modify();
							break;
						case 1 : dao.deposit();
							break;
						case 2 :  dao.buy(cMenus);
							break;
						case 3 : dao.refund();
							break;
						case 4 : System.out.println("===============================");
							System.out.println("로그아웃 합니다");
						    break;
						default :System.out.println("===============================");
							System.out.println("잘못된 입력입니다"); 
						break;
						}
						if(sel==4) {
							System.out.println("이용해 주셔서 감사합니다");
							break;
						}
					}else if (check ==2) {
						switch(sel) {
						case 0 : dao.modify();
							break;
						case 1 : cMenus = dao.addMenu(cMenus);
							break; //메소드 종료후의 리턴값을
						case 2 : cMenus = dao.modifyMenu(cMenus);
							break;
						case 3 : cMenus = dao.deleteMenu(cMenus);
							break;
						case 4 : System.out.println("===============================");
							System.out.println("로그아웃 합니다");
					    	break;
						default : System.out.println("===============================");
							System.out.println("잘못된 입력입니다"); 
						break;
						}
						if(sel==4) {
							System.out.println("이용해 주셔서 감사합니다");
							break;
						}
						
					}
				}
				
			} else {
				System.out.println("===============================");
				System.out.println("잘못된 입력입니다");
				continue;
			}
		}
//		int check = dao.loginCheck();
//		dao.menus(check);
		
	
//		MenuDTO[] newMenus = null; 필요치 않음
//		newMenus = dao.addMenu(cMenus);
//		dao.addMenu(newMenus);
//		while(true) {
//			dao.print(cMenus);
//			int sel =dao.selectMenu();
//			if(sel == 0) {
//				dao.modify(); continue; }
//			if(sel == 1) {
//				dao.deposit(); continue;
//				}
//		   if(sel == 2) {
//			   dao.buy(cMenus); continue;}
//		   if(sel == 3) {
//			   dao.refund(); continue;  }
//		   if(sel == 4) {
//			   System.out.println("이용해 주셔서 감사합니다");
//			   break;
//		   }
//		
//		//dao.print(test,dao.selectRead(), dao.uMenus(), dao.aMenus());
// 	}
}//main
}//class