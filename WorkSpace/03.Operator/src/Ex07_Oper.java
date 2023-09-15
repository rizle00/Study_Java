
public class Ex07_Oper {
public static void main(String[] args) {
	//삼항 연산자 : 4장에서 배우는 조건문을 많이 이용
	//조건식을 연산하여 t가 나올때 f가 나올떄 결과를 어떤 값으로 받고 싶음.
	// 조건식 (비교연산자)? "참" : "거짓"
	int age=10;
	String result= age==10? "초등3":"초등3x";
	System.out.println(result);
	int score = 70;// 
	String grade = score>90? "A": score>80? "B" : score>70? "c" : "D";
	System.out.println(grade);
}
}
