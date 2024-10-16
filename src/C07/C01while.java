package C07;

import java.math.*;
import java.util.*;

public class C01while {
	public static void main(String[] args) {

		// 01 while 기본
		// while(조건식) {
		// 조건식이 참인 경우 실행되는 종속 문장(1개의 행일때는 생략가능)
		// }

//		String[] arr = {
//
//				"어디에 있나요", "제 얘기 정말 들리시나요", "그럼 피흘리는", "가엾은 제사랑을", "알고 계신가요", "용서해주세요", "벌하신다면 저 받을게요", "허나 그녀만은",
//				"제게 그녀 하나만", "허락해 주소서" };
//
//
//		for(int a=0;a<arr.length;a++) {
//			System.out.println(arr[a]);
//		}
//		System.out.println(arr[1]);
//		System.out.println("어디에 있나요");
//		System.out.println("제 얘기 정말 들리시나요");
//		System.out.println("그럼 피흘리는");
//		System.out.println("가엾은 제사랑을");
//		System.out.println("알고 계신가요");
//		System.out.println("용서해주세요");
//		System.out.println("벌하신다면 저 받을게요");
//		System.out.println("허나 그녀만은");
//		System.out.println("제게 그녀 하나만");
//		System.out.println("허락해 주소서");

//		int i=0; //탈출용 변수
//		while(i<5) {	//탈출 위한 조건식
//			System.out.println("Hello world");
//			i++;		//탈출을 위한 연산식
//		}

		// 02 1-10 까지 합
//		int i=1;
//		int sum=0;
//		while(i<=10) {	//10까지는 올라가니까	//11에서 종료
//			System.out.println("i :" +i);
//			System.out.println("sum :" +sum);
//			sum+=i;
//			i++;
//		}
//		System.out.println(i);		//i는 11이 됨
//		System.out.println(sum);

		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 N 입력 :");
//		System.out.println("정수 M 입력 :");
//		int N = sc.nextInt();
//		int M = sc.nextInt();
		// -----------------------------------
//		int i=0;
//		int sum=0;
//		while(i<=N) {
//			sum+=i;
//			i++;
//			System.out.println("i :" + i);
//		}
//		System.out.println("sum :" + sum);
//
		// -------------------------------------------
//		int A = M;
//		int sum = 0;
//		if (N > M) {
//			M = N; // 3 1 이라면 3 = 3 이 됨
//			N = A; // N 이 1이 됨
//		}else {
//			while (N <= M) {		 						하기는 잘했는데 같은 수를 입력했을 때의 경우를 생각안했음.
//				sum += N;									만약에 이런경우를 추가하려면 while 무한루프를 돌려서 다시 입력받게 해야함.
//				N++;
////				System.out.println(N);
//			}
//		}
//		System.out.println(sum);
		// ---------------------------

//		int i=0;
//		int num = 0;
//		int hol=0;
//		int jjak=0;
//		while(N<=M) {
//			if(N%2==0) {		//1  , 5  2 4		135
//				jjak+=N;
//				N++;
//			}if(N%2==1) {
//				hol+=N;
//				N++;
//			}
//				}
//
//		System.out.println(jjak);
//		System.out.println(hol);
//		num = jjak+hol;
//		System.out.println(num);

//		int i=0;
//		int hab=0;
//		while(i<N) {
//			if(i%3==0) {
//				hab+=i;
//				i++;
//			}
//				i++;
//		}
//		System.out.println(hab); //3 6 9
//
//		int i = 0;
//		int sum = 0;
//		while(i<N) {
//			if(i%4==0) {
//				System.out.println(i);
//				i++;
//			}else {
//				sum+=i;
//				i++;
//			}
//		}
//		System.out.println(sum);  	// 1 2 3 5 6 7 9 10 11 , 3 6 11 17 24 33 43 54

//		int i = 2;
//		int dan=1;
//		while(dan<10) {
//			System.out.printf("2 x %d = %d\n",dan,2*dan);
//			dan++;
//		}
//

//		int dan = 1;
//		while(dan<10) {
//			System.out.printf("%d x %d = %d\n",N,dan,N * dan);
//			dan++;
//		}

		// 2단 - 9단 출력
//		int dan =2 ;
//		while(dan<=9) {
//			int i =1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;	//안쪽 구구단
//
//			}
//
//			dan++;	//바깥쪽 구구단
//		}

		// 2단- 9단 출력인데 거꾸로 출력

//		int dan =2 ;
//		while(dan<=9) {
//			int i =9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;	//안쪽 구구단
//
//			}
//
//			dan++;	//바깥쪽 구구단
//		}
//
//
//		int dan =9 ;
//		while(dan>=2) {
//			int i =9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;	//안쪽 구구단
//
//			}
//
//			dan--;	//바깥쪽 구구단
//		}
//
//

//		int dan = 2;
//		while (dan <= N) {
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//
//				i++;
//			}
//			dan++;
//		}

//		while(N<=M) {
//			int i =1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",N,i,N*i);
//				i++;
//			}N++;
//		}

//		int i = 5;


//		i = 0;
//		i ++ ;
//		i<4;
//
//		for(int i=1;i<=4;i++) {
//
//			for(int j=1;j<=5;j++) {
//			System.out.print("*");
//			}
//			System.out.print("\n");
//
//		}

//int i =0;
//	while(i<5) {
//		int j =0;
//		while(j<=i) {
//			System.out.print("*");
//			j++;
//		}
//		System.out.print("\n");
//		i++;
//	}
//int n = sc.nextInt();	//줄의 개수
//int m = sc.nextInt();	//별의 개수
//	int i = 0;
//	while(i<4) {
//		int j=0;
//		while(j<4-i) {
//			System.out.print("*");
//			j++;
//		}
//		System.out.print("\n");
//		i++;
//	}
// i = 1 , j = 5

//	  *			h1 = s1	공백3
//   ***		h2 = s3 공백2
//  *****		h3 = s5 공백1
// *******		h4 = s7 공백0
//  *****		h5 = s5 공백1
//   ***		h6 = s3 공백2
//    *  		h7 = s1 공백3

		// 일단 삼각형부터!

		// h1 s=1 b=3
		// h2 s=3 b=2
		// h3 s=5 b=1
		// h4 s=7 b=0

//		int i = 1;

//	while(h<6) {
//		int b = 0;
//		while(b<5-h) {//012
//			System.out.print(" ");
//			b++;
//		}
//		int s = 0;
//		while(s<2*h-1) {		//홀수로 찍으려면 처음부터 h를 1로 가정해야함
//			System.out.print("*");
//			s++;
//		}
//		System.out.println();
//		h++;
//	}
		// 높이가 4
		// h1 s=7 b=0 n=4
		// h2 s=5 b=1 n=4
		// h3 s=3 b=2 n=4
		// h4 s=1 b=3 n=4
//		int n = sc.nextInt();
////	int m =sc.nextInt();
//		while (i <= n) {
//			int b = 0;
//			while (b < i - 1) {
//				System.out.print(" ");
//				b++;
//			}0
//			int s = 0;
//			while (s < (n - i) * 2 + 1) {
//				System.out.print("*");
//				s++;
//			}
//			System.out.println();
//			i++;
//		}
//i 가 1

//
//		for(int i=0;i<=4;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print(" ");
//			}
//			for(int n=0;n<(i*2)-1;n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}

		int i=0;
		while(i<7) {
			if(i<4) {
				int j=0;
				while(j<3-i) {
					System.out.print(" ");
					j++;
				}
				int k=0;
				while(k<=2*i) {
					System.out.print("*");
					k++;
				}


			i++;}
			else {
				int j =0;
				while(j<i-3) {
					System.out.print(" ");
					j++;
				}
				int k = 0;
				while(k<=(6*2)-2*i) {	//i가 4라면 (12)-2*4 = 4 ==5번 반복
					System.out.print("*");
					k++;
				}
			i++;
			}
			System.out.println();

	}



	}
}
