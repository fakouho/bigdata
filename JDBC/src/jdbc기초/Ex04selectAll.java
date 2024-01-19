package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex04selectAll {

	public static void main(String[] args) {
		// ======전체 회원 조회 =========
		// id 이름 나이 점수
		ResultSet ro = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");                                // 1. Class.으로 주소찾기
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);              // 2. 드라이버매니저로 입력값넣기

			String sql = "SELECT * FROM bigdatamember;";                  // 3.스트링 sql문 넣기
			psmt = conn.prepareStatement(sql);

			ro = psmt.executeQuery();
			System.out.println("========조회=======");
			

			if (ro != null) {
				while (ro.next() == true) {
					String id = ro.getString("id");
					String pw = ro.getString("pw");
					String name = ro.getString("b_name");
					int age = ro.getInt("age");
					int score = ro.getInt("score");
					System.out.println(id + " \t" + pw + "\t" + name + "\t " + age + "\t" + score);
				}
			} else {
				System.out.println("정보가 없습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {																				//4.파이널
			if (psmt != null) {

				System.out.println("성공");

			} else {
				System.out.println("실패");
			}
		}

	}

}
