
public class Ex03_Operator {
public static void main(String[] args) {
	//++,--
	//증감 가감식
	int num1 = 1, num2 =1;
	num1++;
	++num2;
	//※ 선행연산 : 변수 앞에 증감식 사용, 후행연산 : 변수 뒤에 증감식 사용
	System.out.println(num1++);
	System.out.println(++num2);
	System.out.println("증감식 종료 후 num1:"+num1);
	System.out.println("증감식 종료 후 num2:"+num2);
	//12, 8, 13,13
}
}
