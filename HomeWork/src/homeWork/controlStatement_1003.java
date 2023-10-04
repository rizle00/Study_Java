package homeWork;

import java.util.Scanner;

public class controlStatement_1003 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int selNum = Integer.parseInt(sc.nextLine());
	switch (selNum) {
	case 1 :
		System.out.println("남자입니다");
		break;
	case 2 : 
		System.out.println("여자입니다");
		break;
	case 3 : 
		System.out.println("남자입니다");
		break;
	case 4 :
		System.out.println("여자입니다");
		break;
	default :
		System.out.println("입력 오류 입니다");
	
	}
	
	String id = "admin";
	String pw = "admin1234";
	
	System.out.print("아이디를 입력하세요 :");
	String userId = sc.nextLine();
	System.out.println(userId);
	System.out.print("비밀번호를 입렵하세요 :");
	String userPw = sc.nextLine();
	System.out.println(userPw);
	
	if(userId.equals(id) && userPw.equals(userPw)) {
		System.out.println("로그인 중입니다");
		System.out.println("관리자님 환영합니다."+userId+"님 접속");
	} else {
		System.out.println("로그인 중입니다");
		System.out.println("잘못된 접근 입니다 아이디 또는 비밀번호를 확인 하세요.!!");
	}
	
	int dataA = Integer.parseInt(sc.nextLine());
	int dataB = Integer.parseInt(sc.nextLine());
	System.out.println("dataA:"+dataA+", dataB:"+dataB);
	if(dataA<dataB) {
		System.out.println("dataA("+dataA+") < dataB("+dataB+")");
	} else if (dataA>dataB) {
		System.out.println("dataA("+dataA+") > dataB("+dataB+")");
		
	} else {
		System.out.println("dataA("+dataA+") = dataB("+dataB+")");
		
	}
	
	int iData = Integer.parseInt(sc.nextLine());
	System.out.println("입력된 데이터 :"+iData);
	for(int i=0; i<iData; i++ ) {
		System.out.print(iData-i+",");
	} System.out.println();
	for(int i=0; i<iData; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print("★");
			
		}System.out.println();
	}
	int data1 = Integer.parseInt(sc.nextLine());
	int data2 = Integer.parseInt(sc.nextLine());
	
	int gap = 0;  
	
	if (data1>data2) {
		gap=data1-data2;
		int sum = 0;
		for(int i = 0; i<gap; i++) {
			
			System.out.print(data2+"+");
			sum+=data2; 
			data2++; 
	}System.out.print(data1);
		sum+=data1;
		System.out.println("="+sum+"입니다");
	
	} else if (data1<data2) {
		gap=data2-data1;
		int sum = 0;
		for(int i = 0; i<gap; i++) {
			System.out.print(data1+"+");
			sum+=data1;
			data1++; 
	} System.out.print(data2);
		sum+=data2;
		System.out.println("="+sum+"입니다");
	
	}else {
		System.out.println("누적합이 없습니다");
	}
	
}
}
