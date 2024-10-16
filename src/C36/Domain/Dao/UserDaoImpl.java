package C36.Domain.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import C36.Domain.Dao.ConnectionPool.ConnectionItem;
import C36.Domain.Dao.ConnectionPool.ConnectionPool;
import C36.Domain.Dto.UserDto;

public class UserDaoImpl {

	//DBCONN 속성
//	private String id="root";
//	private String pw="1234";
//	private String url="jdbc:mysql://localhost:3306/bookdb";
//
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	//
//	ConnectionPoolByHikari connectionPool;


	ConnectionPool connectionPool;

	//싱글톤 패턴
	private UserDaoImpl() throws ClassNotFoundException, Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn=DriverManager.getConnection(url,id,pw);
//		System.out.println("UserDAOImpl	DB connection Success");

//		this.connectionPool = ConnectionPoolByHikari.getInstance();
		this.connectionPool = ConnectionPool.getInstance();

	}
	private static UserDaoImpl instance;
	public static UserDaoImpl getInstance() throws Exception {		//여기서 예외들은 컨트롤러로 던져진다. 컨트롤러에서 처리하기 때문
		if(instance==null)
			instance = new UserDaoImpl();
		return instance;
	}

	//CRUD
	public List<UserDto> select(){
		return null;
	}

	public UserDto select(String username) throws Exception {
		ConnectionItem connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();

		pstmt = conn.prepareStatement("select * from tbl_user where username=?");
		pstmt.setString(1,username);

		rs = pstmt.executeQuery();
		UserDto dto =null;
		if(rs!=null) {
			rs.next();
			dto = new UserDto();
			dto.setUsername(rs.getString("username"));
			dto.setPassword(rs.getString("password"));
			dto.setRole(rs.getString("role"));
			dto.setLocked(rs.getBoolean("isLocked"));
		}

		connectionPool.releaseConnection(connItem);

		rs.close();
		pstmt.close();

		return dto;
	}

	public int insert(UserDto dto) throws Exception  {	//회원가입
		ConnectionItem connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();

		pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?)");
		pstmt.setString(1, dto.getUsername());
		pstmt.setString(2, dto.getPassword());
		pstmt.setString(3, dto.getRole());
		pstmt.setBoolean(4, false);   //회원가입시 잠겨있지 않도록 하기위해 false

		int result = pstmt.executeUpdate();

		pstmt.close();

		return result;
	}

	public int update(UserDto dto) throws Exception {	//정보수정
		pstmt = conn.prepareStatement("update tbl_user set password =?,role=?,isLokced=? where username = ?  ");
		pstmt.setString(1, dto.getPassword());
		pstmt.setString(2,dto.getRole());
		pstmt.setBoolean(3, true);		//잠겨있는 상태니까 true
		pstmt.setString(4, dto.getUsername());

		int result = pstmt.executeUpdate();

		return result;
	}

	public int delete(UserDto dto) throws Exception {	//회원탈퇴
		pstmt = conn.prepareStatement("delete from tbl_user where username= ?");
		pstmt.setString(1, dto.getUsername());

		int result = pstmt.executeUpdate();
		return result;
	}



}
