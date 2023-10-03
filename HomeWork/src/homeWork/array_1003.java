package homeWork;

public class array_1003 {
	public static void main(String[] args) {
		int [] arrNum = {1, 2, 3, 4, 6, 7, 0};
		int sum = 45;
		for (int i=0; i<10; i++) {
			for(int j=0; j<arrNum.length; j++ ) {
				if(i==arrNum[j]) {
					sum-=i;
				}
			}
		}System.out.println(sum);
			
		int [] a = { 3 , 5 ,7 , 9 , 1 , 2 , 4 , 10};
		for(int i=0; i<a.length; i++) {
			int min = 11;
			for(int j = i+1; j<a.length; j++) {
			if(a[i]>a[j]) {
				min=a[j];
				a[j]=a[i];
				a[i]=min;
			}// 오른쪽이 작을 때 왼쪽과 바꿈. 작은 수부터 왼쪽으로 정렬 오름차순
			 // 오른쪽이 클 때 왼쪽과 바꿈. 큰 수부터 왼쪽으로 정렬 내림차순 => 무엇을 기준으로 정렬할 것인가
			}System.out.print(a[i]);
		}
		
	}

}
