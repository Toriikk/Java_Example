package chap03;

public class OverflowExample {

	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		// int x = 1000000;
		// int y = 1000000;
		// int z = x * y; // 컴파일 에러는 발생하지 않지만 쓰레기값 발생 
		System.out.println(z);

	}

}
