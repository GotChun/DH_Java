package C05;

import java.io.IOException;

public class C05LogicArith {

	public static void main(String[] args) {
		{
			int a=0,b=0;
			boolean c;
			a = 1;
			b = 1;
			c =(++a>0)||(++b>0) ;
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

			a = 1;
			b = 1;
			c = (++a>0)||(--b>0) ;
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

			a = 1;
			b = 1;
			c = (--a>0)||(++b>0) ;		//a에서 먼저 0이 되어서 어차피 b는 연산을 안함
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

			a = 1;
			b = 1;
			c = (--a>0)||(b-->0) ;
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);


		}


	}

}