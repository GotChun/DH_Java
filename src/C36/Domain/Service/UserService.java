package C36.Domain.Service;

import java.util.Map;

import C36.Domain.Dto.SessionDto;
import C36.Domain.Dto.UserDto;

public interface UserService {

	// CRUD
	// 회원가입 함수명(1)
	boolean memberJoin(UserDto userDto) throws Exception;

	// 로그인
	Map<String, Object> login(UserDto userDto, Integer sessionId) throws Exception;

	// 로그아웃 함수
	Map<String, Object> logout(int sessionId) throws Exception;

	SessionDto getSession(int sessionId) throws Exception;

}