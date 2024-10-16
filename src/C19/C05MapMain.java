package C19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C05MapMain {

	// 01 함수의 파라미터 형으로 사용되는 경우
	public static void func1( Map<String,Object> params) {

	}

	//02 함수의 리턴형으로 사용되는 경우
	public static Map<String,Object> func2(){

		return null;
	}
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap();		//object 라서 어떤 객체든 다 받을 수 있다.

		String [] value={"정처기","빅분기","네트워크 관리사","암거나"};
		map.put("자격증",value);

		List<String> hobby = new ArrayList();
		hobby.add("등산");
		hobby.add("독서");
		hobby.add("게임");
		map.put("취미", hobby);




	}
}
