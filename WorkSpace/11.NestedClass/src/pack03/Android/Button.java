package pack03.Android;

public class Button {
	
	public OnClickListener listener; //null <= 외부에서 어떤 이벤트를 작성 할지 결정
	
// 자주 사용 x
// public OnClickListener getListener(){
//	return listener
//}
	
	//os가 해줌
	void click() {
		listener.onClick();
	}
	public void setListener(OnClickListener listener) {
		this.listener = listener;
		// 실제로 안드로이드가 감지해서 실행함.
		this.click();
	}
		static interface OnClickListener{
			void onClick();
			// OnClickListener라는 인터페이스 형태를 사용하기 위해서 onClick이라는 메소르는 반드시 있어야함.
		}
}
