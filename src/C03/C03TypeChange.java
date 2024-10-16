package C03;

public class C03TypeChange {

	public static void main(String[] args) {
		
		int n1 =255;
		int n2 = 130;
		byte n3 = (byte)n1;		//기존 int 32bit 에서 byte로 강제형변환을 해서 10000001만 남기때문에 앞이 1로 시작해서 음수로 바뀌어버림
		byte n4 = (byte)n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
//		System.out.println(129-256);
//		System.out.println(130-256);

	}

}
