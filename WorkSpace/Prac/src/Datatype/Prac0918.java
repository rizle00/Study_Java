package Datatype;

public class Prac0918 {
public static void main(String[] args) {
	System.out.println(1);
	int i = 0;
	while (i<100) {
		System.out.println(2);
		System.out.println(3);
		i++;
	}
	System.out.println(4);
	int sum=0;
	for(int j=0; j<=10; ++j) {
	System.out.println(j*3);
	 sum+=j*3;
	}
			System.out.println(sum);
			
	String[] num = new String[3];
	num[0]="1"; num[1]="3"; num[2]="6";
	int[] scores= {1, 5, 8};
	
	String[] users= {"aa", "bb", "cc"};
	String inputId = args[0];
	
	boolean isLogined = false;
	for(int n=0; n<users.length; n++) {
		System.out.println(users[n]);
		String currentId= users[n];
		if(currentId.equals(inputId)) {
			isLogined=true;
			break;
		}
	}
	System.out.println("Hi,");
	if(isLogined) {
		System.out.println("Master!");
	} else {
		System.out.println("Who are you?");
	}
	
	
	
}
}
