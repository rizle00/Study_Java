package Datatype;

import java.util.Arrays;

public class Data_01 {
public static void main(String[] args) {
	System.out.println(Math.sin(0));
	System.out.println(Math.PI);
	System.out.println(Math.floor(Math.PI));
	//math. 가능한 연산들 
	System.out.println("Hello "
			+ "World".length());// 엔터시 자동으로.
	System.out.println("Hello, [[[name]]]... bye.".replace("[[[name]]]","egoing"));
	int[] arr = {0,1,2,3,4};
	System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
}
}
