package pack03.ExFor;

public class Ex01_for {
public static void main(String[] args) {
	//모든 제어문은 자신의 지역을 가지며 지역은 중첩가능
	//제어문 - 반복문 (어떤 변수와 변수를 이용한 조건을 주고 그 조건이 true 일 동안 반복실행.)
	//for(1.초기값(변수 초기화),2. <- 조건이 true일때 반복, 4. 변수 증감식){
	//3.반복 구간
	//}
	// for(int i=0;->종료 i<10->반복횟수 ; i++->종료{
	// 반복구간 규칙!!
	//}
	// 행 번호 옆에 더블 킬릭 : 브레이크 포인트
	//stepover 코드 1줄 실행
	//resume 다음 브레이크 포인트 이동
	
		for(int i=1; i<10; i+=2) {
			System.out.println(i+"반복");
		}
		for(int i=10; i<10; i+=2) {
			System.out.println(i+"반복");
		}
		for(int i=0; i<=10; i+=2) {
			System.out.println(i);
		}
		
		for(int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		//디버그 모드
		for(int i=1, j=2; i<10; i++) {
			System.out.println(j+"x"+i+"="+(j*i));
		}
	
}
}
