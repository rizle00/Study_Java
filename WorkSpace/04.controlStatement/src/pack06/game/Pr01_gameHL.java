package pack06.game;

import java.util.Scanner;

public class Pr01_gameHL {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1~20 사이의 숫자를 입력하세요");
	System.out.println("그 이외의 것을 입력하면 오류가 납니다");
	String inputNum = sc.nextLine();
	int num = Integer.parseInt(inputNum);
	while(true) {
	if(num==17) {
		System.out.println(num+"정답입니다!");
		break;
	} else if (num>17) {
		System.out.println("Up");
		break;
	} else {
		System.out.println("Down");
		break;
	}}
	
}
}
