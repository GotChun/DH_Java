package C04;
import java.util.Scanner;
public class c04_prac {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		String name1 = sc.next();
		System.out.println(name1);
		
		System.out.print("나이 입력하셈 :");
		int age = sc.nextInt();
		System.out.println(age);
		
		sc.nextLine();
		System.out.print("주소 입력하셈 :");
		String add = sc.nextLine();
		System.out.println(add);
		
		System.out.printf("%s의 나이는 %d세 주소는 %s 입니다. ",name1,age,add);
		
		
		
		
		
	}
}
