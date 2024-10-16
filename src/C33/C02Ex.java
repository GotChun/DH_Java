package C33;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

@FunctionalInterface
interface functional{
	int execute(int ...args);
}

class Calc{
	functional sum = (su)->{
//		int hab = 0;
//		for(int el : su)
//			hab += el;
//		return hab;

		//----------------스트림식으로
		return Arrays
			.stream(su)
			.boxed()
			.reduce(0,(sum,el)->sum+el);
		};

	}
	functional sub = (sb)->{
		return Arrays.stream(sb)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.reduce((a,b)->b-a)
				.orElse(0);		//orElse(0) 가 아니라 if 문으로 값이 비어있다면 그대로 b를 반환 아니라면

	};

	functional mul = (mu)->{
		return Arrays.stream(mu)
				.boxed()
				.reduce((a,b)->a*b)
				.orElse(0);
	};
	functional div = (dv)->{
		return Arrays.stream(dv)
				.boxed()
				.sorted((a,b)->b-a)
				.reduce((a,b)->a/b)
				.orElse(0);
	};
	Calc(){
			//각각에 람다 스트림으로 적절히 기능구현을 하라
			//가변인자 처리로 구현
			//뺄셈 , 나눗셈은 큰 수에서 작은수로 정렬 한다음 누적 감산 처리(reduce) 를 하라
		//왜 정답은 생성자 안에다가 사용하는지 ?
	}

}
public class C02Ex {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.sum.execute(1,2,3,4,5));
		System.out.println(calc.sub.execute(5,1,2,6,7));
		System.out.println(calc.mul.execute(5,1,2,6,7));
		System.out.println(calc.div.execute(200,2,2,2,2));

	}
}
