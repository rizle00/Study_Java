package pack04.exWhile;

public class Test_01whileFor {
public static void main(String[] args) {
	
	int i=2;
	while(i<10) {
		
		System.out.println((i)+"단입니다");
		
		for(int j=1; j<10; j++) {
			
			System.out.println(i+"x"+j+"="+(j*i));
		} i++;
	}

	for (i=2; i<10; i++) {
		System.out.println(i+"단입니다");
		int j=1;
		while(j<10) {
			System.out.println(i+"x"+j+"="+(i*j));
			j++;
		}
	}
}
}
