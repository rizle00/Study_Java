package pack02.VariabelType;

public class Ex05_Escape {
public static void main(String[] args) {
	//Escape 문자 왜 쓸까?
	//문자열 내부에 " 출력
	//출력을 할수 없는 문자나 명령어를 통해서 문자열 정리 등의 기능이 가능한 것.
	char char_v='"';
	System.out.println(char_v);
	System.out.println("너는\"너\"다");
	String str_v="\"자바\"를 좋아합니다.";
	System.out.println(str_v);
	//tab
	System.out.println("번호\t이름\t직업 혈액형");
	System.out.println("d:\\folder\\");
	//ln : line new (새줄에 글을 출력)
	System.out.println("a\nb");
}
}
