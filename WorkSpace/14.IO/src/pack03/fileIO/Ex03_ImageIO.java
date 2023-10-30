package pack03.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_ImageIO {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("바다 노을.jpg");
		FileOutputStream fos = new FileOutputStream("imgC.jpg");
		int data, cnt = 0;
		while((data= fis.read()) != -1) {
			cnt++;
			System.out.println(data);
			fos.write(data); // -> 복사 
		}System.out.println(cnt);
		fos.flush();
	}
}
