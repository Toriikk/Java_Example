package test;

public class TestThree {

	public static void main(String[] args) {

				int a = 5;
				double b = 17;
				
				int k = (a>=b)? a-(int)b : (int)b-a;
				// 강제형변환(casting)
				System.out.println("a와 b의 차이 : " + k);

	}

}
