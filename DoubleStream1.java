package lambda;

import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;

public class DoubleStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] ar1 = {1,1,2,2, 24, 3, 9, 11, 12, 13, 11, 14, 15,20,3, 33,22};
		IntSummaryStatistics statistic = Stream.of(ar1).collect(Collectors.summarizingInt(i->i));
		System.out.println(statistic);
		
		Map<Integer, Long> counts = Stream.of(ar1).
				collect(Collectors.
				groupingBy(Integer::intValue, 
						Collectors.counting()));
		
		Optional<Integer> mm = counts.keySet().stream().filter(k-> counts.get(k)==1).min((i1,i2)->i1-i2);
		System.out.println(counts);
		System.out.println(mm);
	}

}
