package pack03.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02_FileWriter {
public static void main(String[] args) throws IOException {
	//텍스트 파일을 쓰는 경우
	// DB가 끊겨서 오류가 날 경우, 업로드 해야하는 데이터를 덱스트나 로그로 남겨둠. , csv
	// Java 변수 => 텍스트 파일로 만들어 냄.(Out, flush)
	// file 객체를 이용해서 임시로 폴더만 만들고 FileWriter 통해 데이터를 쓰는 경우
	//File 객체를 이용해서 임시 파일을 만들고, FileWriter를 이용해 쓰는경우
	//File객체를 이용해 새 파일을 만들고,....
	File directory = new File("Ex02_FileWriter\\file2.txt");
	if(!directory.isFile()) {
		directory.createNewFile();
	}
	Writer writer = new FileWriter("Ex02_FileWriter\\file2.txt", true);
	for (int i = 2; i < 10; i++) {
		for (int j = 1; j < 10; j++) {
			
			writer.write(i+"x"+j+"="+i*j+"\n");
		}
		writer.write("\r\n");
	}
	writer.flush();
}
}
