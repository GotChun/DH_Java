package C06;

import java.util.*;
public class C03Switch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while(true) {
			System.out.println("-------MENU--------");
			System.out.println("1 도서 조회");
			System.out.println("2 도서 등록");
			System.out.println("3 도서 수정");
			System.out.println("4 도서 삭제");
			System.out.println("5 도서 판매");
			System.out.println("6 종료");
			System.out.print("번호 입력 :");
			num = sc.nextInt();
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("종료");
				System.exit(-1);	//exit 함수,, 동작하고 있는 프로그램 종료 ,,-1은 비정상적 종료 ,,절차 안밟고 그냥 종료
			default :
				System.out.println("올바른 값 입력하셈");
			}
			
//			if(num==6) {
//				break;
//			}
		}
	}
}
