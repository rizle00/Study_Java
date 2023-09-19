package pack01.ExIf;

public class Ex03_IfElseIfElse {
public static void main(String[] args) {
	//if(A) { }
	// 조건식 A 가 true 일 때 실행, 연결된 else if, else 실행x
	// A가 false 일 때 else 이후의 것이 실행
	int score=85;
	if(score>=90) {
		System.out.println("A");
	}else if(score>=80) {
		System.out.println("B");
	}else if(score>=70) {
		System.out.println("C");
	}else if(score>=60) {
		System.err.println("D");
	}else {
		System.out.println("F");
	}
	int []scores= {62, 72, 23, 95, 83, 92, 100};
	String []name= {"a", "b", "c", "d", "e", "f", "g"};
	int j=0;
	for (int i=0; i<scores.length; i++) {
	     if(scores[i]>90) {
	    	 j++;	    	 
			} while(j==3) {
				
			System.out.println(name[i]+"는 A이며, A는"+j+"명입니다");
		}
		
		
		
	}
}
}
