package C33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Func1 {
	void sayYes(String message); // 함수형 인터페이스는 추상메서드 하나만 해주는게 원칙
}

@FunctionalInterface
interface Func2 {
	int sum(Integer... args);
}

@FunctionalInterface
interface Func3 {
	List<Integer> createArrayDesc(int ...args);		//가변인자
}

public class C01펑셔널인터메인 {

	public static void main(String[] args) {
		// 01
		Func1 func1 = (message) -> {
			System.out.println(message);
		};
		func1.sayYes("helloNewWorld");

		// 01-1
		Func1 func1_1 = System.out::println; // 메서드참조연산
		func1_1.sayYes("Helloworld2");

		// 02
		Func2 func2 = (ar) -> {
			int sum = 0;
			for (int el : ar)
				sum += el;
			return sum;
		};

		System.out.println(func2.sum(1, 2, 3, 4, 5, 5, 6, 1000));

		// 02-2
		Func2 func2_2 = (arg) -> {
			return Arrays.stream(arg).reduce(0, (a, b) -> a + b); // reduce 함수 ? a,b = sum , b
		};
		System.out.println(func2_2.sum(1, 2, 3, 4, 5, 6, 6));

		//03
		Func3 func3 = (arg)->{
			return	Arrays	.stream(arg)
					.boxed()	//int 형은 Integer 형으로 바뀜 =박싱
					.sorted((a,b)->b-a)		//내림차순
					.collect(Collectors.toList());
					};

		List<Integer> li = func3.createArrayDesc(6,9,124,756,23,5325,124);
		System.out.println(li);

//----------------------------------------------------------

	}
}
