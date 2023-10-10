package pack01_method;

import java.util.Random;

public class prac01 {
	public int num [] lottoNum() {
		Random r = new Random();
		int num [] = new int [6];
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i-=1; break;
				}
			}
	} return num;
}
}