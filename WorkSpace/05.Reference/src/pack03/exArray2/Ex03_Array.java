package pack03.exArray2;

public class Ex03_Array {
public static void main(String[] args) {
	//int [] arr = new int[3] / int [][] arr = new int[3][3];
	int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
	System.out.println(arr.length);
	arr = new int [] {3,4}; // 중간에 배열 크기 바꿈 -> 기존 데이터 삭제
	//[] 인터넷에서 array의 표기법
	int [][]arr2 = {
			{0,0},{0,0},{0,0}
	};
	arr2[0] = new int [3];
	arr2[1] = new int [] {0,0,0};
}
}
