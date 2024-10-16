package C36.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import C36.Controller.FrontController;
import C36.Domain.Dto.BookDto;
import C36.Domain.Dto.UserDto;

class ControllerTests {

	@Test
	void FcControllerTests() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
//		params.put("service", "add");

		// 요청사항 전달
		fc.execute(params);

	}

	@Test
	void FcControllerTests_2() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);

		// 요청사항 전달
		fc.execute(params);

	}

	@Test
	void FcControllerTests_3() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("bookDto", new BookDto(11223344L, "", "한빛미디어", "1234"));

		// 요청사항 전달
		Map<String, Object> rValue = fc.execute(params);
		boolean isSuccess = (Boolean) rValue.get("success");
		String message = (String) rValue.get("message");
		System.out.println("성공여부 :" + isSuccess);
		System.out.println("message: " + message);

	}

	@Test
	void FcControllerTests_4() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("bookDto", new BookDto(99999L, "스타벅스", "한빛미디어", "1234"));

		// 요청사항 전달
		Map<String, Object> rValue = fc.execute(params);
		//확인
		boolean isSuccess = (Boolean) rValue.get("success");
		String message = (String) rValue.get("message");
		Exception ex = (Exception) rValue.get("exception");


		System.out.println("성공여부 :" + isSuccess);
		System.out.println("message: " + message);
		System.out.println("exception : "+ex);
	}

	@Test
	void UserControllerTest_1() {
		FrontController fc = new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint", "/user");
		params.put("serviceNo", 1);
		params.put("userDto", new UserDto("bbb","1234","Role_User",false));

		Map<String,Object> result =  fc.execute(params);
		System.out.println("isSuccess : " + result.get("success"));
		System.out.println("message: " + result.get("message"));
		System.out.println("exception: " + result.get("exception"));

	}

	@Test
	void UserControllerTest_2() {							//업데이트
		FrontController fc = new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint", "/user");
		params.put("serviceNo", 2);
		params.put("userDto",new UserDto("ddd","1313","Role_User",false));	//여기서 false 는 로그인이 안돼있었던 id aaa를 삭제하겠다.

		Map<String,Object> result = fc.execute(params);
		System.out.println("isSuccess :" + result.get("success"));
		System.out.println("message :" + result.get("message"));
		System.out.println("exception : " + result.get("exception"));
	}


	@Test
	void UserControllerTest_3() {							// 회원삭제
		FrontController fc = new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint", "/user");
		params.put("serviceNo", 3);
		params.put("userDto",new UserDto("ddd","1313","Role_User",false));	//여기서 false 는 로그인이 안돼있었던 id aaa를 삭제하겠다.

		Map<String,Object> result = fc.execute(params);
		System.out.println("isSuccess :" + result.get("success"));
		System.out.println("message :" + result.get("message"));
		System.out.println("exception : " + result.get("exception"));
	}

	@Test
	void UserControllerTests_login() {
		// 요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		// 전달할 파라미터 준비
		Map<String, Object> params = new LinkedHashMap();
		params.put("endPoint", "/user");
		params.put("serviceNo", 6);
		params.put("userDto", new UserDto("eee","123","-",false));

		Map<String,Object> result = fc.execute(params);
		for(String key : result.keySet()) {
			System.out.println(key + " : " + result.get(key));
		}

	}

	@Test
	void BookControllerTest_add() {							//업데이트
		FrontController fc = new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint", "/book");	//서비스 유형
		params.put("serviceNo", 1);			//회원가입 요청번호
		params.put("bookDto",new BookDto(1122,"이것이언어다","오렌지미디어","123123"));	//여기서 false 는 로그인이 안돼있었던 id aaa를 삭제하겠다.
		params.put("sessionId",11);	//여기서 false 는 로그인이 안돼있었던 id aaa를 삭제하겠다.

		Map<String,Object> result = fc.execute(params);
		for(String key : result.keySet()) {
			System.out.println(key + " : " + result.get(key));
		}

	}

	@Test
	void BookControllerTest_Update() {
		FrontController fc= new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint","/book" );
		params.put("serviceNo", 2);
		params.put("bookDto", new BookDto(1122,"이것이언어다","오렌지미디어","123123"));
		params.put("sessionId",1);

		Map<String,Object> result = fc.execute(params);
		for(String key : result.keySet()) {
			System.out.println(key + " :" + result.get(key));
		}
	}


}
