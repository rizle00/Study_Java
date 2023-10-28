package pack04.homeWork;

import java.util.Scanner;

public class MemberServiceExample {
public static void main(String[] args) {                         

		Scanner scan = new Scanner(System.in);                        
		             System.out.println("아이디와 비밀번호를 입력하세요");
		String userId = scan.nextLine();
		String userPw = scan.nextLine();
		MemberService memberService = new MemberService(userId,userPw);            
		
		
		if( memberService.login(userId, userPw)) {
				System.out.println("로그인 되었습니다.");
				memberService.logout(userId);
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
			}
		}
}

