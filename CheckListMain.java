package lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckListMain {

	private int m=0;
	protected synchronized int getM() {
		return m;
	}
	protected synchronized void setM(int m) {
		this.m = m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counts = 0;
		Integer[] threshold = {10, 15, 25, 26};
		Integer[] ar1 = {1,2, 24, 3, 9, 11, 12, 13, 11, 14, 15,20, 33};
		
		IntSummaryStatistics stat = Stream.of(ar1).collect(IntSummaryStatistics::new, IntSummaryStatistics::accept, IntSummaryStatistics::combine);
		System.out.println(stat);
		System.out.println(stat.getAverage());
		
		List<Integer> list = Arrays.asList(ar1);
		System.out.println(list.toString());
		list.sort((i1,i2)->i1-i2);
		System.out.println(list.toString());
		for(Integer tt1: threshold) {
		//int m1 = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		//long m1 = list.stream().filter(p->p<tt1).mapToInt(Integer::intValue).count();
		
		// create list with conditions < current threshold
		list.stream().filter(p->p<tt1).forEach(p->System.out.println(p));
			long tempC = list.parallelStream().filter(p->p<tt1).mapToInt(Integer::intValue).count();
		// Truncate it if it size>5
		if(tempC>5)
			tempC = 5;
		counts += tempC;
		// remove from original list
		list = list.subList((int)tempC, list.size());
		
		System.out.println("counts=" +counts);
	}
		System.out.println("Final:counts=" +counts);
	}
}
