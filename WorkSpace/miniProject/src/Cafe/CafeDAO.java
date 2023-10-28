package Cafe;

import java.util.Scanner;




public class CafeDAO {
	
	InfoDTO[] uMenus = null;
//	MenuDTO[] nMenus =selectRead();
//	public MenuDTO[] tMenus() {
//		
//		MenuDTO[] nMenus = selectRead();
//		nMenus = addMenu(nMenus);
////		nMenus = tMenus;
//		nMenus = modifyMenu(nMenus);
////		nMenus = tMenus;
//		nMenus = deleteMenu(nMenus);
////		nMenus = tMenus;
//		return nMenus;
//		}
	
	Scanner sc  = new Scanner(System.in);
	public CafeDAO() {	
	}
	
	InfoDTO iDto = new InfoDTO();
	MenuDTO mDto = new MenuDTO();
	
	
	
	public int login() {
		InfoDTO iDto = new InfoDTO();
		System.out.println("아이디를 입력하세요");
			String inputId = sc.nextLine();
			if (inputId.equals(iDto.getUserId())||inputId.equals(iDto.getManagerId())) {
				System.out.println("비밀번호를 입력하세요");
				String inputPw =sc.nextLine();
				if (inputPw.equals(iDto.getUserPw())) {		
						return 1;
					
				} else if (inputPw.equals(iDto.getManagerPw())) {			
				   return 2;
				} else {
					System.out.println("===============================");
					System.out.println("틀린 비밀번호 입니다");
				}
			}// 로그인
			else {
				System.out.println("===============================");
				System.out.println("존재하지 않는 사용자 입니다");
			} return 3;
		}// 로그인 종료
	
	public int loginCheck() { // 로그인 체크 및 리턴, 변수에 저장 후 사용
			int check = login();
			if (check == 1) {
				System.out.println("===============================");
				System.out.println("로그인 되었습니다");
				return 1;
			} else if (check == 2){
				System.out.println("===============================");
				System.out.println("로그인 되었습니다");
				System.out.println("관리자님 환영합니다");
				return 2;
			}
			while(check !=1 || check !=2) {	
				login();		
				} return 3;
			}// check 끝
	
	public MenuDTO [] selectRead() { //  함수를 불러야 생성
		MenuDTO[] cMenus = new MenuDTO [3];
		cMenus[0] = new MenuDTO("americano", 2000);
		cMenus[1] = new MenuDTO("capuccino", 3000);
		cMenus[2] = new MenuDTO("cafelatte", 3500);
		return cMenus;
	}

	
	public void menus(int check) {
		if(check == 1) { // 정보를 받아서 두가지로 분기
		uMenus  = new InfoDTO[5];
		uMenus[0] = new InfoDTO(0 , "개인 정보 수정");
		uMenus[1] = new InfoDTO(1 , "금액 입력");
		uMenus[2] = new InfoDTO(2 , "상품 구매");
		uMenus[3] = new InfoDTO(3 , "잔돈 반환");
		uMenus[4] = new InfoDTO(4 , "이전으로(로그아웃)");
		}
		else if(check == 2) {
		uMenus = new InfoDTO[5];
		uMenus[0] = new InfoDTO(0, "개인 정보 수정");
		uMenus[1] = new InfoDTO(1, "상품 추가");
		uMenus[2] = new InfoDTO(2, "상품 수정");
		uMenus[3] = new InfoDTO(3, "상품 삭제");
		uMenus[4] = new InfoDTO(4, "이전으로(로그아웃)");
		}
	}
	
	public void displayC(MenuDTO[] cMenus) {
		System.out.println("===============================");
		for (int i=0; i<cMenus.length; i++) {
			System.out.println((i+1)+"번 메뉴 :"+cMenus[i].getName()+
					", "+cMenus[i].getPrice()+"원");
		}
		
	}
	public void displayM(InfoDTO menu) {
		System.out.println("===============================");
		for (int i= 0; i<uMenus.length; i++) {
			System.out.println(uMenus[i].num+"번 :"+uMenus[i].name+" ");			
		}
	}
//	public void print(MenuDTO[] cMenus) {
//			displayC(cMenus);
//			
//			}
	
	public int inputNum() {
		int selNum;
		while(true){

			try {selNum = Integer.parseInt(sc.nextLine());				
				if(selNum>=0){
					break;
				} else {
					System.out.println("===============================");
					System.out.println("잘못된 입력입니다");
					System.out.println("0이상의 숫자를 입력해 주세요");
				}
			} catch (Exception e) {
				System.out.println("===============================");
				System.out.println("잘못된 입력입니다.");
				System.out.println("숫자를 입력해 주세요");
			}
		
		}return selNum;
	}
		
	public int selectMenu() {
		System.out.println("무엇을 하겠습니까? (0~4)");
		int sel;
		sel = inputNum(); 		
		return sel;
	}
	public void modify() {
		int i;
		while(true) {
			System.out.println("===============================");
			System.out.println("무엇을 하시겠습니까? 1~6");
			System.out.println("1.비밀번호 변경 2.이름 3.성별 4.나이 5.주소 6.이전 화면으로");
			i = inputNum();
			if(i<1 && i>6) {
				System.out.println("===============================");
				System.out.println("잘못된 입력입니다");
				continue;
			}
		while(i==1) {
			System.out.println("===============================");
			System.out.println("바꾸실 비밀번호를 입력해주세요");
			String newPw = sc.nextLine();
			if (!newPw.equals(iDto.getUserPw())) {
				iDto.setUserPw(newPw);
				System.out.println("변경되었습니다");
				 break;
			} else if (!newPw.equals(iDto.getManagerPw())) {
				iDto.setManagerPw(newPw);
				System.out.println("변경되었습니다");
				break;
			} 
		}// 비밀번호 변경
		if(i==2) {
			System.out.println("===============================");
			System.out.println("변경하실 이름을 입력하세요");
			String newName = sc.nextLine();
			iDto.infoArr[i-2] = newName;
			System.out.println(newName+"으로변경되었습니다");
			continue;
		}
		if(i==3) {
			System.out.println("===============================");
			System.out.println("성별을 입력하세요");
			String newGender = sc.nextLine();
			iDto.infoArr[i-2] = newGender;
			System.out.println(newGender+"으로변경되었습니다");
			continue;
		}
		
		if(i==4) {
			System.out.println("===============================");
			System.out.println("변경하실 나이 입력하세요");
			String newAge = sc.nextLine(); 
			iDto.infoArr[i-2] = newAge;
			System.out.println(newAge+"으로변경되었습니다");
			continue;
		}
		if(i==5) {
			System.out.println("===============================");
			System.out.println("변경하실 주소 입력하세요");
			String newAddrs = sc.nextLine();
			iDto.infoArr[i-2] = newAddrs;
			System.out.println(newAddrs+"으로변경되었습니다");
			continue;
		}
		if(i==6) {
			System.out.println("===============================");
			System.out.println("이전화면으로 돌아갑니다");
			break;
		}
		}
		
		
	}
	
	public void deposit() {
		while(true) {
		System.out.println("===============================");
		System.out.println("투입할 금액을 입력하세요");
		System.out.println("다 입력하셨으면 0을 입력하세요");
		int money =mDto.getMoney();
		System.out.println("현재 잔액:"+money);
		int deposit = inputNum();
		if(deposit==0) {
			System.out.println("===============================");
			System.out.println("이전화면으로 돌아갑니다");
			break;
		}
		 money+=deposit;
		 mDto.setMoney(money);	
		 }
	}
	
	public int selMenu(MenuDTO[] cMenus) {
		
			int sel;
			int sum = 0;
			while(true) {
				System.out.println("===============================");
				displayC(cMenus);
				System.out.println("메뉴를 선택해주세요, 다고르셨다면 0을 눌러주세요");
				sel = inputNum();
				if(sel==0) {
					System.out.println(sum+"원입니다");
					return sum;
					
				}else if(sel<cMenus.length+1 && sel>0) {
				sum +=cMenus[sel-1].getPrice();}
				else {
					System.out.println("===============================");
					System.out.println("잘못된 선택입니다");
				
			} 
			} 
		
	}
	public void buy(MenuDTO[] cMenus) {
		while(true) {
		int cost = 0;
		cost = selMenu(cMenus);
		int inMoney = mDto.getMoney();
		if (cost<=inMoney) {
			int refund = inMoney-cost;
			System.out.println(refund+"원 남았습니다.");
			mDto.setMoney(refund);
			System.out.println("===============================");
			System.out.println("이전화면으로 돌아갑니다");
			break;
			} else {
				System.out.println("===============================");
			System.out.println("잔액이 부족합니다");
			deposit();
			}
		}
	}
	public void refund () {
		System.out.println("===============================");
		System.out.println(mDto.getMoney()+"원 반환합니다");
		System.out.println("이전화면으로 돌아갑니다");
		mDto.setMoney(0);
	}
// 	public MenuDTO [] newMenus (MenuDTO[] cMenus){
// MenuDTO newMenus [] = new MenuDTO [0];
// return newMenus;
// 	}
	public MenuDTO[] addMenu(MenuDTO[] cMenus) {	
		while(true) {
			System.out.println("===============================");
			System.out.println("현재 메뉴 입니다");
			displayC(cMenus);
			System.out.println("새로운 메뉴를 추가하시려면 1을 입력하세요");
			System.out.println("종료하시려면 0을 입력하세요");
			int sel = inputNum();
			if(sel==0) {
				System.out.println("===============================");
				System.out.println("이전화면으로 돌아갑니다");
				return cMenus;
			} else if(sel>1) {
				System.out.println("===============================");
				System.out.println("잘못된 입력입니다");
			}
			while(sel==1) {
		MenuDTO newMenus [] = new MenuDTO[cMenus.length+1];	
		
		int idx = 0;
		for (MenuDTO nMenu : cMenus) {
			if (nMenu != null) {
				newMenus[idx] = nMenu;
				idx++;
			}
		} 
		int addNum = newMenus.length;
		System.out.println("===============================");
		System.out.println(addNum+"번 메뉴의 이름을 입력하세요");
		String addName = sc.nextLine();
		System.out.println(addNum+"번 메뉴의 가격을 입력하세요");
		int addPrice = inputNum();
		newMenus[addNum-1] = new MenuDTO(addName, addPrice);
		System.out.println(addNum+"번 메뉴: " +newMenus[addNum-1].getName()
				+newMenus[addNum-1].getPrice()+"원 이 추가되었습니다");
		cMenus = newMenus;
		break;
		}
		}
	}
	public MenuDTO [] modifyMenu(MenuDTO[] cMenus) {
		
		while(true) {
			System.out.println("===============================");
			System.out.println("현재 메뉴:");
			displayC(cMenus);
		System.out.println("수정하실 메뉴를 고르세요 1~"+cMenus.length);
		System.out.println("0입력시 종료합니다");
		int selMenu = inputNum()-1;
		if (selMenu==-1) {
			System.out.println("===============================");
			System.out.println("이전화면으로 돌아갑니다");
			break;
		}
		
		while(true){
			System.out.println("===============================");
			System.out.println("수정하실 항목을 정하세요");
			System.out.println("1. 메뉴 이름 , 2. 메뉴 가격, 3.종료");
			int sel = inputNum();
		if(sel==1) { System.out.println("수정하실 이름을 입력하세요");
		         String newName = sc.nextLine();
		         cMenus[selMenu].setName(newName);		         
			continue;}
		if(sel==2) { System.out.println("수정하실 가격을 입력하세요");
				 int newPrice = inputNum();
				 cMenus[selMenu].setPrice(newPrice);
			continue;}
		if(sel==3) { System.out.println("===============================");
			System.out.println((selMenu+1)+"번 메뉴 수정 완료");
		System.out.println(cMenus[selMenu].getName()+", "+cMenus[selMenu].getPrice()+"로 수정되었습니다");
			break;}
		} 
	}
	return cMenus;
	}//메뉴수정
	public MenuDTO [] deleteMenu(MenuDTO[] cMenus) {
		while(true) {
			System.out.println("===============================");
		System.out.println("현재 메뉴:");
		displayC(cMenus);
		System.out.println("삭제할 메뉴의 번호를 입력하세요 1~"+cMenus.length);
		System.out.println("0입력시 종료합니다");
		int choice = inputNum()-1;
		if (choice==-1) {
			System.out.println("===============================");
			System.out.println("이전화면으로 돌아갑니다");
			return cMenus;			
		}
		while(true) {
		if(choice<cMenus.length){
			cMenus[choice] = null;
		MenuDTO temps[] =  new MenuDTO[cMenus.length-1];
		int idx = 0;
		for(MenuDTO cMenu : cMenus){
			if(cMenu != null){
				temps[idx] = cMenu;
				idx ++;
			} cMenus = temps;
			
		}break;
		} else{
			System.out.println("===============================");
			System.out.println("없는 메뉴 입니다");
			break;
		}
		}
		}
	}
	
}//class
			
