package C36.Controller;

import java.util.HashMap;
import java.util.Map;

import C36.Domain.Dto.UserDto;
import C36.Domain.Service.UserService;
import C36.Domain.Service.UserServiceImpl;

public class UserController implements SubController {

	private UserService userServiceImpl;
	public UserController()  {
		try {
			userServiceImpl = UserServiceImpl.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ExceptionHandler(e);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// 예외처리함수
		public Map<String, Object> ExceptionHandler(Exception e) {		//예외가 발생했을 때 사용자에게 알려주는 함수
			Map<String, Object> exMap = new HashMap();				//일일히 예외처리를 해주는 대신 이 함수로 예외처리를 대신 해준다 !
			exMap.put("success", false);	//이 hashmap 객체는 왜 생성하는지 ?
			exMap.put("exception", e);
			exMap.put("message", e.getMessage());
			return exMap;
		}



	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] UserController execute()...");

		// 파라미터 받기	//6번 로그인 7번 로그아웃.
		Integer serviceNo = (Integer) params.get("serviceNo"); // get() : 특정 키값에 대응하는 값을 반환하는 메서드
		UserDto userDto = (UserDto)params.get("userDto");

		// 뷰전달 변수
		Map<String, Object> returnValue = new HashMap();

		try {

			switch (serviceNo) {
				case 1: // insert 회원가입.
				System.out.println("[SC] UserController add()...");
					if(!isValid(userDto)) { // 유효성 확인
					// 유효성 체크 실패시 처리

						returnValue.put("success", false);
						returnValue.put("message", "회원 가입 실패.");
						return returnValue;
				}

				//  서비스 요청
				System.out.println("SC UserController dto :" + userDto);
				boolean isAdded = userServiceImpl.memberJoin(userDto);


				//뷰로 전달
				if(isAdded) {
				returnValue.put("success", true);
				returnValue.put("message", "회원 등록 완료.");
				}else {
					returnValue.put("success", false);
					returnValue.put("message", "회원 등록 실패.");
				}
				break;


			case 2: // update
				System.out.println("[SC] UserControllser update()...");
				if(!isValid(userDto)) {

					returnValue.put("success", false);
					returnValue.put("message", "회원정보 수정 실패..");
					return returnValue;
				}

				System.out.println("SC UserController dto : " + userDto);
				boolean isUpdate= userServiceImpl.infoUpdate(userDto);

				//뷰로 전달
				if(isUpdate) {
					returnValue.put("success", true);
					returnValue.put("message", "정보수정완료");
				}
				else {
					returnValue.put("success", false);
					returnValue.put("message", "정보수정실패");
				}

				break;


			case 3: // delete
				System.out.println("[SC] UserControllser delete()...");
				if(!isValid(userDto)) {

					returnValue.put("success", false);
					returnValue.put("message","회원 탈퇴 안됨");
					return returnValue;
				}

				System.out.println("SC UserController dto : "+ userDto);
				boolean isDelete = userServiceImpl.memberDelete(userDto);

				if(isDelete) {
					returnValue.put("success", true);
					returnValue.put("message", "회원탈퇴완료");
				}
				else {
					returnValue.put("success", false);
					returnValue.put("message", "회원탈퇴실패");
				}

				break;
			case 4: // select
				System.out.println("[SC] UserControllser select()...");
				break;
			case 5: // selectAll
				System.out.println("[SC] UserControllser selectAll()...");
				break;
			case 6: // Login
				System.out.println("[SC] UserControllser Login()...");
				int sessionId = (Integer)params.get("sessionId");
				//유효성 체크
				if(!isValid(userDto,sessionId)) {
					// 유효성 체크 실패시 처리

					returnValue.put("success", false);
					returnValue.put("message", "로그인 실패.");
					return returnValue;
				}
				//서비스 실행
				Map<String,Object> value=userServiceImpl.login(userDto,sessionId);

				//뷰로이동 /or 내용전달(세션ID전달예정)
				returnValue = value;
				break;



			case 7: // Logout
				System.out.println("[SC] UserControllser Logout()...");
				int sessionId = (Integer)params.get("sessionId");
				//유효성 체크
				if(!isValid(userDto,sessionId)) {

					returnValue.put("success", false);
					returnValue.put("message", "로그아웃 실패");
					return returnValue;
				}
				//서비스 실행
//				Map<String,Object> value = userServiceImpl.	;//여기는 뭐 어디서부터 잘못된걸까..?
				break;
			default:
				break;
			}
			}catch(Exception e) {
				return ExceptionHandler(e);
			}





		return returnValue;
	}
	private boolean isValid(UserDto userDto, int sessionId) {
		return true;
	}


	//유효성체크 함수
	private boolean isValid(UserDto dto) {

			return true;

	}

}
