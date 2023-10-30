package pack01._input;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_InputKORMulti {
	public static void main(String[] args) {
		try {
			String data = KmjScanner();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String KmjScanner() throws IOException {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		int iData;
		String data = "";
		while((iData=isr.read())!=-1) {
			if((iData==13||iData==10)) {
				break;
			}
			data += (char)iData+""; 
		}
		return data;
//		String SData = null;
//		while(isr.read()!=-1) {
//			char data = (char)isr.read();
//		SData += Character.toString(data); 
//		}System.out.println(SData);
//		return SData;
		
	}
	
}
