package pack01.ExIf;

public class Ex01_If {
public static void main(String[] args) {
	//main 메소드 (함수, 기능)
	//javaProject 에서 프로그램의 시작점을 구분하기 위한 메소드
	//blocking : {  }
	//어떤 문장이나 메소드, 클래스 등등의 지역을 의미함.
	//지역 블럭킹이 열리면 '{' 메모리에 올라가고
	//지역 블럭킹 끝 '}' 메모리에서 내림 반복한다. =>자바
	// 지역 변수
	// if (조건식) {
    //  if 문 지역 } -> 조건 식이 true 일때만 코드 실행.
	int score=100;
	if(score>=90) {
	if(score==100) {System.out.println("전교1등입니다.");	}
		System.out.println("90점 이상이라서 장학금을 받음");
	}
}//main
}//class 
