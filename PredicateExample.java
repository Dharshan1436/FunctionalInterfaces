package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> isEmpty = str -> str.isEmpty();
		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test("hello"));
		
		Predicate<String> isNotEmpty = str -> !str.isEmpty();
		Predicate<String> isLongerThen3 = str -> str.length()>3;
		Predicate<String> isValid =  isNotEmpty.or(isLongerThen3);
		System.out.println(isValid.test("hi"));
		System.out.println(isValid.test("hello"));
	}

}
