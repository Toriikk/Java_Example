package P1004;
// 문자 기반 입력 스트림의 최상위 클래스 -> 문자만! (한글 ㅇ)
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readerData;
		
		while(true) {
			readerData = reader.read();
			if(readerData == -1) break;
			System.out.print((char)readerData);
		}
		reader.close();
	}

}
