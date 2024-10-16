package C16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//외부평가 실기시험에 나온다고 함!!!
public class C06SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 :");
		String ymd = sc.next();

		//포매터 객체 생성(입력용)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd");  //y,M,d,h,m,s
		System.out.println(ymd);
		Date date = fmtin.parse(ymd);		//
		System.out.println(date);
		//출력
//		2020/01/10
//		2020/01/10
//		Fri Jan 10 00:00:00 GMT+09:00 2020  ,,시분초는 입력안해서 안나옴 00:00:00
		
		//포매터 객체 생성(출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy~MM~dd");
		System.out.println(fmtout.format(date));	//이 포맷은 나중에 한번 이상 무조건 나온다고함

	}
}
