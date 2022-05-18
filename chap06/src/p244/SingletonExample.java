package p244;

public class SingletonExample {

	public static void main(String[] args) {
		/*Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 */ 
		//static 은 값이 머물러 있기 때문에 new로 객체를 새로 만들 필요가 x
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다."); // 싱글톤은 동일한 객체 참조
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}

	}

}
