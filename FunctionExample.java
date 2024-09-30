package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> stringLength = str -> str.length();

		System.out.println(stringLength.apply("Hello"));
		System.out.println(stringLength.apply("Java"));

		// andThen Method
		Function<Integer, String> lengthToString = len -> "Length: " + len;
		Function<String, String> result = stringLength.andThen(lengthToString);

		System.out.println(result.apply("Hello"));
		Function<Integer, Integer> square = x -> x * x;
		Function<Integer, Integer> increment = x -> x + 1;

		Function<Integer, Integer> combined = square.andThen(increment);
		System.out.println(combined.apply(3));

		// compose method
		Function<String, String> toUpperCase = str -> str.toUpperCase();

		Function<String, Integer> stringLength1 = str -> str.length();

		Function<String, Integer> upperCaseLength = stringLength1.compose(toUpperCase);

		System.out.println(upperCaseLength.apply("hello"));
		System.out.println(upperCaseLength.apply("java"));

	}

}
