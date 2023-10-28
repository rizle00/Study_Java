package pack04.homeWork;

public class MemberService {
	
	private String id, pw;
public MemberService(String id, String pw) {
	this.id = id;
	this.pw = pw;
	
}

	public boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345")) {
			return true;
		}return false;
	}
	
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 하셨습니다.");
	}
}
