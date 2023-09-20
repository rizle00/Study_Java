package pack03.ExFor;

public class Ex03_ForFor {
public static void main(String[] args) {
	// for 문이 3개 이상 일 때는 코드 이상을 꼭 의심하자.
	for(int i=1; i<11; i++) {
		System.out.println(i+"");
		for(int j=1; j<6; j++) {
			System.out.print(j+"");
		}
	}
}
}
