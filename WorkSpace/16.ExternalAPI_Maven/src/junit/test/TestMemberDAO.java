package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pack01.jdbc.MemberDAO;
import pack01.jdbc.MemberDTO;

class TestMemberDAO {
	
	@DisplayName("test con")
	@Test
	void test() {
		MemberDAO dao = new MemberDAO();
		assertTrue(dao.isConnection());
//		System.out.println(dao.isConnection());
		
	}
	@DisplayName("test sel")
	@Test
	void selectMember() {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember();
		assertTrue(list.size()!=0);//조회 후 list의 개수 (데이터 개수)가 0보다 크면 조회 성공
	}
	@DisplayName("test display")
	@Test
	void display() {
		MemberDAO dao = new MemberDAO();
//		dao.memberDisplay(null);
		ArrayList<MemberDTO> list = dao.selectMember();
		dao.memberDisplay(list);
	}
//	@DisplayName("test in")
//	@Test
	void insertMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("us1","aaa");
		dao.insertMember(dto);
//		dao.insertMember("us1","aa"); => dto로 받아오게 수정
	}
	@DisplayName("test up")
	@Test
	void updateMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("us1","cc");
		dao.updateMember(dto);
//		dao.updateMember("us1", "cc"); => dto로 받아오게 수정
	}
	
	@Test
	void deleteMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("us1","cc");
		dao.deleteMember(dto);
	}
	
	@Test
	void isUser() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("user","ad1234");
		System.out.println(dao.isUser(dto));
	}
}
