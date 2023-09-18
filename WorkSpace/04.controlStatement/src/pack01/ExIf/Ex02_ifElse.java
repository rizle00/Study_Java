package pack01.ExIf;

public class Ex02_ifElse {
public static void main(String[] args) {
	
	int score =90;
	if(score>=90) {
		System.out.println("90점 이상이며 A등급 입니다");
			} else {
				System.out.println("망하셨습니다.");
			}
	int j=0;
	int[] scores= {85 , 79, 92, 58 , 100, 93};
	for (int i=0; i<scores.length; i++) {
		if(scores[i]>=85){
			
			j+=1;
			
		}
		
	}
	System.out.println(j);
	
	String [] users = {"a","b","c"};
	for(int n=0; n<users.length;n++) {
		System.out.println("!"+users[n]+"!");
		
	}
	
	
}
}
