package C36.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import C36.Domain.Dto.BookDto;
import C36.Domain.Dto.UserDto;
import C36.Domain.Service.BookService;
import C36.Domain.Service.BookServiceImpl;
import C36.Domain.Service.UserService;
import C36.Domain.Service.UserServiceImpl;

class ServiceTests {

	@Test
	void bookServiceImpl_1() throws ClassNotFoundException, SQLException {
		BookService service = BookServiceImpl.getInstance();
		boolean isSuccess = service.bookRegistration(new BookDto(1122L, "이것이 C언어?", "오렌지미디어", "121212"));

		System.out.println("도서등록여부 : " + isSuccess);
	}

	@Test
	void bookServiceImpl_2() throws Exception {
		BookService service = BookServiceImpl.getInstance();
		List<BookDto> list = service.getBooks();
		list.forEach(el -> System.out.println(el));

	}

	@Test // 로그인
	void userServiceImpl_login() throws Exception {
		UserService service = UserServiceImpl.getInstance();
		UserDto dto = new UserDto();
		dto.setUsername("member1");
		dto.setPassword("111");

		Map<String, Object> response = service.login(dto, null);
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}

	}

	@Test // 로그아웃
	void userServiceImpl_logout() throws Exception {
		UserService service = UserServiceImpl.getInstance();

		Map<String, Object> response = service.logout(1);
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}

	@Test
	void bookServiceImpl_session() throws Exception {
		BookService service = BookServiceImpl.getInstance();
		Map<String,Object> response =
		service.bookRegistration(new BookDto(1122L,"이것이C언어다","오디어","123123"), 3);
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
	}
}








}
