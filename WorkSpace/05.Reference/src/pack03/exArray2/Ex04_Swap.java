package pack03.exArray2;

public class Ex04_Swap {
public static void main(String[] args) {
	int num1 = 10, num2 =20;
	System.out.println("num1: "+num1+"num2:"+num2);
	int[] nums = {num1, num2};
	num1 = nums[1];
	num2 = nums[0];
	
	int tempNum=num1;
	num1=num2;
	num2=tempNum;
	
	int[] arr = {3, 5, 7, 9, 1, 2, 4, 10};
	for(int i=1; i<arr.length; i++) {
		int small=0;
		while(true) {
		if(arr[i-1]<arr[i]) {
			small=arr[i-1];					
				}else {
					small=arr[i];
				}
			}
		}
	
	int [] arrNum = {1, 2, 3, 4, 6, 7, 0};
	int sum = 45;
	for (int i=0; i<10; i++) {
		for(int j=0; j<arrNum.length; j++ ) {
			if(i==arrNum[j]) {
				sum-=i;
				System.out.print(i+",");
			}
		}
	}System.out.println(sum);
	
}
}
