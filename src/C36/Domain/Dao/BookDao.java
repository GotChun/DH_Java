package C36.Domain.Dao;

import java.util.List;

import C36.Domain.Dto.BookDto;

public interface BookDao {

	//CRUD
	List<BookDto> select() throws Exception;

	BookDto select(long bookCode) throws Exception;

	int insert(BookDto dto) throws Exception;

	int delete(long bookCode) throws Exception;

	int update(BookDto dto) throws Exception;

}