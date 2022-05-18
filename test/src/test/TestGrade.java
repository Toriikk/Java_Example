package test;

public class TestGrade {

	public static void main(String[] args) {
		int score = 100; 
		char Grade;
		
		switch(score/10)
		{
		case 10:
		case 9: 
			Grade = 'A';
			break;
		case 8:
			Grade = 'B';
			break;
		case 7:
			Grade = 'C';
			break;
		case 6:
			Grade = 'D';
			break;
		default:
			Grade = 'F';
		}
		System.out.println("학생의 학점은 " + Grade + "학점 입니다.");
	}
}
