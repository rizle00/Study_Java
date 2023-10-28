package member;

public class memberDTO {
	private String id, pw, name, nickName;
	private int money;
	private boolean isAdmin; //=> 데이터가 true면 관리자 else 사용자
	
	
	

	public memberDTO(String id, String pw, String name, String nickName) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickName = nickName;
	}// 사용자
	
	public memberDTO(String id, String pw, String name, String nickName, boolean isAdmin) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickName = nickName;
		this.isAdmin = isAdmin;
	}// 오버로딩 관리자
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isAdmin() { // is~ -> 불리언타입 이름 약속.
		return isAdmin;
	}

//	public void setAdmin(boolean isAdmin) {
//		this.isAdmin = isAdmin;
//	} 바뀔수 없는 정보

}
