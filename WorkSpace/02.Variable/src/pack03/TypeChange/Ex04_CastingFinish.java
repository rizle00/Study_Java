package pack03.TypeChange;

public class Ex04_CastingFinish {
public static void main(String[] args) {
	String str_v1="3.14";
	double dos_v1=Double.parseDouble(str_v1);
			System.out.println(dos_v1+1);
	String str_v2="100";
	int ins_v1=Integer.parseInt(str_v2);
	System.out.println(ins_v1+100);
	double do_v1=4.14;
	int in_v1=(int)do_v1;
	short so_v1=(short)ins_v1;
	//변수의 타입마다 담을수 있는 데이터의 양과 내용이 달라서
	//byte short int long char
	//float double
	//명시적 형변환 묵시적형변환
	//parse
	//String선언 혹은 String과의 연산
	//서로 다른 데이터 타입을 연산하기위해서
	
}
}
