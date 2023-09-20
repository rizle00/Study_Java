package pack03.ExFor;

public class Ex02_For {
	public static void main(String[] args) {
		for (int i = 1; i < 21; i++) {

			if (i % 2 == 0) {
				System.out.print(i+"짝수");
			} else {
				System.out.print(i+"홀수");
			}
		}
		for (int i = 0; i < 21; i++) {
			switch (i % 2) {
			case 0:
				System.out.println("짝수" + i);
				break;
			case 1:
				System.out.println("홀수" + i);
			}

		}
	}
}
