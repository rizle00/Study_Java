package pack05.Android;

public class MainActivity {
public static void main(String[] args) {
	Button btn =  new Button();
	btn.setOnclickListener(new OnclickListener() {
		
		@Override
		public void onClick(Object v) {
			System.out.println("나중에 버튼이 클릭되면 실행 할 코드");
		}
	});
	
	btn.click();
}
}
