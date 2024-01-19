package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Ex05Update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// id,pw,수정할 점수
		System.out.println("=====회원정보 수정=====");
		System.out.println("ID를 입력하세요 :");
		String id = sc.next();
		System.out.println("PW를 입력하세요 :");
		String pw = sc.next();
		System.out.println("수정할 점수 입력 : ");
		int nScore = sc.nextInt();

		PreparedStatement psmt = null;
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}

			String sql = "update bigdatamember set Score = ? where id = ? and pw = ?";
			           // 올린다    이곳에        수정  스코어를   조건
			psmt = conn.prepareStatement(sql);
			//전달
			psmt.setInt(1, nScore);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int row = psmt.executeUpdate();
			// sql실행
			
			if (row > 0) {
				System.out.println(" 성공");
			} else {
				System.out.println(" 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
