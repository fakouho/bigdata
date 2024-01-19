package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		// 디자인 패턴 :계속 같은 문제가 발생해서, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 것
		// MVC패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드들의 모음
		// View : 사용자에게 직접 보여지는 부분
		// Controller : 실제 기능이 일어나는 부분

		Scanner sc = new Scanner(System.in);
		System.out.println("=====빅테이터반 회원 관리 프로그램 =====");
		while (true) {
			System.out.print("1.회원관리 2.로그인 3.회원삭제 4.회원정보조회 5.회원정보수정");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("==== 회원가입 ====");
				System.out.println("ID 입력 : ");
				String id = sc.next();
				System.out.println("PW 입력 : ");
				String pw = sc.next();
				System.out.println("이름 입력 : ");
				String b_name = sc.next();
				System.out.println("나이 입력 : ");
				int age = sc.nextInt();
				System.out.println("점수 입력 : ");
				int score = sc.nextInt();
				// 데이터 베이스에 접근해서 데이터 추가하기!
				// --> 앞으로 데이터베이스에 접근과 관련된 모든 역할을 DAO담당!
				// 1) DAO 꺼내오기
				MemberDAO dao = new MemberDAO();
				// 2) dao에게 보내줄 데이터 한번에 묶기
				MemberDTO dto =new MemberDTO(id, pw, b_name, age, score);
				// 3) 회원가입 기능 사용하기
				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} else if (num == 2) {
				System.out.print("ID 입력 :");
				String id = sc.next();
				System.out.print("비밀번호 입력 :");
				String pw = sc.next();
				ResultSet rs = null;
				PreparedStatement psmt = null;
				Connection conn = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost/jdbctest";
					String user = "root";
					String password = "12345";
					conn = DriverManager.getConnection(url, user, password);
					if (conn != null) {
						System.out.println("DB 성공");
					} else {
						System.out.println("DB 실패");
					}
					String sql = "select * from  bigdatamember where id=? and pw=?";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					rs = psmt.executeQuery();
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

			} else if (num == 3) {
				System.out.print("ID 입력 :");
				String id = sc.next();
				System.out.print("비밀번호 입력 :");
				String pw = sc.next();
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
					String sql = "delete from bigdatamember where id =? and pw=?";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("회원탈퇴 성공");
					} else {
						System.out.println("회원탈퇴 실패");
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
			} else if (num == 4) {
				ResultSet ro = null;
				Connection conn = null;
				PreparedStatement psmt = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // 1. Class.으로 주소찾기
					String url = "jdbc:mysql://localhost/jdbctest";
					String user = "root";
					String password = "12345";
					conn = DriverManager.getConnection(url, user, password); // 2. 드라이버매니저로 입력값넣기
					String sql = "SELECT * FROM bigdatamember;"; // 3.스트링 sql문 넣기
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
				} finally {
					if (psmt != null) {
						System.out.println("성공");

					} else {
						System.out.println("실패");
					}
				}
			} else if (num == 5) {
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
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, nScore);
					psmt.setString(2, id);
					psmt.setString(3, pw);
					int row = psmt.executeUpdate();
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
			} else {
				break;
			}
		}

	}

}
