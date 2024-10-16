package C23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//class park

public class C06JDBC_EX {

	public static void main(String[] args) throws Exception{

		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";

		Connection conet = null;
		ResultSet rs = null;					//jdbc 에서 사용할 참조 변수 선언
		PreparedStatement pre = null;


		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("jdbc 연결 중..");
		conet = DriverManager.getConnection(url,id,pw);
		System.out.println("연결됨 나이 승 !");
		
		
		try {
			pre = conet.prepareStatement("DELETE FROM TEST1 WHERE 고시일자 = '1983%'");
			int result = pre.executeUpdate();
			if(result>0)
				System.out.println("삭제 성공");
			else
				System.out.println("삭제 실패..");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
