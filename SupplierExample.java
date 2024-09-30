package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> randomNumberSupplier = () -> Math.random() * 100;

		System.out.println("Random Number: " + randomNumberSupplier.get());
		Supplier<String> greetingSupplier = () -> "Hello, World!";

		System.out.println(greetingSupplier.get());
		
	}

}
