package C23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;



public class C05 {

	public static void main(String[] args) {
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
		Class.forName("com.mysql.cj.jdbc.Driver");		//jdbc 드라이버 클래스 로드
		System.out.println("Driver Loading SueCC");
		conn = DriverManager.getConnection(url,id,pw);		//특정 db 와 연결이 되면 커넥션 객체가 생김 (매개변수로 값)
				//접속되면 db 연결됨
		System.out.println("DB Connected..!");
												//tbl_std 는 테이블의 이름

		pstmt = conn.prepareStatement("select * from tbl1");		//여기서 ? 가 바인딩변수라고 하는데 들어갈 값을 ?로 나타낸다.


		//아 배부르다 슈발탱
		rs = pstmt.executeQuery();		//resultset = 자바의 테이블 , sql에서 받은 테이블을 자바에서 보관하고 있는것
		if(rs!=null) {

			while(rs.next()) {	//다음 커서 위치에 데이터가 있으면 true , 커서가 머무름
				System.out.println(rs.getString(1) + " ");
				System.out.println(rs.getString(2) + " ");
				System.out.println(rs.getString(3) + " ");
				System.out.println(rs.getString(4) + " ");
				System.out.println(rs.getString(5) + " ");
				System.out.println(rs.getString(6) + " ");
				System.out.println(rs.getString(7) + " ");			//행이 7개 있으니까 7개 쓰고 
				System.out.println();


			}


		}


		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}



	}
}
