package p294;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1); // Parameter는 생성자에 의해 결정
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		//error 값을 보고 싶을 때 //System.error.println

	}

}
