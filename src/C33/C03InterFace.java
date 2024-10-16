package C33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C03InterFace {

	//01
	public static Function<Integer, Integer> func1 = x -> x * x;
	public static Function<Integer, Integer> func1_2 = x -> x + x;
	public static Function<List<Integer>, Integer> func1_3 = x -> x.stream().reduce(0, (sum, b) -> sum + b);
	public static Function<List<Object>, List<Integer>> func1_4=x->{
		return	x.stream()
		 	.filter(el-> el instanceof Integer)	//요소들이 Integer 의 요소인지 확인
		 	.map(el->(Integer)el)  //Object 인 요소들을 Integer 으로 변환해서 재구성
		 	.collect(Collectors.toList());	//리스트화
					// 자료형이 Integer 인 요소들만 추출해서 다시 리스트화 하는 작업
		};

		//02		//함수를 합치는 작업
		public static Function<Integer,Integer> func2 = func1.andThen(func1_2);
		public static Function<Integer,Integer> func2_2 = func1_2.andThen(func1);
		
		//03 
		public static BinaryOperator<Integer> func3=(x,y)->x+y;	//2개의 값을 받고 하나의 결과를 리턴
		
		//04
		public static Function<Integer,Function<Integer,Integer>>func4 = x->y->x+y;
		

	public static void main(String[] args) {

		//01
		System.out.println(func1.apply(10));	//func1 의 인자를 입력받고 작업을 수행
		System.out.println(func1_2.apply(5));
		System.out.println(func1_3.apply(Arrays.asList(1, 2, 3, 4, 5, 6, 6))); // apply ?

		
		List<Object> li1 = new ArrayList();
		li1.add("야길동");
		li1.add("1길동");
		li1.add("2길동");
		li1.add("3길동");
		li1.add("4길동");
		li1.add(11);
		li1.add(31);
		li1.add(61);

		//02
		List<Integer> li2 = func1_4.apply(li1);
		System.out.println(li2);
		System.out.println(func2.apply(5));		//왜 50 ? 약간 헷갈림
		System.out.println(func2_2.apply(5));	//이건 왜 100 ?

		
		//03
		System.out.println(func3.apply(10,20));
		
		System.out.println(func4.apply(5).apply(10) );  //5 -> 10 -> 5 + 10;
		
		
		
		
		
		
	}
}
