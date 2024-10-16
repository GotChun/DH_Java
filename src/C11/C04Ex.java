package C11;

import C00.C01System_out;

//다음 2개의 static 가진 ArrayUtils 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.


class ArrayUtils {
	   public static int[] concat(int[] a, int[] b) {
	            /* 배열 a와 b를 연결한 새로운 배열 리턴 */
		   int[] arrList = new int[a.length + b.length];	//배열 arrList 생성(길이는 a,b 배열 길이 합친만큼)
		   System.arraycopy(a, 0, arrList, 0, a.length);		//arrList 배열에 a배열 복사
		   System.arraycopy(b, 0, arrList, a.length, b.length);		//arrList 배열에 b배열 복사하는데 복사 시작점은 a길이 만큼부터 해야 a배열 다음에 합쳐짐!
		   return arrList;
	   }
	   	public static void print(int[] c) {
	   		for(int i=0;i<c.length;i++) {		//배열 c의 길이만큼 반복
	   			System.out.print(c[i]+" ");		// c를 출력하는데 공백을 추가
//
	   		}
	   		System.out.println();		//줄 바꿈

	   		}


	   }



public class C04Ex {
	public static void main(String[] args) {
		   // TODO Auto-generated method stub

	      int[] array1 = {1, 5, 7, 9};
	      int[] array2 = {3, 6, -1, 100, 77};
	      int[] array3 = ArrayUtils.concat(array1, array2);

	      ArrayUtils.print(array3);
	}
}