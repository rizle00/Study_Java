import java.io.FileWriter;
import java.io.IOException;

public class Pr01_Exception {
public static void main(String[] args) {
	FileWriter f = null; // f를 초기화, 
	try {
		f = new FileWriter("data.txt");
	f.write("Hello");
	//에러 발생가능. 
	} catch(IOException e) {
		e.printStackTrace();
	} finally { // 에러가 발생하더라도 끝은 내야해서
		if (f != null) { // f가 null 이 아니라면
			try{
				f.close(); // 예외처리 필요
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}
}
