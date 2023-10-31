package test01.board;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		int number = 0;
		while(true) {
			System.out.println("메뉴를 선택하세요 1~3");
			System.out.println("1. 게시글 쓰기 2. 게시글 삭제 3. 제목 검색");
			int choiceNum  =  Integer.parseInt(sc.nextLine());
			if(choiceNum==1) {
				System.out.println("제목을 입력하세요");
				String title = sc.nextLine();
				System.out.println("내용을 입력하세요");
				String content = sc.nextLine();
				System.out.println("작성자를 입력하세요");
				String writer = sc.nextLine();
				dao.write(title, content, writer, number+1);
				dao.print(number);
				dao.list.get(number).setNumber(dao.list.get(number).getNumber());
				number++;
//				int writeNum = dao.list.get(number).getNumber();
			} else if (choiceNum==2) {
				System.out.println("삭제하실 글 번호를 입력하세요");
				int inputNum = Integer.parseInt(sc.nextLine());
				dao.delete(inputNum-1);
				number--;
			} else if(choiceNum==3) {
				System.out.println("검색하실 제목을 입력하세요");
				String inputTitle = sc.nextLine();
				dao.search(inputTitle);
			} else {
				System.out.println("잘못된 접근");
			}
		}
	}
}
