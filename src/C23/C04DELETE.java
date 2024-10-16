package C23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.protocol.Resultset;

public class C04DELETE {

	public static void main(String[] args) {
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";

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

		pstmt = conn.prepareStatement("insert into tbl_std values(?,?,?)");
		pstmt.setString(1, "홍길동");
		int result = pstmt.executeUpdate(); //DML(INSERT , UPDATE , DELETE)		//insert 가 되면 1 리턴 아니면 0 리턴
		if(result>0)
			System.out.println("INSERT 성공 !");
		else
			System.out.println("인서트 실패..ㅠㅠ");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {

		}




	}
}
