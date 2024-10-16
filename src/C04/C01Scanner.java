package C04;

import java.util.Scanner;
//9월 12일 목요일 여기부터 시작.(로깅)
public class C01Scanner {
	public static void main(String[] args) {

		// 컨트롤 + 시프트 + o : 자동 importing
		// 컨트롤 + 시프트 + f : 자동 formating(자동 줄맞춤)

		
		//new Scanner(System.in)
		//표준입력장치(키보드)로부터 전달되는 데이터를 받을 수 있는 SCanner 객체를 생성
		// Scanner sc = new Scanner(System.int)
		// Scanner 객체를 main 함수내에서 제어(접근,사용)할수 있도록 sc변수에 위치정보를 저장
		Scanner sc = new Scanner(System.in);

		System.out.printf("n1 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("n1 :" + n1);
		int n2 = sc.nextInt();
		System.out.println("n2 :" + n2);
		int n3 = sc.nextInt();
		System.out.println("n3 :" + n3);
		int n4 = sc.nextInt();
		System.out.println("n4 :" + n4);
		
		System.out.printf("ㅎㅇㅎㅇ %d %d %d %d\n",n1,n2,n3,n4);

	}

}
