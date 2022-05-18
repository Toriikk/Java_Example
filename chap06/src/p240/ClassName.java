package p240;

public class ClassName {

		// 인스턴스 필드와 메소드
		//int field1; // 컴파일 에러
		//void method1() {} // 컴파일 에러
		
		static int field2;
		static void method2() {}
		
		//정적 블록
		static {
			//feild1 = 10; // 컴파일 에러
			//method1();   // 컴파일 에러
			//정적 필드와 메소드
			field2 = 10;
			method2();
		}
		//정적 메소드
		static void Method3() {
			//this.field1 = 10; // 컴파일 에러
			//this.method1();  // 컴파일 에러
			field2 = 10;
			method2();
		}
	}
