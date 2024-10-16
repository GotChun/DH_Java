package C05;

import java.util.*;
public class C06IncDesArith {

	public static void main(String[] args) throws Exception {
		int a=5, b=6, c=10, d;
		boolean e;
		d=++a*b--;	//a는 6 b는 6 상태서 연산  d=36
		 System.out.printf("a = %d, b = %d, d = %d\n", a, b, d); //근데 출력은 5로 나옴
		d=a++ + ++c - b--;	//d는 7 + 11 - 4 = 12
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
		a=1;
		b=0;
		e=(a++>0)||((b*d/c)>0);		// 
		System.out.printf("a = %d, b = %d, c = %d, d = %d ,e = %b\n", a, b, c, d , e);
		
		byte b = 5;						//1
		b = -b;							//2
		int result = 10 / b;			//3    
		System.out.println(result);

		
	}
}