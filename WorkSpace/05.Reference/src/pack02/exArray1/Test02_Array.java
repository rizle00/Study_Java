package pack02.exArray1;

public class Test02_Array {
public static void main(String[] args) {
	int [] Gugu = new int [9];
	for (int i=0; i<Gugu.length; i++) {
		Gugu[i] = 2*(i+1);
		System.out.println(2+"x"+(i+1)+"="+Gugu[i]);		
	}// 디버그 브레이킹 포인트 확인 후 배열 값 확인 가능.
	System.out.println();
	
	String [] star = new String[5];
	for (int i=0; i<star.length; i++) {
		star[i]="";
		 for(int j=-1; j<i; j++) {
			star[i]+="★";
		};System.out.println(i+":"+star[i]);
	}
	for (int i=0; i<star.length; i ++) {
		if(i==0) {
			star[i]= "★";
		}else {
			star[i]=star[i-1]+"★";
		}
	}
		
	
}
}
