package C10;

import java.util.Arrays;

public class C02얕은깊은복사 {

	public static void main(String[] args) {

		//얕은복사(주소복사)
		int arr1[] = {10,20,30};
		int arr2[];
		arr2 = arr1;
		arr1[0]=100;

		for(int val : arr2) {
			System.out.println(val + " ");
			//원래 arr1[0]은 10이었으나 100으로 지정해서 100 출력.
			//근데 arr2[0] 도 100 출력?	= arr1의 주소값을 바꾸기 때문에 얕은복사를 한 arr2 의 첫번째 인덱스도 100으로 바뀌게 됨. (arr2는 arr1 의 메모리 주소값을 참고중임)
		}
		System.out.println();
		for(int i : arr1) {
			System.out.println(i + " ");
		}
//		System.out.println(arr2);
		
		//깊은 복사(값 복사)
		int arr3[] = new int[3];
		for(int i=0;i<arr3.length;i++) {
			arr3[i] = arr1[i];
		}
		System.out.println("arr1 : " +arr1);	//
		System.out.println("arr3 : " +arr3);	// 서로의 주소 값이 다름
		System.out.println(arr2);	//여전히 arr1 와 주소값 같음
		
		int arr4[] = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr1 :" + arr1);	
		System.out.println("arr2 :" + arr2);	//arr1 과 2는 주소값 같음
		System.out.println("arr3 :" + arr3);	//arr3 은 다름
		System.out.println("arr4 :" + arr4);	// arr4 도 완전히 새로운 주소값임.
/*
arr1 :[I@5ecddf8f
arr2 :[I@5ecddf8f
arr3 :[I@27abe2cd
arr4 :[I@5f5a92bb

 */
	}

}
