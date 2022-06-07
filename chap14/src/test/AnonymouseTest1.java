package test;

public class AnonymouseTest1 {

	public static void main(String[] args) {
		Car fooCar = new Car() {
			public void run() {
				System.out.println("달려라!");
			}

			public void stop() {
				System.out.println("멈... 멈춰!");
				
				
			}

	};   // 익명 객체
	
	fooCar.run();
	fooCar.stop();
}
	
}


