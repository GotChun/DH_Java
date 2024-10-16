
package 문제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class 문제2 {

	//DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/tmpdb";

	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public static void conn() throws SQLException, Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");		// jdbc 드라이버를 로딩한다.
		conn = DriverManager.getConnection(url,id,pw);	// connector 객체에  url , 아이디 , 비밀번호를 받아 mysql 과 커넥션을 획득한다.
		System.out.println("Driver Loading Success..!!");
		System.out.println("DB Connection...");		//연결 확인 ..
	}
	public static List<BookDto> selectAll() throws SQLException{

		List<BookDto> list = new ArrayList<>();		//컬럼 담을 객체

		pstmt = conn.prepareStatement("select * from tbl_book");

		rs = pstmt.executeQuery();	//결과값을 받음
		BookDto dto = null;		//빈 dto 생성함.
		if(rs!=null) {			// 결과값을 잘 전달받았는지 확인 . null 이라면 아래 반복 실행 안함
			while(rs.next()) {		//계속 데이터를 받는다
				dto = new BookDto();	//책 정보 객체 생성
				dto.setBookCode(rs.getLong("bookCode"));
				dto.setBookName(rs.getString("bookName"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setIsbn(rs.getString("isbn"));

				list.add(dto);	//책 정보 리스트에 추가
			}
		}
		return list;	//리스트 반환
	}
	public static BookDto select(Long bookCode)  throws SQLException{
     //단건 조회
		pstmt = conn.prepareStatement("select * from tbl_book where bookCode=?");
		pstmt.setLong(1, bookCode);  //primary key 하나만 확인하면 됨.

		rs = pstmt.executeQuery();
		BookDto dto = null;
		if(rs!=null) {	//결과값 확인
			if(rs.next()) {		//조건문으로 첫번째 행이 있는지 확인
			dto = new BookDto();
			dto.setBookCode(rs.getLong("bookCode"));
			dto.setBookName(rs.getString("bookName"));
			dto.setPublisher(rs.getString("publisher"));
			dto.setIsbn(rs.getString("isbn"));
			}
		}
		return dto;
	}
	public static int insertBook(BookDto bookDto)  throws SQLException{

		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setLong(1, bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookName());
		pstmt.setString(3, bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());

		int result = pstmt.executeUpdate();	 //영향을 끼친 행의 개수를 반환한다.

		return result;		//결과값 정수로 리턴
	}
	public static int updateBook(BookDto bookDto)  throws SQLException{

		pstmt = conn.prepareStatement("update tbl_book set bookName =?, publisher=? where bookCode=?");
		//
		pstmt.setString(1, bookDto.getBookName());
		pstmt.setString(2, bookDto.getPublisher());
		pstmt.setLong(3, bookDto.getBookCode());	//마지막 primary key . BookCode 확인

		int result = pstmt.executeUpdate();
		return result;		//결과값 반환
	}
	public static int deleteBook(Long bookCode)  throws SQLException{

		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?");
		pstmt.setLong(1, bookCode);		//primary key 만 알면 되기 때문에 bookCode 만 받음

		int result = pstmt.executeUpdate();
		return result;
	}

	public static void main(String[] args) {
		try {
			//DBConn
			conn();		//함수로 db 커넥션 획득
			//Tx start
			conn.setAutoCommit(false);
			//Insert
			insertBook(new BookDto(1L,"도서명1","출판사명1","isbn-1"));
			insertBook(new BookDto(2L,"도서명2","출판사명2","isbn-2"));
			insertBook(new BookDto(3L,"도서명3","출판사명3","isbn-3"));
			//SelectAll
			List<BookDto> allBook =  selectAll();
			System.out.println("selectAll : ");
			allBook.forEach(el->System.out.println(el));
			//Select
			BookDto dto = select(1L);		//primary key 값으로 어떤 컬럼 조회할지 확인
			System.out.println("select : " + dto);
			//Update
			dto.setBookName("수정도서명-2");		// 위에서 dto 는 primary key가 1(L) 인 컬럼을 조회했으므로 dto 객체에 bookCode는 들어가있는 상태. 이 값을 기준으로 값 수정.
			dto.setPublisher("수정출판사명-2");
			int r1 = updateBook(dto);		//정수값 리턴 받은거
			if(r1>0)				// 수정한 컬럼이 있다면
				System.out.println("수정완료 : " + r1);	//수정 완료가 출력된다.
			//Delete
			int r2 = deleteBook(2L);	//primary key 가 2 인 컬럼 삭제
			if(r2>0)
				System.out.println("삭제완료 : " + r2);	//삭제 완료 확인
			//Tx End
			conn.commit();		//수동으로 커밋
			conn.close();		//
			rs.close();			//
			pstmt.close();		// 모든 객체 닫아준다.
		}catch(Exception e) {
			//Tx RollbackAll
			try {
				conn.rollback();		//예외 발생시 처음으로 롤백.
				System.out.println("롤백실행 !");		//롤백이 실행됐는지 확인하기 위해 롤백 실행문구를 출력한다.
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();			// 롤백이 안되는 예외가 발생했을 시에는 오류문을 출력해준다.
			}
		}

	}

}

