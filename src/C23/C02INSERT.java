package C23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class C02INSERT {

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
												//tbl_std 는 테이블의 이름
		pstmt = conn.prepareStatement("insert into tbl_std values(?,?,?)");		//여기서 ? 가 바인딩변수라고 하는데 들어갈 값을 ?로 나타낸다.
		pstmt.setString(1, "야길동");
		pstmt.setInt(2, 12);
		pstmt.setString(3, "서울");		//각 열 다 맞춰서 값을 넣어야함 안그러면 파라미터 에러 ? 같은거 뜸
		int result = pstmt.executeUpdate(); //DML(INSERT , UPDATE , DELETE)		//insert 가 되면 1 리턴 아니면 0 리턴
		if(result>0)
			System.out.println("INSERT 성공 !");
		else
			System.out.println("인서트 실패..ㅠㅠ");

		}catch(Exception e) {
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
