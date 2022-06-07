package p695;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctinalExample2 {
	private static List<Student> list = Arrays.asList( // Student를 List가 잡아라
			new Student("홍길동", 90, 96),
			new Student("김재희", 95, 93)
			);
	
	public static double avg( ToIntFunction<Student> fucntion ) { // ToIntFunction : 표준 API, 예약어 -> 여기서는 student에 대한 정수만 가지고 있겠다
		int sum = 0;
		for(Student student : list) {
			sum += fucntion.applyAsInt(student);
		}
		
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("수학 평균 점수 : " + mathAvg);
	}
}
