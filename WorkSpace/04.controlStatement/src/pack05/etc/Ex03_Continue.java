package pack05.etc;

public class Ex03_Continue {
public static void main(String[] args) {
	//continue : 계속한다. (to be continue)
	// & : 1 2 4 8 2의 제곱수 
	// 
	int oddsum=0;
	for (int i=1; i<=10; i++) {
		if((i&1)==1) {
			System.out.println(i+"홀수");
			oddsum +=i;
		}
	} System.out.println(oddsum);
	
	int oddsum1=0;
	for (int i=1; i<=10; i++) {
		if((i&1)!=1) {
			continue; // 짝수 생략.
		}oddsum1 +=i;
	} System.out.println(oddsum1);
}
}
