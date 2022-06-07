package p691;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java ");
		/*Consumer<Integer> consumer = t -> System.out.println(t + 8);  데이터형변환을 할 필요가 없음 제네릭은 다 받아줌 
		consumer.accept(5); */
		
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");
		
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);
		
 	}

}
