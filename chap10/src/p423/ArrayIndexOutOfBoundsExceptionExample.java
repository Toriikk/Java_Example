package p423;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) { // 여러 개의 옵션을 만들기 위해서 존재 
		String data1 = args[0];
		String data2 = args[1];
		// 옵션 값을 안 주고 실행했기 때문에 실행 오류가 남 
		//Run - Configurations - Arguments에 매개값을 입력하고 실행하면 예외가 발생하지 x 
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		
	
	}

}
