package C21;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {

	public static void main(String[] args) throws IOException  {
		
//		reader 클래스 주요 메서드 = read() 유니코드값 리턴

		Reader fin = new FileReader("C:\\TMP_IO\\test1.txt");
		StringBuffer buffer = new StringBuffer();
		int data;
		while((data = fin.read())!=-1) {
//			int data = fin.read();	//파일안의 내용 읽음
//			if(data==-1) 	//읽을거없으면 나감
//				break;
//			System.out.print((char)data);
			buffer.append((char)data);		//buffer 안에 저장
		}
		System.out.println(buffer);
		fin.close();
		
		
	}

}
