package C23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class C08Tx {

	public static void main(String[] args) {
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/bookdb";

		//JDBC 참조변수
		 Connection conn = null;
		PreparedStatement pstmt = null;
		Resultset rs = null;


		//
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading SueCC");
		conn = DriverManager.getConnection(url,id,pw);		//특정 db 와 연결이 되면 커넥션 객체가 생김 (매개변수로 값)
				//접속되면 db 연결됨
		System.out.println("DB Connected..!");


		//
		conn.setAutoCommit(false); //autoCommit 비활성화
		pstmt = conn.prepareStatement("insert into tbl_user values('a','1','R',false)");		//여기서 ? 가 바인딩변수라고 하는데 들어갈 값을 ?로 나타낸다.
		pstmt.executeUpdate();
		pstmt = conn.prepareStatement("insert into tbl_user values('b','1','R',false)");		//여기서 ? 가 바인딩변수라고 하는데 들어갈 값을 ?로 나타낸다.
		pstmt.executeUpdate();
		pstmt = conn.prepareStatement("insert into tbl_user values('a','1','R',false)");		//여기서 ? 가 바인딩변수라고 하는데 들어갈 값을 ?로 나타낸다.
		pstmt.executeUpdate();
		pstmt = conn.prepareStatement("insert into tbl_user values('d','1','R',false)");		//여기서 ? 가 바인딩변수라고 하는데 들어갈 값을 ?로 나타낸다.
		pstmt.executeUpdate();
		conn.commit();   //끝난다면 커밋

		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {

			try {
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}

		}



	}
}
