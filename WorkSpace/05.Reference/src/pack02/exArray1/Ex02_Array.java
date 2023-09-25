package pack02.exArray1;

public class Ex02_Array {
public static void main(String[] args) {
	// [] <- 자료구조 : 배열 ,  데이터가 하나 이상이 있다.(같은타입으로)
	//데이터타입[] :<= 1차원 배열 : 한가지 데이터 타입을 요소로 가지는 자료구조
	// 내가 알고 있는 대부분의 데이터 타입은 배열로 표현이 가능하다.
	// 데디터타입 [] 배열이름 = new 데이터타입 [int크기];
	// 배열의 크기를 정확히 모르지만 배열의 이름을 예약 -> 추후 사용 예정(null)
	//String [] strArr = new String [10];
	// int [] intArr = null; -> null 로 초기화 해둠.
	//if(intArr != null) {
	// }
	String sArr[] = new String[10];
	for(int i=0; i<sArr.length; i++) {
		sArr[i] = "이름" +(i+1);
		System.out.print(sArr[i]);
	}
	String sArr1[] = {"s1", "s2"};
	
}
}
