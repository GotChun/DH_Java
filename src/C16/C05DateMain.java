package C16;

import java.util.Calendar;
import java.util.Date;
public class C05DateMain {
	
	public static void main(String[] args) {
		
//		Date d1 = new Date();
//		System.out.println(d1);
//		System.out.println(d1.getYear()+1900);
//		System.out.println(d1.getMonth()+1);
//		System.out.println(d1.getDay()); //요일
//		System.out.println(d1.getHours()); 
//		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.AUGUST));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));  
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));	//요일(1-7 . 일-토)
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
//		System.out.println(d1.getSeconds()); 
	}
}
