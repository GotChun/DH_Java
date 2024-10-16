package C22;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C02CharConvertStreamMain {

	public static void main(String[] args) throws IOException {
		
		String str= "문자변환 스트림 사용";
		
		OutputStream out = new FileOutputStream("C:\\TMP_IO\\test.txt");
		OutputStreamWriter wout = new OutputStreamWriter(out);		//이게 좀더 범위가 넓음 write 할수 있는 자료형 범위가(오버로딩이 되어있다)
		BufferedWriter bout = new BufferedWriter(wout);
		bout.write(str);
		bout.flush();
		bout.close();
		
		
		InputStream in = new FileInputStream("C:\\TMP_IO\\test.txt");
		BufferedInputStream bin = new BufferedInputStream(in);
		InputStreamReader rin = new InputStreamReader(bin);
		
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			System.out.print((char)data);
		}
		
		
	}
}
 