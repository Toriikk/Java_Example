package p1026;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"D:\\homework\\gwaje_1\\src\\gwaje_1_9\\Min3.java");
		
		int readCharNo;
		char[ ] cbuf = new char[100];
		
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}

}
