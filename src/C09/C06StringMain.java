package C09;

import java.util.Scanner;

public class C06StringMain {
	
	public static void main(String[] args) {
		
		String str1 = "Java powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);	
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		//위치확인
		System.out.printf("%x\n",System.identityHashCode(str1));
		System.out.printf("%x\n",System.identityHashCode(str2));
		System.out.printf("%x\n",System.identityHashCode(str3));
		System.out.printf("%x\n",System.identityHashCode(str4));
		
		//StringBuilder , SpringByffer()
		StringBuffer str5 = new StringBuffer();
		System.out.println();
		System.out.printf("%x\n",System.identityHashCode(str5));
		str5.append(str1).append(str2).append(str3).append(str4);
		System.out.printf("%x\n",System.identityHashCode(str5));
		System.out.println("------------------------------------");
		
//		System.out.println("문자열길이 :" + (str1.length() ));
//		System.out.println("문자찾이 :" + (str1.charAt(1)));
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(0);
//		System.out.println("ch :");
//		
//		System.out.println("문자찾기 :" + str1.indexOf("a"));
//		System.out.println("문자찾 :" + str1.lastIndexOf("a"));
//		
//		Scanner sc  = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		
//		System.out.println(tmp.length());
//		System.out.println(tmp.trim().length());                                                                                                
//		
//		System.out.println();     
//		System.out.println();
//		
		
		System.out.println("문자열자르기:" + (str1.substring(2,6)));
		
		
		String str6 = "홍길동 ,남길동 ,서길동,동길동,길동길동";
		String[] result = str6.split(",");	//잘라냄
		for(String val : result) {			//
			System.out.println(val);
		}
		
		
		//자바에서 배열은 다 참조변수 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
