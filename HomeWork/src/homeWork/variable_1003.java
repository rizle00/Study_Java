package homeWork;

import java.util.Scanner;

public class variable_1003 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int iData =Integer.parseInt(sc.nextLine());
	System.out.println(iData);

	double dData = iData;
	System.out.println(dData);
	
	System.out.println("첫번째 숫자를 입력하세요");
	int num1 = Integer.parseInt(sc.nextLine());
	System.out.println(num1);
	System.out.println("두번째 숫자를 입력하세요");
	int num2 = Integer.parseInt(sc.nextLine());
	System.out.println(num2);
	
	System.out.print(num1+"은"+num2+"보다 작습니다");
	boolean small = num1 < num2  ? true : false;
	System.out.println(small);
	System.out.print(num1+"은"+num2+"보다 큽니다");
	boolean big = num1 > num2  ? true : false;
	System.out.println(big);
	System.out.print(num1+"은"+num2+"와 같습니다");
	boolean same = num1 == num2  ? true : false;
	System.out.println(same);
	
	
}
}
