package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveFromString {

	public static void main(String[] args) {
		
		String note= new String("uytrewewaaaa");
		String magazins = new String("aaasdfghjklqwweertyuiozxcvbnmaaaa");
		
//		Scanner in = new Scanner(System.in);
//		
//		String nextLine = in.nextLine();
		
		List<Character> noteList = new ArrayList<Character>();
//		List<Character> magazinList = new ArrayList<Character>();
		
		for(char c:note.toCharArray()) {
			noteList.add(c);
		}
//		for(char c: magazins.toCharArray()) {
//			magazinList.add(c);
//		}
		
		System.out.println("note List:"+noteList);
		//magazinList.stream().forEach(c-> noteList.remove(c));
//		magazins.chars().mapToObj(k-> (char)k).forEach(c-> noteList.remove(c));  // best solution is in this line
		
		// anyMatch stop stream at the first match
		magazins.chars().mapToObj(k->{  System.out.println((char)k); return (char)k;}).anyMatch(c-> {noteList.remove(c);return noteList.size()<1;});
		
		System.out.println("note List:"+noteList);
		
		System.out.println(noteList.size());
		
	
	}

}
