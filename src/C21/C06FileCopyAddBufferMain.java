package C21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C06FileCopyAddBufferMain {
	
	 
		private static final String DIR = "C:\\TMP_IO\\";
//exe 파일 복사

		//명령어 원본경로 저장대상경로
		public static void main(String[] args) throws Exception {

			InputStream in = new FileInputStream(DIR+args[0]);
			OutputStream out = new FileOutputStream(DIR+args[1]);
			
			byte [] buffer = new byte[4096];
			
			long sTime = System.currentTimeMillis();
			while(true) {
				int data = in.read(buffer);
				if(data==-1)
					break;
				out.write(buffer,0,data);
				out.flush();
}
			long eTime = System.currentTimeMillis();
			in.close();		//닫아주는거 필수
			out.close();
	}
	
	
}
