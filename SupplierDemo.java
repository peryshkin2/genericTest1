package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> users = new ArrayList<String>();
		users.add("Jack");
		users.add("Jill");
		users.add("Ram");
		
		users.stream().forEach((name)->{showSupplier(()->name);
		
			});
		
		users.forEach(System.out::println);
		
	}
	public static void showSupplier(Supplier<String> name) {
		System.out.println("Welcome:"+name.get());
	}

}
