package C31;

interface Calculator {
	int calculate(int num1 , int num2);		//계산 메서드
}


public class C03Lamda {

	public static void main(String[] args) {
		//덧셈
		Calculator add = (a,b)->{	//a , b 는 매개변수임
			return a + b;
		}; 	//이걸 풀어서 해보자면
//		public int add(a,b) {
//			return a + b;			//뭐 이런느낌으로다가
//		}

		//뺄셈
		Calculator sub = (a,b)->
			a - b;		//이런식으로 한줄이라면 괄호없이도 가능
		;
		//곱셈
		Calculator mul = (a,b)->{
			return a * b;
		};
		//나눗셈
		Calculator div = (a,b)->{
			return a / b;
		};
		int ad = add.calculate(5, 10);
		System.out.println(ad);
		System.out.println(add.calculate(10, 20));	//바로 출력에서 호출도 가능
		int sb = sub.calculate(1, 2);
		System.out.println(sb);
		int mu = mul.calculate(5, 5);
		System.out.println(mu);
		int dv = div.calculate(25, 3);
		System.out.println(dv);





	}
}
