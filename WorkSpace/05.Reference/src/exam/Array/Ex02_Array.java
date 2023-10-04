package exam.Array;

import java.util.Arrays;

public class Ex02_Array {
public static void main(String[] args) {
	int [] arr = { 2, 3, 5, 1, 7, 4, 8, 6, 10, 9};
	int [] arrO = new int [10];
	for(int i =0; i<arr.length; i++) {
		for(int j = 0; j<arr.length; j++) {
			if(i+1==arr[j]) {
			arrO[i]=i+1;
		} 
			}
	}System.out.println(Arrays.toString(arrO));
	int min;
	int [] arrs = { 2, 3, 5, 1, 7, 4, 8, 6, 10, 9};
	int [] tmepArr = new int [10];
	//어떤 데이터 sorting(정렬) ==> database asc, desc
	Arrays.sort(arrs);
	System.out.println(Arrays.toString(arrs));
	for(int i =0; i<arrs.length; i++) {
		for(int j =i+1; j<arrs.length; j++) {
			if(arrs[i]>arrs[j]) {
				min=arrs[i];
				arrs[i]=arrs[j];
				arrs[j]=min;
				
			}
		}
	}System.out.println(Arrays.toString(arrs));
}
}
