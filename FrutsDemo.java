package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FrutsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Banano");
		
		Stream<String> fruitStream = fruits.parallelStream();
		fruitStream.filter(fruit->{System.out.println("Fruit:"+fruit);
		return false;
		}).forEach(fruit->{});
		
		
		List<String> elements = Arrays.asList("1", "2", "3", "4", "5");
		String result = elements.stream().reduce("", String::concat);
		System.out.println(result);
	}

}
