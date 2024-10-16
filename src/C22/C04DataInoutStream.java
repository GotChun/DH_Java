package C22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C04DataInoutStream {

	public static void main(String[] args) throws IOException {		//파일이 아직 존재안하고

//		FileOutputStream out = new FileOutputStream("C:\\TMP_IO\\test3.txt");		//파일 쓰기 스트림
//		DataOutputStream dout = new DataOutputStream(out);					//파일이 없으면 자동 생성됨
//		dout.writeUTF("홍길동");		//깨지는디
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.flush();
//		dout.close();

		FileInputStream in = new FileInputStream("C:\\TMP_IO\\test3.txt");	//파일 읽기 스트림
		DataInputStream din = new DataInputStream(in);

		String name= din.readUTF();		//문자열읽은 메서드
		System.out.println(name);
		double weight = din.readDouble();
		System.out.println(weight);
		int data = din.readInt();
		System.out.println(data);		//이미 텍스트안에 글이 있어서 읽어온다









	}
}
