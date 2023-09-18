package Exam_Operator;

public class Ex01 {
public static void main(String[] args) {
	int num1=2, num2=4;
	System.out.println("num1과 num2의 더하기 결과:?"+(num1+num2));
	System.out.println("num1과 num2의 곱하기 결과:?"+(num1*num2));
	System.out.println("num1과 num2의 빼기 결과:?"+(num1-num2));
	System.out.println("num1과 num2의 나누기 결과:?"+(num1/num2));
	System.out.println("num1과 num2의 나누기의 나머지 결과:?"+(num1%num2));
	num1=-num1;
	System.out.println(num1);
	num1=-num1;
	num1++;
	num2--;
	System.out.println(num1<num2);
	System.out.println(num1==num2);
	System.out.println(num1>=num2);
	System.out.println(num1<2 || num1==num2);
	num1+=1; num2-=2;
	System.out.println(num1<num2 ? true : false+"");
	boolean b1 = num1<num2 ? true : false;
	System.out.println(b1);
	String resultStr = (num1==num2)? "같다" : (num1<num2)? "num2큼" : "num1큼";
	System.out.println(resultStr);
	
	System.out.println(num1);
	System.out.println(num2);
	String id="study";
	String InputId=args[0];
	String pass="1234";
	String InputPs=args[1];
	System.out.println("Hi,");
	if (InputId.equals(id) && InputPs.equals(pass))
		{System.out.println("Master!");}
	else{System.out.println("Who are you?");}
	
	String a = "ava";
	String b = "ava";
	boolean c= a==b;
	System.out.println(c);
	
	
	
}
}
