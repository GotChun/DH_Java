package C36.Domain.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import C36.Domain.Dao.BookDao;
import C36.Domain.Dao.BookDaoImpl;
import C36.Domain.Dao.ConnectionPool.ConnectionPool;
import C36.Domain.Dto.BookDto;
import C36.Domain.Dto.SessionDto;

public class BookServiceImpl implements BookService {

	//BookDao 연결
	private BookDao bookDaoImpl;

	//UserService 연결
	private UserServiceImpl userServiceImpl;

	//커넥션 풀
	private ConnectionPool connectionPool;


	//싱글톤 패턴 처리코드
	private BookServiceImpl() throws Exception {
		System.out.println("[Service] BookServiceImpl..");
		bookDaoImpl = BookDaoImpl.getInstance();
		//TX
		this.connectionPool = ConnectionPool.getInstance();

		this.userServiceImpl = userServiceImpl.getInstance();
	}

	private static BookService instance;
	public static BookService getInstance() throws Exception {
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}

	//도서등록
	@Override
	public Map<String, Object> bookRegistration(BookDto dto,int sessionId) throws Exception{

		Map<String,Object> returnValue = new HashMap();
		try {
			connectionPool.beginTransaction();	//tx start

			SessionDto sessionDto = userServiceImpl.getSession(sessionId);
			if(sessionDto==null) {
				returnValue.put("success", false);
				returnValue.put("message", "로그인이 필요한 서비스이다.");
				return returnValue;
			}else {
				String role = sessionDto.getRole();	//세션이 있다면 롤체크
				//Role_member 인지 확인
				if("Role_Member".equals(role)) {
					returnValue.put("success", false);
					returnValue.put("message", "권한이 부족합니다.");

				}
				else {//사서권한 확인(Role_Member)	//롤멤멤버가 아니라면  = 관리자라면

					BookDto dbBookDto = bookDaoImpl.select(dto.getBookCode());
					if(dbBookDto!=null) {
						returnValue.put("success", false);
						returnValue.put("message", "동일 도서가 존재함.");

					}else {

						int result = bookDaoImpl.insert(dto);
						if(result>0) {
							returnValue.put("success", true);
							returnValue.put("message", "도서등록완료");
						}
						else {
							returnValue.put("success", false);
							returnValue.put("message", "도서등록실패..관리자에게 문의");

						}
					}


				}


			}

			connectionPool.commitTransaction();
		}


		catch(Exception e) {

			connectionPool.rollbackTransaction();
			throw e;	//컨트롤러로 예외 던져줌
		}

		//추가사항(role에 따른 사용가능 여부체크 , 비즈니스 유효성체크,Tx처리)
		return returnValue;

	}
	//도서내용수정
	@Override
	public Map<String,Object> bookUpdate(BookDto dto,int sessionId) throws Exception{
		//추가사항(role에 따른 사용가능 여부체크 , 비즈니스 유효성체크,Tx처리)
		Map<String,Object> returnValue = new HashMap();
		try {
			connectionPool.beginTransaction();		//커넥션풀 연결  tx 시작

			SessionDto sessionDto = userServiceImpl.getSession(sessionId);	//세션 아이디를 받음.		//왜 세션 id만 받나 ?
			if(sessionDto==null) {			//세션 정보 요청
				returnValue.put("success", false);
				returnValue.put("message", "로그인부터 하셈");
				return returnValue;
			}
			else {
				String role = sessionDto.getRole();		//지금 세션 dto 에는 아이디만 받아온 상태 아닌가? 롤 은 어떻게 확인 하나 ?
				if("Role_Member".equals(role)) {
					returnValue.put("success", false);
					returnValue.put("message", "권한 부족함");
				}
				else {		//관리자라면 bookDto 에서 도서정보 조회 후에 업데이트를 실시한다.
					BookDto dbbookDto = bookDaoImpl.select(dto.getBookCode());
					if(dbbookDto==null) {		//책 정보가 없다면
						returnValue.put("success", false);
						returnValue.put("message", "도서가 존재하지않는다.");		//있어야 바꿀 수 있으니까
					}
					else {
						int result = bookDaoImpl.insert(dto);	//책 정보가 있다면
						returnValue.put("success", true);
						returnValue.put("message","정보 업데이트 완료");
					}


				}
			}
			connectionPool.commitTransaction();

		}catch(Exception e) {
			connectionPool.rollbackTransaction();
			throw e;
		}

		return returnValue;

	}
	//도서삭제
	@Override
	public boolean bookRemove(long bookCode) throws Exception{
		//추가사항(role에 따른 사용가능 여부체크 , 비즈니스 유효성체크,Tx처리)
		return bookDaoImpl.delete(bookCode) > 0;
	}
	//도서 조회(단건)
	@Override
	public BookDto getBook(long bookCode) throws Exception{
		return bookDaoImpl.select(bookCode);
	}
	//도서 조회(다건)
	@Override
	public List<BookDto> getBooks() throws Exception{
		return bookDaoImpl.select();
	}

}
