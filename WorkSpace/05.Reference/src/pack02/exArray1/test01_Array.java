package pack02.exArray1;

import java.util.Random;

public class test01_Array {
public static void main(String[] args) {
	Random r =  new Random();
	int intArray[];
	intArray =  new int[10];
	int sum=0, i =0;
	while(i<intArray.length) {
		intArray[i] =r.nextInt(10)+1;
		System.out.println(intArray[i]);
		sum+= intArray[i];
		i++;
	}
	System.out.println(sum);
	System.out.println(sum/i);
	
}
}
