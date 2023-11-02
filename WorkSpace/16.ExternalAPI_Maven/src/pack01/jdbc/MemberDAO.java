package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;
	// isConnection => openConnection
	//isConnection 이라는 별도의 메소드 (통신체크) 를 만들어보기
	// -> main 에서 선택하고 입력받은 값으로 동작하게 만들기
	public boolean isConnection() {
//		if(conn == null && !conn.isClosed()) return;
		//url, user, password => Properties 파일(접속정보가 파일로 저장되어 있는것) Stream으로 파일 읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("open"); 
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
		
	public void closeConnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isUser(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("select * from member where id =?");
				ps.setString(1, dto.getId());
				ResultSet rs = ps.executeQuery();
				return rs.next();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection();
			}
		} return false;
	}

	public void memberDisplay(ArrayList<MemberDTO> list) {
		if(list == null || list.size()==0) {
			System.out.println("조회 된 데이터 없음");
			return;
		}
		for(MemberDTO dto : list) {
			System.out.println("ID : "+dto.getId()+" PW : "+dto.getPw() );
		}
	}
	
	public ArrayList<MemberDTO> selectMember() {
		ArrayList<MemberDTO> list = new ArrayList<>();
			
			if(isConnection()) {
				try {
					PreparedStatement ps = conn.prepareStatement("select * from member");
					ResultSet rs = ps.executeQuery();
//					System.out.println(rs.getRow());
					while(rs.next()) {
						MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("pw"));
						list.add(dto);
//						System.out.println("id: " +rs.getString("id") +", pw: " + rs.getString("pw"));
						
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					closeConnection();
				}
			} return list;
		}

	public void insertMember(MemberDTO dto) {
		if(!isUser(dto)) {
			try {
				PreparedStatement ps = conn.prepareStatement("insert into member values (?, ?)");
				ps.setString(1, dto.getId());// 첫번째 물음표에 id 입력
				ps.setString(2, dto.getPw());// 두번째 물음표에 pw 입력
				int result = ps.executeUpdate(); //  업데이트 실행
				System.out.println(conn.getAutoCommit());
//				conn.commit();// *확정되지 않은 작업이 있는 테이블 조회 시 연결 실패 뜸. LOCK*
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
			
		}
	}

	public void updateMember(MemberDTO dto) {
		if(isUser(dto)) {
			try {
				PreparedStatement ps = conn.prepareStatement("update member set pw = ? where id = ?");
				ps.setString(1, dto.getPw());
				ps.setString(2, dto.getId());
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
				
		}
	}

	public void deleteMember(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("delete from member where id =? and pw=?");
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
		}
	}
}
