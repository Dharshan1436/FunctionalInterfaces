package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> printConsumer = str -> System.out.println(str);
		printConsumer.accept("Hello, World!");
		Consumer<String> upperCasePrinter = str -> System.out.println(str.toUpperCase());

		Consumer<String> combinedConsumer = printConsumer.andThen(upperCasePrinter);
		combinedConsumer.accept("Hello, World!");
		
	}

}
