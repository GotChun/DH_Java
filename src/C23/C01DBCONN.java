package C23;

import java.sql.Connection;				//import 틀려서 연동 안된거였음 ㅅㅄㅄㅄㅄㅄㅄ
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.protocol.Resultset;

public class C01DBCONN {

	public static void main(String[] args) {
													//여기 수업은 그거임 mysql 이랑 연결해서 여기서 자바로 데이터를 수정하는 작업임
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";

		//JDBC 참조변수
		 Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		//
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading SueCC");
		conn = DriverManager.getConnection(url,id,pw);		//특정 db 와 연결이 되면 커넥션 객체가 생김 (매개변수로 값)	url , id ,pw 가 맞으면 연결이 된다 !
				//접속되면 db 연결됨
		System.out.println("DB Connected..!");		//연결 성공했다고 뜸 !
		}catch(Exception e) {						//예외처리
			e.printStackTrace();
		}finally {

			try {
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
