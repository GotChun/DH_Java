package C07;

import java.util.Scanner;

import javax.swing.event.DocumentEvent;
import javax.swing.text.Document;

public class C03Continue_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Break

		//-1을 입력하기 전까지 계속 정수값을 받아 누적 합 계산
//		Scanner sc = new Scanner(System.in);
//		int n;
//		int sum=0;
//		while(true) {
//			n = sc.nextInt();
//		if(n==-1) {
//			break;
//		}
//		sum+=n;
//		}
//
//		System.out.println("sum: " + sum);


		//전체 구구단 출력(7 7 49 까지만 출력)
//		boolean isExit = false;
//		int dan=2;
//		while(dan<=9) {
//			int i = 1;
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//			if(dan==7 && i==7) {
//				isExit = true;
//				break;
//			}
//			i++;
//		}
//		if(isExit)
//			break;
//		System.out.println();
//		dan++;
//		}
		//--------------------------------------

		//Exit 이용 모든 반복문 벗어나기
//		int dan=2;
//		Exit:
//		while(dan<=9) {
//			int i = 1;
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//			if(dan==7 && i==7) {
//				break Exit;
////				System.exit(0);		강제종료
//			}
//			i++;
//		}
//		System.out.println();
//		dan++;
//		}

		//Continue
		//1부터 10까지의 수중의 3의 배수를 제외한 합 출력

		int i = 1;
		int sum = 0;
		while(i<=10) {

			if(i%3==0) {
				i++;
				continue;
			}
			System.out.println("i : " + i);
			sum+=i;
			i++;
		}
		System.out.println("sum:"+sum);

	}

}