package C19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01LisMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList();
		
		//추가
		list.add("HTML/CSS/JS");
		list.add("JQUREY");
		list.add("NODEJS");
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SERVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		list.add(sc.next());
		
		//조회
		System.out.println("개수 확인 :" + list.size());
		System.out.println("idx 로 조회 :" + list.get(2));
		System.out.println("Value로 idx 확인 :" + list.indexOf("JAVA"));
		
		//삭제
		list.remove(0);
		list.remove("JQUREY");
		for(String el : list)
			System.out.println(el);
		
		//전체삭제
		list.clear();
	}
}
