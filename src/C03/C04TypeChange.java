package C03;

public class C04TypeChange {
	public static void main(String[] args) {
		//정수 연산식(int 보다 작은 변수자료형(short, char , byte))
		
//		byte x = 10;
//		byte y = 20;
////		byte result1 = (byte)(x+y);		//byte  로 형변환을 안하면 오류가 나는데 이는 byte+byte끼리 연산을 할때는 cpu에서 기본자료형인 int로 인식한 다음 연산을 해서 그렇다고함
//		int result1 = int((byte)x+(byte)y);
////		int result1 = x+y;
//		System.out.println(result1);
		
		
//-----------------------------------------
		//정수 연산식(int 보다 큰 변수자료형(long))
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000l;
		long result = (long)(var1 + var2 + var3);
//		
//		long result2 = var1 + var2 + var3;
//		System.out.println(result2);
		System.out.println(result);
		
//		------------------------------------------
		
		//실수연산식
		//큰 타입으로 자동 형 변환
		
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
//		int result3 = intvar + flvar + dbvar;		int 하나하나 묶으면 처음부터 버림 상태에서 연산
		double result4 = intvar + flvar+ dbvar;		//이거만 댐 double = 8byte
//		float result5 = intvar + flvar+ dbvar;
		System.out.println(result4);
	}
}
