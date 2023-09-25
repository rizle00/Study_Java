package pack02.exArray1;

public class Ex01_Array {
public static void main(String[] args) {
	int score1=1;
	int score2=2;
	int score3=3;
	int score4=4;
	int score5=5;
	System.out.println("score1:"+score1);
	System.out.println("score2:"+score2);
	System.out.println("score3:"+score3);
	System.out.println("score4:"+score4);
	System.out.println("score5:"+score5);
	//각각을 변수 이름을 주고 저장하는 것은 매우 비합리적(변수 이름의 오류, 값 할당 오휴, 사용시 불편)
	
	//배열 : 자료형 변수를 생성하고 사용할 때 주로 사용
	//1. "동일한" 자료형(데이터타입)을 2."정해진 수"만큼 저장하고 사용하는 3.객체.
	//4. 각각의 데이터는 "index"라는 주소 로 구분한다
	//5. 중간에 크기 변경이 불가능하다.
	// 해당 데이터를 알아볼 수 있는 단어 뒤에 s붙이기, Arr붙이기
	//int[] intArr; <= 변수의 선언
	//intArr= new int[4]; <= 초기화
	int[] intArr;
	//배열의 크기가 n 이 주어졌을 때 배열의 인덱스는 0~n-1 까지를 의미함
	//배열의 데이터 타입이 주어지면 한칸은 해당하는 타입의 변수와 같다.
	intArr = new int[4];//stack[intArr, memoryNum] -> heap memoryNum: [0] [1] [2] [3]
	System.out.println(intArr); //[I@515f550a <- 힙의 주소 [의미없는 값]
	intArr[0] = 1; //  intArr[Indx]== 배열의 타입 변수와 같다.
	intArr[1] = 2;
	intArr[2] = 3;
	intArr[3] = 4;
	System.out.println(intArr[0]);
	System.out.println(intArr[1]);
	System.out.println(intArr[2]);
	System.out.println(intArr[3]);
	for(int i=0; i<intArr.length; i+=2) {
		System.out.println(intArr[i]);
	}
}
}
