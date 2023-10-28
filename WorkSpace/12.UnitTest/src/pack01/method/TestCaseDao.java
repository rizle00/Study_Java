package pack01.method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCaseDao {
	// junit 에서 메소드 이름을 원하는 문자열로 치환해서 보여줌(가독성)
	// timeout : 응답시간 . 메소드를 호출하고 결과를 받기까지의 시간.
	//(웹 디비에 접속 후 데이터를 받아오기까지 위한 시간)
	//잘못된 부분만 확인하기 때문에 디버깅 속도가 빨라짐.
	//메소드가 불필요한 변수들이 많이 파라미터로 지정되어있다면 테스트 자체가 불편함 -> *코드 리팩토링*
	//다른 개발자가 나의 클래스 메소드 등을 이용할 때 부분만 확인하고 자신의 문제점도 빠르게 파악이 가능
	// 통합 테스트: 모든 개발자의 코드를 병합하여 배포 "전" 테스트 서버 또는 운영 서버에서 테스트함.
	
	//Given , Should, When, Then의 규칙으로 작석.
	//Given : 테스트에 사용 될 자원을 준비하는 과정
	// Should : 조건이나 when 비교에 가기 전 과정이 필요(생략가능)
	// When : 실행(비교) 
	// Then : 검증(원하는 결과값을 얻었는지, 오류?)
	@DisplayName("dao의 int method")
	//@test를 하겠다.
	@Test 
	void testSum() {
		//Given
		DAO dao = new DAO();
		
		//Should
		//if(dao!=null)
		
		//when
		int result = dao.intMethod();
		
		assertEquals(11, result);
		
		dao.intMethod();
	}
}
