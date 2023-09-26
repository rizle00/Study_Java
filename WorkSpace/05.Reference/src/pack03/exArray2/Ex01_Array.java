package pack03.exArray2;

public class Ex01_Array {
public static void main(String[] args) {
	//1차원 배열 : 변수(객체)를 요소로 가지는 배열 <- 하나의 정보만 담아짐 String a = "A";
	//ex)String 이라는 타입을 하나로 묶어서 여러개의 정보를 담을수 있는 자료구조 String[] sArr;
	//단축(x축 또는 y축으로 한가지 방향만 가지는 구조) [0][1][2][3] <-
	
	//2차원 배열 : 같은 타입의 1차원 배열을 요소로 가지는 형태
	//x와 y 축이 동시에 있는 행열 (행과 열의 갯수가 일정 할때 ==정방형 == 행x열=> 배열의 총 데이터 개수)
	//[
	//0[0,0][0,1][0,2][0,3]
	//1[1,0][1,1][1,2][1,3]
	//]
	// int [][] arr = new int [size행][size열]; <=정방형의 경우 (colums 열 , rows 행)
	 int [][] arr = new int [2][4];
	 System.out.println("2차원 배열의 크기 : "+ arr.length);
	 System.out.println("2차원 배열열이 가지고 있는 1차원 배열의 크기 : " +arr[0].length);
	 System.out.println("2차원 배열열이 가지고 있는 1차원 배열의 크기 : " +arr[1].length);
	arr[0][0]=1;
	arr[0][1]=2;
	arr[0][2]=3; //  행-1 index , 열 -1 index 4-1 =3
	arr[0][3]=4;
	arr[1][0]=5;
	arr[1][1]=6;
	arr[1][2]=7;
	arr[1][3]=8;
	for(int i=0 ; i<arr.length; i++) {
	for(int j=0 ; j<arr[i].length; j++) {
		System.out.print(i+","+j+":"+arr[i][j]+" ");
	}
		System.out.println();
	}
	
}
}
