package Cafe;


public class CafeMain {	
	public static void main(String[] args) {
		CafeDAO dao = new CafeDAO();
		System.out.println("한울 카페에 오신 것을 환영합니다");
//		int check = dao.loginCheck();
//		dao.menus(check);
		MenuDTO[] cMenus  = dao.selectRead();
		dao.modifyMenu(cMenus);
//		MenuDTO[] newMenus = null;
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