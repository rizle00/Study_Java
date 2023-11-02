package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO_Old {
	private Connection conn;
	
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
		
	public void selectMember() {
			if(isConnection()) {
				try {
					PreparedStatement ps = conn.prepareStatement("select * from member");
					ResultSet rs = ps.executeQuery();
//					System.out.println(rs.getRow());
					while(rs.next()) {
						System.out.println("id: " +rs.getString("id") +", pw: " + rs.getString("pw"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	public void insertMember(String id, String pw) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("insert into member values (?, ?)");
				ps.setString(1, id);// 첫번째 물음표에 id 입력
				ps.setString(2, pw);// 두번째 물음표에 pw 입력
				int result = ps.executeUpdate(); //  업데이트 실행
				System.out.println(conn.getAutoCommit());
//				conn.commit();// *확정되지 않은 작업이 있는 테이블 조회 시 연결 실패 뜸. LOCK*
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	public void updateMember(String id, String pw) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("update member set pw = ? where id = ?");
				ps.setString(1, pw);
				ps.setString(2, id);
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		}
	}
}
