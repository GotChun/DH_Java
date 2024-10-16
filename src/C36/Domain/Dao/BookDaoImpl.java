package C36.Domain.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import C36.Domain.Dao.ConnectionPool.ConnectionItem;
import C36.Domain.Dao.ConnectionPool.ConnectionPool;
import C36.Domain.Dto.BookDto;

public class BookDaoImpl implements BookDao {
	//DBCONN 속성
//	private String id="root";
//	private String pw="1234";
//	private String url="jdbc:mysql://localhost:3306/bookdb";
//
//	private Connection conn;

	private ConnectionPool connectionPool;
	private ConnectionItem connItem;

	private PreparedStatement pstmt;
	private ResultSet rs;


	//싱글톤 패턴 처리코드
	private BookDaoImpl() throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn=DriverManager.getConnection(url,id,pw);
//		System.out.println("BookDAOImpl	DB connection Success");

		connectionPool = ConnectionPool.getInstance();
	}


	private static BookDao instance = null;
	public static BookDao getInstance() throws Exception {
		if(instance == null)
			instance = new BookDaoImpl();
		return instance;
	}

	//CRUD
	@Override
	public List<BookDto> select() throws Exception{

		List<BookDto> list = new ArrayList();
		connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();

		pstmt = conn.prepareStatement("select * from tbl_book");


		rs = pstmt.executeQuery();
		BookDto dto =null;
		if(rs!=null) {
			while(rs.next()) {
			dto = new BookDto();
			dto.setBookCode(rs.getLong("bookCode"));
			dto.setBookName(rs.getString("bookName"));
			dto.setPublisher(rs.getString("publisher"));
			dto.setIsbn(rs.getString("isbn"));

			list.add(dto);
		}

		}
		connectionPool.releaseConnection(connItem);
		return list;
	}


	@Override
	public BookDto select(long bookCode) throws Exception{

		connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();

		pstmt = conn.prepareStatement("select * from tbl_book where bookCode=?");
		pstmt.setLong(1, bookCode);

		rs = pstmt.executeQuery();
		BookDto dto = null;
		if(rs!=null) {
			if(rs.next()) {
			dto = new BookDto();
			dto.setBookCode(rs.getLong("bookCode"));
			dto.setBookName(rs.getString("bookName"));
			dto.setPublisher(rs.getString("publisher"));
			dto.setIsbn(rs.getString("isbn"));
		}
		}
		return dto;
	}
	@Override
	public int insert(BookDto dto) throws Exception{
		ConnectionItem connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();

		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");

		pstmt.setLong(1,dto.getBookCode());
		pstmt.setString(2, dto.getBookName());			//밸류 값 삽입하는 메서드
		pstmt.setString(3, dto.getPublisher());
		pstmt.setString(4, dto.getIsbn());

		int result = pstmt.executeUpdate();


		//자원제거
		pstmt.close();

		connectionPool.releaseConnection(connItem);

		return result;

	}
	@Override
	public int delete(long bookCode) throws Exception{

		connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();

		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=? ");

		pstmt.setLong(1,bookCode);

		int result = pstmt.executeUpdate();


		pstmt.close();
		return result;
	}
	@Override
	public int update(BookDto dto) throws Exception{

		connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();

		pstmt = conn.prepareStatement("update tbl_book set bookName = ? , publisher= ? ,isbn = ? where bookCode = ? ");

		pstmt.setString(1, dto.getBookName());
		pstmt.setString(2, dto.getPublisher());
		pstmt.setString(3, dto.getIsbn());
		pstmt.setLong(4, dto.getBookCode());

		int result = pstmt.executeUpdate();

		pstmt.close();
		return result;
	}




}
