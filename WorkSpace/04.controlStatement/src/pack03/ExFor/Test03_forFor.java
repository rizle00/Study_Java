package pack03.ExFor;

import java.awt.print.Printable;

public class Test03_forFor {
public static void main(String[] args) {
	for(int i=1; i<6; i++) {
		System.out.print(" ");
		for(int j=0; j<i; j++){
			System.out.print(" "); }//어떻게 하면 내가 원하는 만큼 true를 만들까
		System.out.println();
	}
}
}
