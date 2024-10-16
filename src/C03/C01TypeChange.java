package C03;
class Check {
    public static Class<Integer> typeof(final int expr) {
        return Integer.TYPE;
    }

    public static Class<Long> typeof(final long expr) {
        return Long.TYPE;
    }

    public static Class<Float> typeof(final float expr) {
        return Float.TYPE;
    }

    public static Class<Double> typeof(final double expr) {
        return Double.TYPE;
    }

}

public class C01TypeChange {
	public static void main(String[] args) {
		//(자료형)형변환
		//연산작업시(=,+,-) 일치하지 않는 자료형을 일치시키는 작업
		
		//자동형변환(암시적형변환) :	컴파일러에 의해 자동으로 변환
		//강제형변환(명시적형변환) :	프로그래머에 의해 강제로 변환
		
		//자동형변환인경우 데이터 손실을 최소화 하는 방향으로 자료형이 일치
		//byte < short,char < int < long < float < double
							//소수점에서 long으로 가면 소수점 없어지니까 float이 더 뒤에있음
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);
//		System.out.println("intValue:" + intValue.getClass());
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가 의 유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue = longValue;	//long 더 크긴한데 float이 실수라서 되긴 함
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doybleValue:" + doubleValue);
		
		System.out.println(Check.typeof(doubleValue));
		System.out.println(Check.typeof(longValue));
		
//		---------------------------------------------
		
		
		
		
		
	}
}
