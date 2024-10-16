package C06;

import java.util.Scanner;
//import java.util.Arrays;
import C00.C01System_out;

public class C01IF {

	public static void main(String[] args) {
//		String a = "ㅎㅇㅎㅇ";
//		String b = "ㅎㅇㅎㅇㅇ";
//
//		System.out.println(a.equals(b));
//		if (a.equals(b)) {
//			System.out.println("일치함");
//		} else {
//			System.out.println("불일치함");
//		}
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 :");
//
//		int age = sc.nextInt();
////		if (age>=8) {
////			System.out.println("맞음");
////		}else {
////			System.out.println("ㄴㄴㄴ");
////		}
////
//		if(age>=15) {
//			System.out.println("고딩");
//
//
//		}else if(age>10&&age<15){
//			System.out.println("중딩");
//		}else {
//			System.out.println("어린이");
//		}

//		int num = sc.nextInt();
//		if (num % 3 == 0 && num % 5 == 0) {
//			System.out.printf("%d는 3의 배수이면서 5의배수", num);
//		} else if (num % 3 == 0) {
//			System.out.printf("%d 는 3의 배수임 ㅇㅇ", num);
//		} else if (num % 5 == 0) {
//			System.out.printf("%d 는 5의 배수임;;", num);
//		} else {
//			System.out.println("둘다 ㄴㄴ");
//		}

//
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();

//		if(a>b) {
//			System.out.println(a);
//		}
//		if(b>a) {
//			System.out.println(b);
//		}
//		else {
//			System.out.println("두수가 같다");
//		}

//		-----------------------------------

//		int max = a;
//
//		if(a>b) {
//			max = a;
//		}if(max<b) {
//			max=b;
//		}if(max<c) {
//			max=c;
//		}
//		System.out.println(max);

//		String result = (a>b)? "a" : "b";


		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		int[] arr = {과목1,과목2,과목3,과목4};
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		System.out.println(평균);
//		System.out.println((과목1 + 과목2 + 과목3 + 과목4)/4);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}



//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		int max = n1;
//
//		if (n1 >= n2 && n1 > n3) {
//			System.out.println("큰 수 :" + n1);  //n1 이 젤큼
//		}else {
//			if (n2 >= n1 && n2 >= n3) {		//n2 가 젤큼
//				System.out.println("큰 수 :" + n2);
//			}	else {						//그게 아니면 n3 가 젤큼
//				System.out.println("큰 수 :" + n3 );
//			}
//		}

		int score = sc.nextInt();
		if(score<=100&&score>=90) {
			System.out.println("점수는 A");
		}else {
			if(score<90) {
				System.out.println("점수는 B");
			}else {
				if(score<80) {
					System.out.println("점수는 C");		//ㄴㄴ 이렇게 하면 안됨
				}
			}
		}

}}
