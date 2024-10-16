package C05;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		byte b = 5;						//1
//		b = (byte)-b;							//2
//		int result = 10 / b;			//3
//		System.out.println(result);

		int x = 10;
		int y = 20;
		int z = (++x) + (y--);			//11 + 19
		System.out.println(z);

		int var1 = 5;
		int var2 = 2;
		double var3 = (1.0*var1) / var2;		//5.0 / 2 = 2.5
		int var4=((int)var3 * var2);		//2.5 * 2 =5 여야 하는데 int로 형변환이 되어서 연산이 되기 때문에 4가 나옴
		System.out.println(var4);

		 int score = 85;
		 String result = (!(score>90)) ? "가" : "나";   //! 는 반전
		 System.out.println(result);
	}

}
