package pack01.login;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//IO
		MemberDTO dto = new MemberDTO();
		dto.id = scan.nextLine();
		dto.pw = scan.nextLine();
		
		MemberDAO dao = new MemberDAO();
		if(dao.login(dto) == true) {
			System.out.println("화면 이동");
		} else {
			System.out.println("다시 입력");
		}
		
		scan.close();
		// 기본형 데이터 타입 : 스택 메모리에 값이 바로있음.
		// 참조형 데이터 타입 : 스택 메모리에 주소가 담기고 실제 값은 힙에 있음.
		// == : 스택 메모리의 값을 비교
	
		
			
	}
}
