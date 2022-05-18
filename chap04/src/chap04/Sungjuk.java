package chap04;

public class Sungjuk {

	public static void main(String[] args) {
		
		int score = 100;
		int num = score/10;
		
		if (num>=10) {
			num = 9;
		}
		
		switch (num) {                    // 관계연산자 안 들어감
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7: 
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;

		default:
			System.out.println("F학점 입니다.");
			break;
		}
		}

	}


