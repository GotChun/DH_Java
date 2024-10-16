package C03;

public class C05TypeChange {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 4;
		
		double dnum1 = (double)(num1*1.5) / num2 ;
		double dnum2 = (num1*1.0) / num2 ;
		double dnum3 = (1.0*num1) / num2 ;
		double dnum4 = (double)num1 /num2;
		double dnum5 = (double)(num1 /num2)/3;
		
		System.out.println("dnum1 :" + dnum1);
		System.out.println("dnum2 :" + dnum2);
		System.out.println("dnum3 :" + dnum3);
		System.out.println("dnum4 :" + dnum4);
		System.out.println("dnum5 :" + dnum5);
	}
}
