package Cafe;

public class InfoDTO {


	private String userId = "user", userPw ="user1", 
			managerPw = "admin1",  managerId = "admin";
	public int num; // 메뉴 번호
	public String name; // 메뉴 이름
	
	public String infoArr [] = {"name", "gender", "age", "addrs"};
		
	
	public InfoDTO(int num, String name) {	
		this.num = num;
		this.name = name; //  생성자, 저장할 필드 지정
	}

	public InfoDTO() {
	}



	public String getManagerPw() {
		return managerPw;
	}

	public void setManagerPw(String managerPw) {
		this.managerPw = managerPw;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getManagerId() {
		return managerId;
	}



	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}//class
