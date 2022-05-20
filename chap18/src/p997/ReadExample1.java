package p997;
// 바이트 기반 입력 스트림의 최상위 클래스 -> 문자, 소리, 이미지, 동영상 (영문만)
import java.io.InputStream;
import java.io.FileInputStream;

public class ReadExample1  {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp/test.txt"); //ANSI 형식으로 저장
		int readByte;

		while(true) {

			readByte = is.read();
			if(readByte == -1) break; // -1의 의미 : EOF, 파일이 끝날 때까지 읽어라 break;
			System.out.print((char)readByte);

		}

		is.close();
	}

}
