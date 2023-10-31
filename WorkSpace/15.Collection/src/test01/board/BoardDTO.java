package test01.board;

public class BoardDTO {
	private String title, contents, writer;
	private int number;
	BoardDTO(String title, String contents, String writer, int number) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
