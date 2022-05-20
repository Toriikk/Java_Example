package P1004;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readerCharNo;
		char[] cbuf = new char[4];
		readerCharNo = reader.read(cbuf, 1, 2);
		
		for (int i=0; i<cbuf.length; i++) {
			System.out.print(cbuf[i]);
		}
		reader.close();

	}

}
