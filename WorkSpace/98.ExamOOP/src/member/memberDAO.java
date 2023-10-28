package member;

import common.common;
import product.ProductDAO;

public class memberDAO {
	common common; //초기화
	ProductDAO dao; //  초기화

		public memberDAO(common common) { //생성자
			this.common = common;
	}
		//메소드() <- 파라메터부: 데이터를 받아오기 위한 변수 선언만 가능
		public void login(String id, String pw) {
			memberDTO [] memDTOs = getLoginDatas();
			for(memberDTO dto:memDTOs) { // 오른쪽 배열
				if(id.equals(dto.getId())&&pw.equals(dto.getPw())) {
					System.out.println("성공");
					common.setLoginInfo(dto); // 로그인 정보 대입
					break;
				}
			}
		}
		
		public memberDTO[] getLoginDatas(){ // 데스트 데이터 부분 (DB가 아직 없거나 연결 직전 테스트
			memberDTO[] memDTOS = new memberDTO[2]; //  배열 초기화
			memDTOS[0] = new memberDTO("user", "user1", "김유저", "김닉네임");
			memDTOS[1] = new memberDTO("admin", "admin1", "김관리자", "김관리" , true);
			return memDTOS;
		}
		public void inputMoney() {
			System.out.println("금액입력");
			common.getLoginInfo().setMoney(common.getLoginInfo().getMoney()+common.getIntScanner(100));
			displayMoney();
		}
		public void displayMoney() {
			System.out.println(common.getLoginInfo().getMoney()+"원");
		}
		
		public void startAdminMode() {
			dao = new ProductDAO(common);
			if(common.getLoginInfo()==null|| common.getLoginInfo().isAdmin()==false) {
				System.out.println("관리자 계정만 접근이 가능");
				return;
			}while(true) {
				System.out.println("1.상품추가 2.준비중(수정) 3.준비중(삭제) 4.종료(로그아웃)");
				int choiceMenu = common.getIntScanner();
				if(choiceMenu ==1) {
					dao.addItem();
				}
				else if(choiceMenu == 2 ) {
				}
				else if(choiceMenu == 3 ) {
				}
				else if(choiceMenu == 4 ) {
					break;
				}else {
					System.out.println("잘못된 입력");
				}
			
			}
			
		}
		public void startUserMode() {
			if(common.getLoginInfo() ==null) return;
			dao = new ProductDAO(common);
			while(true) {
				System.out.println("1.금액입력 2.상품구매 3.잔돈확인 4.종료(로그아웃)");
				int choiceMenu = common.getIntScanner();
				if(choiceMenu ==1) {
					inputMoney();
				}
				else if(choiceMenu == 2 ) {
					dao.buyItem();
				}
				else if(choiceMenu == 3 ) {
					displayMoney();
				}
				else if(choiceMenu == 4 ) {
					break;
				}else {
					System.out.println("잘못된 입력");
				}
			
			}
		}
		public void startUserLogin() {
			while(true) {
				System.out.println("1.사용자 모드 2.관리자 모드 3.종료");
				System.out.println("메뉴선택");
				int choiceMenu = common.getIntScanner();
				if(choiceMenu == 1) {
					login(common.getStrScanner("아이디 입력"), common.getStrScanner("패스워드 입력"));
					
					startUserMode();
					
					}
//					if(common.getLoginInfo() != null) { // 성공시 로그인 정보가 저장되니 널이 아님
//						System.out.println("로그인 성공!" + common.getLoginInfo());
//					} else {
//						System.out.println("로그인 실패 null");
//					}
				else if(choiceMenu == 2) {
					login(common.getStrScanner("아이디 입력"), common.getStrScanner("패스워드 입력"));
					startAdminMode();
					
				}else if(choiceMenu == 3) {
					System.out.println("종료");
					break;
				} else {
					System.out.println("다시 선택");
				}
			}
		}
}
