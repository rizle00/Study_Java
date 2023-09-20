package pack03.ExFor;

public class Test01_for {
public static void main(String[] args) {
	int sumA=1, sumB=0 ;int	sum=0;
	for(int i=1; i<10; i+=2) {
		sumA+=i;
		sumB+=i;
	 
	}System.out.println("짝수의 합:"+sumA);
	System.out.println("홀수의 합:"+sumB);
	int sumo=0, sume=0; // 홀수 짝수 분기 합
	for(int i=0; i<10; i++ ) {
		if(i%2==1) {
			sumo+=i;
			
		}else {
			sume+=i;
		}
	}
	System.out.println("홀수의 합:"+sumo);
	System.out.println("짝수의 합:"+sume);
}
}
	

