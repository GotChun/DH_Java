package C36.Domain.Service;

import java.util.List;
import java.util.Map;

import C36.Domain.Dto.BookDto;

public interface BookService {

	//도서등록
	Map<String, Object> bookRegistration(BookDto dto, int sessionId) throws Exception;

	//도서내용수정
	Map<String, Object> bookUpdate(BookDto dto, int sessionId) throws Exception;

	//도서삭제
	boolean bookRemove(long bookCode) throws Exception;

	//도서 조회(단건)
	BookDto getBook(long bookCode) throws Exception;

	//도서 조회(다건)
	List<BookDto> getBooks() throws Exception;

}