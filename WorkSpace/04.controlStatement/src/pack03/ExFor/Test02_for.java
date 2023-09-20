package pack03.ExFor;

public class Test02_for {
public static void main(String[] args) {
	for(int i=1; i<10; i++) {
		int j=2;
		System.out.println(j+"x"+i+"="+(j*i));
	}
	for(int i =2; i<10; i++) {
		System.out.println(i+"단");
		for(int j =1; j<10; j++) {
			System.out.println(i+"x"+j+"="+(i*j));
		}
	}
}
}
