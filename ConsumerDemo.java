package lambda;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = ConsumerDemo::showConsumer;
		consumer.accept("Jack");
		consumer.accept("Jill");
		consumer.accept("Ram");
	}

	public static void showConsumer(String name) {
		System.out.println("Welcom:"+name);
	}
}
