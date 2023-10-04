package exam.Array;

import java.util.Arrays;

public class Ex01_Array {
public static void main(String[] args) {
	int [] a = {1, 2, 3, 4, 6, 7, 8, 0};
	
	int [] tempArr = new int [10];
	for(int i=0; i<tempArr.length; i++) {
		for(int j = 0; j<a.length; j++) {
			if(i==a[j]) {
				tempArr[i] = 1 ; // 비어있는 인덱스 찾기
			}
		}
	}System.out.println(Arrays.toString(tempArr));
	int sum =0;
	for(int i=0; i<tempArr.length; i++) {
		if(tempArr[i]==0) {
			sum += i;
			System.out.println("빈 숫자:"+i);
		}
	}
	int [] b = {5, 8, 4, 0, 6, 7, 9};
	int endPoint = 90/2;
	for(int i=0; i<b.length; i++) {
		endPoint-=b[i];
	}System.out.println(endPoint);
	
	
	
}
}
