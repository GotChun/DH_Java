package C36.Controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import C36.Domain.Dto.BookDto;
import C36.Domain.Service.BookService;
import C36.Domain.Service.BookServiceImpl;

public class BookController implements SubController {

	// 예외처리함수
	public Map<String, Object> ExceptionHandler(Exception e) {		//예외가 발생했을 때 사용자에게 알려주는 함수
		Map<String, Object> exMap = new HashMap();				//일일히 예외처리를 해주는 대신 이 함수로 예외처리를 대신 해준다 !
		exMap.put("success", false);	//이 hashmap 객체는 왜 생성하는지 ?
		exMap.put("exception", e);
		exMap.put("message", e.getMessage());
		return exMap;
	}

	private BookService bookServiceImpl;

	public BookController() {
		try {
			bookServiceImpl = BookServiceImpl.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ExceptionHandler(e);
		}
	}

	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookControllser execute()...");
		// 컨트롤러의 역할

		// 파라미터 받기
		Integer serviceNo = (Integer) params.get("serviceNo"); // get() : 특정 키값에 대응하는 값을 반환하는 메서드
		BookDto bookDto = (BookDto) params.get("bookDto");
		Integer sessionId = (Integer)params.get("sessionId");

		// 뷰전달 변수
		Map<String, Object> returnValue = new HashMap();

		try {

		switch (serviceNo) {
			case 1: // add
			System.out.println("[SC] BookController add()...");

				if(!isValid(bookDto,sessionId)) { // 유효성 확인
				// 유효성 체크 실패시 처리

					returnValue.put("success", false);
					returnValue.put("message", "도서 등록 실패.");
					return returnValue;
			}

			//  서비스 요청
			System.out.println("SC BookController dto :" + bookDto);
			//뷰로 전달
			Map<String,Object> tmp = bookServiceImpl.bookRegistration(bookDto, sessionId);


			boolean isAdded = (Boolean)tmp.get("success");		//이게 뭐임 ? ㄹㅇ;;
			returnValue = tmp;

			break;


		case 2: // update
			System.out.println("[SC] BookControllser update()...");		//이거 해야댐. 1015

			if(!isValid(bookDto,sessionId)) {
				returnValue.put("success", false);
				returnValue.put("message", "도서 수정 실패");
				return returnValue;
			}

				System.out.println("SC BookController dto :" + bookDto);
				//뷰로 전달
				Map<String,Object> tmp =bookServiceImpl.bookUpdate(bookDto, sessionId);

			break;
		case 3: // delete
			System.out.println("[SC] BookControllser delete()...");
			break;
		case 4: // select
			System.out.println("[SC] BookControllser select()...");
			break;
		case 5: // selectAll
			System.out.println("[SC] BookControllser selectAll()...");
			break;
		default:
			break;
		}
		}catch(Exception e) {
			return ExceptionHandler(e);
		}

		return returnValue;
	}

	private boolean isValid(BookDto bookDto, Integer sessionId) {
		return true;
	}

	private boolean isValid(BookDto dto) {
		if (dto.getBookCode() == 0)
			return false;
		else if (dto.getBookName().trim() == null || dto.getBookName().trim().equals(""))
			return false;

		return true;
	}

}
