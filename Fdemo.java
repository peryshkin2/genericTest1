package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Fdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("Mango","Orange","Banano")
		.filter(fruit->{System.out.println("Fruit:"+fruit);
			return true;}).forEach(fruit->{});
		
		Function<String, Integer> length = (s)->s.length();
		Function<Integer, Boolean> condition = (i)-> i<10;
		Function<String, Boolean> function = length.andThen(condition);
		System.out.println("The outcome is:"+function.apply("Java 8"));
		
		List<Integer> values = (List<Integer>) Arrays.asList(10, 40, 20, 60, 80, 0, 80, 30, 40)
				.stream()
				.filter(p->p>18)
				.sorted()
				.sequential()
				.map(Integer::new)
				.distinct()
				.collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(values.toString());
	}

}
