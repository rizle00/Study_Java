package common;

import member.memberDAO;
import product.ProductDAO;
import product.ProductDTO;

public class ProgramMain {
	//common -> 공통으로 사용 클래스 (메소드, 변수)
	//프로그램 메인 -> 멤버 -> 상품
	// 구조에 대한 생각.. 
	public static void main(String[] args) {
	common common = new common(); // 스캐너 초기화
	memberDAO dao = new memberDAO(common);
	common.items = new ProductDAO(common).initItems();
	dao.startUserLogin();
	
	common.endProgram();//스캐너 종료
}
}
