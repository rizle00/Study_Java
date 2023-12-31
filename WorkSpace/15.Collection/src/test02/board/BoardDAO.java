package test02.board;

import java.util.ArrayList;

public class BoardDAO {
	//쓰기, 삭제, 검색, 전체 목록
	
	public void select(ArrayList<BoardDTO> list) {
		if(list.isEmpty()) {
			System.out.println("게시글 없음");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getBoardNo());
			System.out.print(list.get(i).getTitle());
			System.out.print(list.get(i).getContent());
			System.out.println(list.get(i).getWriter());
		}
	}

	public BoardDTO insert() {
		BoardDTO dto = new BoardDTO(3, "메소드", "메소드1", "메소드2");
		return dto;
	}
	public void delete(ArrayList<BoardDTO> list) {
		list.remove(0);//  => 스캐너
	}
	
	public void selectWhere(ArrayList<BoardDTO> list) {
		//임시 list를 만들어서 select 메소드 실행
		// list 를 입력받아 for문에서 eq
		String findParam ="제목";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(findParam))
			System.out.print(list.get(i).getBoardNo());
			System.out.print(list.get(i).getTitle());
			System.out.print(list.get(i).getContent());
			System.out.println(list.get(i).getWriter());
		}
		
	}
}
