
public class Ex06_Oper {
public static void main(String[] args) {
	// = (대입, 값 할당) : 대입 연산자 기준으로 우측에 있는 값을 좌측에 있는 변수에 할당
	// 비교 연산자 (==, <, > , <=, >=)
	//초과 미만 (<,>): 0<4 조건에 해당하는 숫자의 갯수
	//이상, 이하 : 0<= ->조건에 해당하는 숫자의 갯수
	//같다:==
	//다르다 : !=
	// 비교연산 후에는 반드시 T F 
	
	boolean boolean_v1=1<3 && 1<4; //T
	boolean boolean_v2=1>3 || 1==1; //F
	boolean boolean_v3=1<=3; //T
	boolean boolean_v4=1>=3; //F
	boolean boolean_v5=1==3;//F
	boolean boolean_v6=1!=3;//T
	
	//AND && , OR || 조건식 다음엔 조건식.
	
}
}
