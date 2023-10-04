package review;

import java.util.Scanner;

public class array_1003 {
public static void main(String[] args) {

	int max = 0;
	int [] arr = {1, 5, 3, 8, 2};
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				max = arr[j];
				arr[j]=arr[i]; 
				arr[i]=max;
			}
		}
	}
	
	
	int max1 = 0;
	int num = 0;
	int [] arr1 = {1, 5, 3, 8, 2};
	for(int i = 0; i<arr1.length; i++) {
		if(max1<arr1[i]) {
			max1=arr1[i];	
			num = i;
		}
		
	}System.out.println(num);
	System.out.println(max1);
	
	int [][] array= {
			{95,86}, {83, 92, 96}, {78, 83, 93, 87, 88}
	};
	
	int sum = 0; 
	double avg = 0.0;
	int num1 = 0; 
	int count = 0;
	for(int i=0; i<array.length; i++) {
		for(int j =0; j<array[i].length; j++) {
			sum+=array[i][j];
		//	count++; 
		} num1+= array[i].length;
	} System.out.println(sum);
	avg = (double)sum/num1;
	System.out.println(avg);
	
	int studentNum=0;
	int [] scores = null;
 	Scanner sc = new Scanner(System.in);
 	
   while(true) {
	
	int selectNo = Integer.parseInt(sc.nextLine());
	if (selectNo==1) {
		System.out.print("학생수>");
		studentNum=Integer.parseInt(sc.nextLine());
		System.out.println(studentNum);
	} else if (selectNo==2) {
		scores = new int [studentNum];
		for(int i=0; i<scores.length; i++) {
			scores[i] = Integer.parseInt(sc.nextLine());
			System.out.println(scores[i]);
		}
	} else if (selectNo==3) {
		for(int i = 0;  i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	} else if (selectNo==4) {
		int max2 = 0;
		int num2 = 0;
		int sum2 = 0;
		int max3 = 0;
		int sum3 = 0;
		for(int i = 0 ; i< scores.length; i++) {
			max3 = max3<scores[i] ? scores[i] : max3;
			sum3 += scores[i];
			if(max2<scores[i]) {
				max2=scores[i];
				num2 = i;
			} sum2 += scores[i];
		}System.out.println("최고 점수:"+max2);
		 System.out.println("최고 점수는"+(num2+1)+"번 학생입니다.");
		 System.out.println("평균 점수:"+(sum2/scores.length));
	} 
	
   }
}
}
