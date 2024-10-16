package C21;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws Exception {
		//스트림이란 ? 데이터의 흐름임.
		
		//URL 객체생성(Deprecated...)
		URL url = new URL("https://shopping.naver.com/logistics/category?menu=10011321&promotion=BRAND_"	//url 입력 (이거 주소 html 코드를 불러옴)
				+ "DAY_10118747&first=10855503670&NaPm=ct%3Dm1ojy86h%7Cci%3Dshoppingwindow%7Ctr%3Dnsh%7Chk%3D1f18a30eb1f46337d45f04f70c4beeb0ee2461b7%7Ctrx%3D");
		
		
		//스트림 꺼내기
		InputStream bin = url.openStream();		
		
		//보조스트림
		BufferedInputStream buffIn = new BufferedInputStream(bin);  //보조스트림 , 버퍼공간 단위로 수신
		Reader in = new InputStreamReader(buffIn);  //보조스트림 , byte 단위 ->char 단위로 변환
		
		//확인
		Writer out = new FileWriter("C:\\TMP_IO\\index.html");
		while(true) {
			int data = in.read();
			if(data==-1)				//유효성 검사
				break;
			System.out.print((char)data);
			out.write((char)data);
		}
		out.flush();
		out.close();
		in.close();
		buffIn.close();
		bin.close();
	}
}
