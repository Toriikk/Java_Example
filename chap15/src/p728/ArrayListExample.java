package p728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");  // 0
		list.add("JDBC");  // 1
		list.add("Servlet/JSP"); // 2
		list.add(2, "Database"); // 하지만 여기에 2가 적히면서 위의 2번이 밀려서 3번이 되고 데이터베이스가 2번이 됨 -> 실행 결과 확인 
		list.add("iBATIS");  // MyBatis의 또다른 이름 

		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println();
		
		list.remove(2); // 삭제는 밑에서부터 위로 할 것, 삭제할 때마다 번호가 바뀌기 때문에 
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
