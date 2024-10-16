package C10;

import java.util.Arrays;
import java.util.Scanner;

public class C01원시타입배열 {
	
	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int[] arr1 = new int[5];
			arr1[0] = sc.nextInt();
			arr1[1] = sc.nextInt();
			arr1[2] = sc.nextInt();
			arr1[3] = sc.nextInt();
			arr1[4] = sc.nextInt();
			System.out.println("배열길이 :" + arr1.length);	//배열의 길이를 출력
			System.out.println(arr1 instanceof Object);		//arr1 배열이 Object 에서 물려받은 객체인지  확인
			System.out.println("--------------------");
			for(int i =0;i<arr1.length;i++) {
				System.out.println(arr1[i]+" ");
				
			}
			System.out.println();
			for(int el :arr1)
				System.out.printf(el+" ");
			System.out.println();
			Arrays.stream(arr1).forEach(el->System.out.printf(el+" "));		//람다식 표현
			System.out.println("-----------------\n");
//			Arrays.stream(arr1).forEach(System.out::print);
			
			//배열에 입력된 값들 중 최소값 / 최대값을 출력해보세요
			int max=arr1[0];
			int min=arr1[0];
			for(int j=0;j<arr1.length;j++) {
				if(max<arr1[j]) {
					max=arr1[j];
				
				}
			}
			System.out.println("배열 최대값:"+max);
			for(int k=0;k<arr1.length;k++) {
				if(min>arr1[k]) {
					min=arr1[k];
				}
				k++;
			}
			System.out.println("배열 최솟값:"+min);
			
			int sum=0;
			for(int j=0;j<arr1.length;j++) {
				sum+=arr1[j];
				
			}
			sum/=arr1.length;
			System.out.println(sum);
			
			System.out.println(Arrays.stream(arr1).max().getAsInt());		//여기서 max 와 min 은 java 에서 지정한 예약어인듯 하다.
			System.out.println(Arrays.stream(arr1).min().getAsInt());
			System.out.println(Arrays.stream(arr1).average().getAsDouble());	
			
		

	}

}
