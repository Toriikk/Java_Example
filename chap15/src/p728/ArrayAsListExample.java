package p728;

import java.util.Arrays;
import java.util.List;

// p729
public class ArrayAsListExample {

	public static void main(String[] args) {
		 List<String> list1 = Arrays.asList("홍길동", "김재희", "박자바"); // 게시판 만들 때 많이 쓴다!
		 
		 for(String name: list1) {
			 System.out.println(name);
		 }
		 
		 List<Integer> list2 = Arrays.asList(1, 2, 3);
		 for(int value: list2) {
			 System.out.println(value);
		 }

	}

}
