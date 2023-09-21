package pack04.exWhile;

public class Ex01_while {
public static void main(String[] args) {
	// for, while
	// for : 정해진 횟수를 정확히 인지하고 있을때
	//ex) 구구단의 경우 등 얼마나 반복할지 알고있다.
	//while : 정해진 횟수를 모르나 어떤 조건에 의해서 반복해야할때.
	// ex) 단순하게 무한반복을 하다가 종료키를 이용, 꺼야할때/ 데이터를 가져 왔는데 건 수 를 모름
	// 내가 데이터를 읽은 후 그 다음 데이터가 있는지의 판단(Buffer)
	// while(true) {
	//            } -> 변수를 무조건 밖에다 만들어야한다.
	//  			   제어 변수가 제어문 외부에 있을때 단점. 초기화x
	// 몇 회를 반복해야 하는 경우 : 변수, 조건식, '증감식'
	int i=0, sum =0; // 반복문 내부에서는 반복변수의 누적이 불가능.
	while(i<10) {
		++i; sum+=i;
		System.out.println("1부터"+i+"까지의 합:"+sum);
	}//등차수열 n(n+1)/2 공식 을 써서 빠르게 처리.(튜닝)
		 int a =1;
		 while(a<10) {
			 System.out.println(2+"x"+a+"="+(2*a));
			 a++;
		 }
		 int b = 2, c=1;
		 while(b<10) { 
		 c=1;System.out.println(b+"단입니다");
			 while(c<10){
				 System.out.println(b+"x"+c+"="+(b*c));
				 c++;
			 } 
			 b++;
		 }
}
}
