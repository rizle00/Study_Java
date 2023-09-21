package pack05.etc;

import java.util.Scanner;

public class Ex02_Break {
public static void main(String[] args) {
	//Scanner : 콘솔(IO)
	//Input :사용자가 입력한 값을 콘솔을 통해 다시 에디터(java)로 가져오는것
	//Output:콘솔창으로 내가 가지고 있는 데이터를 출력하는 명령을 실행(syso)
	Scanner sc = new Scanner(System.in);//스캐너의 초기화 식
	String intputdata = sc.nextLine();// 사용자가 콘솔창에 입력을 하다가 enter키를 
	//blockState: 입력을 대기한다(프로그램은 위에서 아래로 흐름									
	// 입력된 데이터 전부를 가져옴
	//System.out.println("사용자가 입력 :"+intputdata);
	//int intPutInt = sc.nextInt(); <- 사용금지
	// sc.nextLine()은 사용자가 입력한 값을 '반드시' String 형태로 우리한테 되돌려줌.
	// sc.nextLine ==  내가 엔터친 개수
	System.out.println("아이디를 입력하세요");
	String userId = sc.nextLine();
	System.out.println("비밀번호를 입력하세요");
	String userPw = sc.nextLine();
	System.out.println("비밀번호 확인");
	String userPwC = sc.nextLine();
	if(userPw.equals(userPwC)) {
		System.out.println("로그인 성공");
	}else {
		System.out.println("니기야");
	}
		
}
}
