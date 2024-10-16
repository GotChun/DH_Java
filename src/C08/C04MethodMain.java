package C08;

import java.util.Scanner;

class MethodTest{
	Scanner sc = new Scanner(System.in);
	
	//기능
	public int sum1(int n1,int n2) {return n1+n2;}		//그냥 메소드구만  	//인자 o 반환값 o
	public int sum2() {return sc.nextInt() + sc.nextInt();}		//반환 자료형이 있음
	public void sum3(int n1,int n2) {System.out.println(n1+n2);}
	public void sum4() {System.out.println(sc.nextInt() + sc.nextInt() );}	//반환 자료형이 따로 없어서 void 로 선언
}

public class C04MethodMain {

		public static void main(String[] args) {
			MethodTest sumCalc = new MethodTest();
			System.out.println(sumCalc.sum1(10,20));
			System.out.println(sumCalc.sum2());
			sumCalc.sum3(10, 20);
			sumCalc.sum4();
		}
}
