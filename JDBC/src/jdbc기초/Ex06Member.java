package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06Member {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Ex01Join join =new Ex01Join();
//		Ex02로그인 roge = new Ex02로그인();
//		Ex03Delete dele = new Ex03Delete();
//		Ex04selectAll sel =new Ex04selectAll();
//		Ex05Update upda = new Ex05Update();

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
				PreparedStatement psmt = null;
				Connection conn = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost/jdbctest";
					String user = "root";
					String password = "12345";
					conn = DriverManager.getConnection(url, user, password);
					if (conn != null) {
						System.out.println("연결 성공");
					} else {
						System.out.println("연결 실패");
					}
					String sql = "INSERT INTO bigdatamember(id,pw,b_name,age,score) values(?,?,?,?,?);";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setString(3, b_name);
					psmt.setInt(4, age);
					psmt.setInt(5, score);
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("회원가입 성공");
					} else {
						System.out.println("회원가입 실패");
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
			}else {
				break;
			}
		}

	}

}
