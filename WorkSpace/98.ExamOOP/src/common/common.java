package common;

import java.util.Scanner;

import member.memberDTO;
import product.ProductDTO;

public class common {
	private Scanner scan; //접근제한자
	private memberDTO loginInfo; // 로그인 성공 시 배열(DAO)에 있는 정보 중 하나의 데이터를 저장해둠
	public ProductDTO [] items;
	
	//1.숫자 형태를 입력받아야할때
	// 1.1 +메세지
	// 1.2 값체크
	//2. 문자열 입력
	
	public String getStrScanner(String msg) {
		System.out.println(msg);
		return getStrScanner();
	}
	public memberDTO getLoginInfo() {
		return loginInfo;
	}
	public void setLoginInfo(memberDTO loginInfo) {
		this.loginInfo = loginInfo;
	}
	
	public String getStrScanner(int checkValue) {
		while(true) {
			String value = scan.nextLine();
			if(value.length()>checkValue) {
				return value;
			}else {
				System.out.println(checkValue+"보다 큰 글자 수 입력");
			}
		}
	}
	
	public String getStrScanner() {
		return scan.nextLine();
	}
	
	public int getIntScanner(int checkValMin, int checkValMax) {
		while(true) {// 1~3
			int value = getIntScanner();
			if(value >= checkValMin && value <= checkValMax) {
				return value;
			} else {
				System.out.println(checkValMin+"~"+checkValMax+" 사이 값 입력");
			}
		}
		
	}
	// ctrl + alt + h 메소드 쓰인곳 모음
	public int getIntScanner(int checkVal) {
		while(true) {
			int value = getIntScanner();
			if(value > checkVal) {
				return value;
			} else {
				System.out.println(checkVal+" 보다 큰 값 입력");
			}
		}
		
	}
	public int getIntScanner() {
		while(true) {
			try {
				return Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력!!");
			}
		}
	}
	
	public common() { //통신 열기
		scan = new Scanner(System.in);
	}
	
	//통신 닫기
	public void endProgram() {
		if(scan!=null) scan.close(); // 한줄일때만 중괄호 생략 가능
			
		scan = null;
	}
}
