package pack02.exSwitch;

public class Test_Switch {
public static void main(String[] args) {
	int score = 90;
	switch(score/10) {
	case 10:
		System.out.println("A학점");
		break;
	case 9:
		System.out.println("A학점");
		break;
	case 8:
		System.out.println("B학점");
		break;
	case 7:
		System.out.println("C학점");
		break;
	case 6:
		System.out.println("D학점");
		break;
		default://if else 역할
			System.out.println("E학점");
			break;
	}
		
	
	}
	
}

