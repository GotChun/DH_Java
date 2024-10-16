package C19;

import java.util.*;
public class C03Ex {

	public static void main(String[] args) {
		/*
		 * 1부터 45 까지숫자를 6개를 랜덤으로 받아(Random 클래스를 이용) set 에 저장
		 * 추가. 저장된 set 의 오름차순정렬을 해보세요(검색을통해서)
		 */
//		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new TreeSet();
		Random rnd = new Random();
//		System.out.println(rnd.nextInt(45));
		for(int i=0;i<6;i++) {
			set.add(rnd.nextInt(45)+1);
		}  
//		Collections.sort(set);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.iterator());
		
		List<Integer> array = new ArrayList(set);
		Collections.sort(array,Collections.reverseOrder());
		System.out.println(array);
		//아 이런상황에 업 다운 캐스팅을 사용해야 하는건가
		
	}
}
