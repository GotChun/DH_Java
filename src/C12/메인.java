package C12;

public class 메인 {

	public static void main(String[] args) {

		길동 홍길동 = new 길동(20000,0);
		길동 서길동 = new 길동(40000,13);

		편의점 GS감삼편의점 = new 편의점(1000,2000,500000);
		편의점 GS동서편의점 = new 편의점(500,3000,700000);

		홍길동.getCola(GS감삼편의점,6000);
		서길동.getCola(GS동서편의점, 10000);
		홍길동.getCola(GS동서편의점, 3000);

		System.out.println(홍길동);
		System.out.println(서길동);

		System.out.println(GS감삼편의점);
		System.out.println(GS동서편의점);
	}
}
