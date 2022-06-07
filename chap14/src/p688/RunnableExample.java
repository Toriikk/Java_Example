package p688;

public class RunnableExample {

	public static void main(String[] args) {
/*		Runnable runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();
		*/
		//람다식은 아래의 형태와 같다 알아둘 것 
		Thread thread = new Thread(() -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		
		thread.start();
	}
}
		

		
		
