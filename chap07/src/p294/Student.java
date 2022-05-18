package p294;

public class Student extends People{
		public int studentNo;
		
		//생성자
		public Student(String name, String ssn, int studentNo) {
			super(name, ssn); // 부모 클래스의 기본 생성자를 호출 // public People(String name, String ssn)
			this.studentNo = studentNo;
		}

}
