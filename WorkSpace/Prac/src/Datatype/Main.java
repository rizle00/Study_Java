package Datatype;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int h, m;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		
		if (45<=m) {
			System.out.println("h "+(m-45));
		} else {
			System.out.println((h-1)+" "+(m+15));
		}
		
	}		
}