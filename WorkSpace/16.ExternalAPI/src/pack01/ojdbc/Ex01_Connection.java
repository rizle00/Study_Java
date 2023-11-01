package pack01.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Connection {
//1. 연결 (Statement 가 이동이 가능한 연결로를 만듬 ) : Connection
	
	public static void main(String[] args) {
		try {
//			oracle.jdbc.driver.OracleDriver => 추후 사용
			//java 버전이 늦은 경우. Class.forName 이라는 메소드를 통해 동적 로딩이 필요함.
//			try {
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			Scanner sc = new Scanner(System.in);
			System.out.println("아이디 입력(Member) :");
			String id =sc.nextLine();
			System.out.println("PW 입력(Member) :");
			String pw = sc.nextLine();
			// 현재 상태 -> Sql Injection 공격 당하기 쉬움
			String sql = "select id, pw from member where id = '"+id+"' and pw = '"+pw+"'";
//			String sql = "select id, pw from member where id =? and pw = ?";//?
			
			
			//select id, pw from member id =
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hanul";
			String password = "0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, id);
//			ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("id"));
			}
			if(!conn.isClosed()) {
				System.out.println("핑 성공!");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
