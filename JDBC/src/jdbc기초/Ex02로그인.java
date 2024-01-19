package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Ex02로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 로그인 기능
		// 1. 사용자에게 아이디와 비밀번호 입력 받기
		System.out.print("ID 입력 :");
		String id = sc.next();
		System.out.print("비밀번호 입력 :");
		String pw = sc.next();
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;

		try {
			// 1. 드라이버로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB통로 열기(URL(주소),USER(아이디),Password(비번)
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("DB 성공");
			} else {
				System.out.println("DB 실패");
			}
			// 3. SQL문 준비
			// 로그인 기능 >> 테이블에 일치한 기능이 있는지 확인하는 것 > select
			// 아이디, 비밀번호 일치하는 데이터의 모든 컬럼 가져오기!

			String sql = "select * from  bigdatamember where id=? and pw=?";

			psmt = conn.prepareStatement(sql);
			// ? 인자 채워주기
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 4. sql문 실행
			rs = psmt.executeQuery();
			// ResultSet이란?
			// :조회된 데이터를 테이블과 같은 형태로 표현해주는 집합 자료구조!
			// :cursor를 가지고 있다.(처음에는 column을 가리키고 있음)
			// :cursor가 가리키고 있는 데이터만 가져올 수 있음.
			// rs.next() ==> cursor를 하나 내리는 작업;

			if (rs.next() == true) {
				String name = rs.getString("b_name");
				int age = rs.getInt("age");

				System.out.println(name + "(" + age + ")환영합니다");
			} else {
				System.out.println("로그인에 실패했습니다.");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			try {
				if (rs != null)
					rs.close();
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
