package C21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args) throws IOException{

		Writer fout = new FileWriter("C:\\TMP_IO\\test1.txt",false);  //true 내용을 덮어쓰기가 아닌 추가하기로 바꿈  false 는 덮어쓰기

		fout.write("HElloworld\n");		//test 파일안에 내용 삽입
		fout.write("TEST2\n");		//여기 입력한 내용이 덮어쓰기가 됨
		fout.write("TEST3\n");

		fout.flush();		//buffer 를 비움
		fout.close();		//일단 뭘 닫음 근데 뭘 닫음?



		////////////////////////////////////////////////////


	}
}


//정신차립시다 . ... . . . . !! ! ! !