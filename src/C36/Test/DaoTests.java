package C36.Test;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import C36.Domain.Dao.BookDao;
import C36.Domain.Dao.BookDaoImpl;
import C36.Domain.Dao.SessionDaoImpl;
import C36.Domain.Dao.UserDaoImpl;
import C36.Domain.Dto.BookDto;
import C36.Domain.Dto.SessionDto;
import C36.Domain.Dto.UserDto;

class DaoTests {

	@Test
	void BookDaoConnect() throws Exception{
		BookDao dao = BookDaoImpl.getInstance();
	}

	@Test
	void BookDaoInsert() throws Exception{
		BookDao dao = BookDaoImpl.getInstance();
		dao.insert(new BookDto(1,"이것이리눅스임","한빛미디어","111-111"));	//첫번째 행을 넣는거임 !	sql 확인하면 드가있음
	}

	@Test
	void BookDaoUpdate() throws SQLException, Exception {
		BookDao dao = BookDaoImpl.getInstance();
		dao.update(new BookDto(1,"이것이자바다","웅진","11-231"));		//생성자가 int string ,string , string 순서라서 이렇게 순서를 맞춰야 하는듯 ?
	}

	@Test
	void BookDaoDelete() throws Exception {
		BookDao dao = BookDaoImpl.getInstance();
		dao.delete(1);
}

	@Test
	void BookDaoSelect() throws Exception, SQLException {
		BookDao dao = BookDaoImpl.getInstance();
		List<BookDto> list = dao.select();
		list.forEach(dto->System.out.println(dto));
	}

	@Test
	void BookDaoSelect2() throws Exception, SQLException {
		BookDao dao = BookDaoImpl.getInstance();
		BookDto dto = (BookDto) dao.select(30000002419974L);
		System.out.println(dto);
	}

	//------------------------------------------------------------------------------------UserDao 자리

	@Test
	void UserDaoInsert() throws Exception, SQLException {
		UserDaoImpl dao = UserDaoImpl.getInstance();
		int result  = dao.insert(new UserDto("ddd","111","Role_User",false));		//jejus ~~~
		System.out.println("계정 회원가입 성공여부 : "+result);
	}

	@Test
	void UserDaoUpdate() throws Exception {
		UserDaoImpl dao = UserDaoImpl.getInstance();
		int result = dao.update(new UserDto("aaa","1414","Role_User",false));
		System.out.println("계정 정보수정 성공여부 : " + result);
	}

	@Test
	void UserDaoDelete() throws Exception {
		UserDaoImpl dao = UserDaoImpl.getInstance();
//		int result = dao.delete(1);
		System.out.println("계정 삭제 완료");
	}


	@Test
	void BookDaoTest_Pool() throws Exception{
		BookDao dao = BookDaoImpl.getInstance();
		dao.insert(new BookDto(1212L,"a","a","a"));
	}


	@Test
	void UserDaoTest_Pool() throws Exception {
		UserDaoImpl dao = UserDaoImpl.getInstance();
		dao.insert(new UserDto("eee","123","Role_User",false));

	}

	@Test
	void SessionTest() throws Exception {
		SessionDto session = new SessionDto(1,"user1","Role_User");
		SessionDaoImpl dao = SessionDaoImpl.getInstance();
		dao.insert(session);
	}

	@Test
	void UserDaoTest_select() throws Exception {
		UserDaoImpl dao = UserDaoImpl.getInstance();
		UserDto dto = dao.select("eee");
		System.out.println(dto);

	}

}