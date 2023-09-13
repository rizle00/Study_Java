package pack01.variable;

public class Ex05_VariableLocation {
	public static void main(String[] args) {
		// 블럭킹은 자바프로그램의 시작과 끝을 의미하면서 지역도 의미함.
		// 자바에서의 지역은 매우 중요한 개념.
		// 클래스의 지역을 제외하고, 만들어진 모든 변수들은 지역 변수라고한다.
		// local variable => lv
		// 지역변수 int num=10;
		{// 메모리에 올림
			{
				int num = 10;
				int a = 3;
			}

		}
	}// 메모리에서 내림

	{

	}
}
