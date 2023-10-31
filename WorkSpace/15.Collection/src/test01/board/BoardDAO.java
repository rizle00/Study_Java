package test01.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	List<BoardDTO> list =  new ArrayList<>();
	
	public void write(String title, String contents, String writer, int number) {
		list.add(new BoardDTO(title, contents, writer, number));
	}
	
	public void delete(int number) {
		list.remove(number);
		System.out.println(number+1+"번 글 삭제되었습니다");
	}
	public void search(String title) {
		boolean isContain = false;
		for (int i = 0; i < list.size(); i++) {
			isContain = list.get(i).getTitle().equals(title);
		}
		if(isContain) {
			System.out.println("해당 글이 있습니다");
		} else {
			System.out.println("해당 글이 없습니다");
		}
}
	public void print(int number) {
		System.out.print(" 제목: "+list.get(number).getTitle());
		System.out.print(" 내용: "+list.get(number).getContents());
		System.out.print(" 작성자: "+list.get(number).getTitle());
		System.out.println(" 글 번호: "+list.get(number).getNumber());
	}
}
