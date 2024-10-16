package C19;

import java.util.HashMap;
import java.util.Map;

public class C04Mapmain {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		//추가
		map.put("aaa", 1234);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);	//id중복 삭제
		map.put("ddd", 5555);	//id중복

//
//		//삭제
//		map.remove("aaa");		//aaa 요소 삭제
//		//개수
//		System.out.println("Size : " + map.size());		//1개 삭제 1개 중복돼서 삭제 = 3개
//
//		//조회(단건)
//		System.out.println(map.get("bbb"));		//key값이 bbb인 vaule 값 2222

		//조회(전체)
		for(String key : map.keySet())		//전체 조회 keySet 으로 key들만 가지고옴.
			System.out.println(key + " : " + map.get(key));		//key = key 값  map.get(key) = value값





	}
}
