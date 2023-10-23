package pack05.Android;

public class Button {
	// 인터페이스를 필드로 두고, 메소드를 통해서 인터페이스 메소드의 구현부를 받아온다.
	public OnclickListener listener; // 필드로 가지고 있음
	// null
	
	void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void click () {
		listener.onClick("view");
	}
}
