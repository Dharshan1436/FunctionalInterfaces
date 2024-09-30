package functionalInterfaces;

@FunctionalInterface
interface Operation {
	int execute(int a, int b);

}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Operation addition = (a, b) -> a + b;
		Operation subtraction = (a, b) -> a - b;
		System.out.println("Addition: " + addition.execute(5, 3));
		System.out.println("Subtraction: " + subtraction.execute(5, 3));
	}

}
