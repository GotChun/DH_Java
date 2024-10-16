package C17;

public class C01NullPointerExceptionMain {
	
	public static void main(String[] args) {
		/* 오류:
		 * 런타임에러 : 실행오류(치명적 오류)
		 * 컴파일 에러 : 컴파일 시에 발생하는 에러 
		 * 
		 * 예외처리 : 프로그램 실행시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것(
		 */
		try {
		String str=null;
		System.out.println(str.toString());  //str이 null임//예외객체가 만들어졌다. 
		
		}catch(NullPointerException e) {
			System.out.println("예외객체 확인 :" + e); //e 라는 별칭을 붙임 NullPointerException 오류문 자체가 나온다.
		}
		System.out.println("hello world");
	}
}
