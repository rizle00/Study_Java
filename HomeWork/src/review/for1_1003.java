package review;

import java.util.Scanner;

public class for1_1003 {
public static void main(String[] args) {
	while(true) {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		System.out.println("("+num1+","+num2+")");
		if (num1+num2==5) {
			break;
		}
	}
	
	for(int x=1; x<11; x++) {
		for(int y=1; y<11; y++) {
			if(4*x+5*y==60) {
				System.out.println("("+x+","+y+")");
			}
		}
	}
	
	for(int i=1; i<5; i++) {
		for(int j=0; j<i; j++) {
			System.out.print("★");
		}System.out.println();
	}
	
	for(int i=1; i<5; i++) {
		for(int j=5; j>i; j--) {
			System.out.print(" ");
		}
		for(int k=0; k<i; k++) {
			System.out.print("★");
		} System.out.println();
	}
	
	for(int i=1; i<5; i++) {
		for(int j=5; j>0; j--) {
			if(i<j) {
				System.out.print(" ");
			} else {
				System.out.print("★");
			}
		}System.out.println();
		
	}
	
	boolean run = true;
	
	Scanner sc = new Scanner(System.in);
	
	while(run) {
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
		int selNum= Integer.parseInt(sc.nextLine());
		if(selNum==1) {
			
			System.out.println("예금액>10000");
			continue;
		}
		if(selNum==2) {
			
			System.out.println("출금액>2000");
			continue;
		}
		if(selNum==3) {
			System.out.println("잔액>8000");
			continue;
		}
		if(selNum==4) {
			System.out.println("프로그램 종료");
			break;
			}
		
		
	}
	boolean run1 = true;
	int balance=0;
	while(run1) {
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
		int selNum1= Integer.parseInt(sc.nextLine());
		switch(selNum1) {
		case 1 :
		 System.out.print("예금액>");
		 balance += Integer.parseInt(sc.nextLine());
		 break;
		
		case 2 :
			 System.out.print("출금액>");
			 
			balance-= Integer.parseInt(sc.nextLine());
			break;
		case 3 :
			 System.out.print("잔액>");		
			 System.out.println(balance);
			continue;
		case 4 :
			System.out.println("프로그램 종료");
			run1 = false;
			break;
		}System.out.println();
	}
	
	int max = 0;
	int [] arr = {1, 5, 3, 8, 2};
	for(int i=0; i<arr.length; i++) {
		for(int j=1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				max = arr[j];
				arr[j]=arr[i]; 
				arr[i]=max;
			}
		}System.out.println(arr[i]);
	}
}
}
