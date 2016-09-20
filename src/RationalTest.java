
import java.util.ArrayList;
import java.util.Random;

public class RationalTest {

	private static final int ARR_SIZE = 10;
	
	static ArrayList<Rational> rationals;
	static ArrayList<Integer> numerators;
	static ArrayList<Integer> denominators;
	
	static ArrayList<Rational> rationalsDenomOne = new ArrayList<Rational>();
	
	public static void main(String[] args) {
		
		numerators = new ArrayList<Integer>();
		denominators = new ArrayList<Integer>();
		rationals = new ArrayList<Rational>();
		
		createRationals();
		displayRationals();
		addStaticRationals();
		subStaticRationals();
		multStaticRationals();
		divStaticRationals();
		
		operateOnRationals(0, 0, 1);
		operateOnRationals(1, 0, 1);
		operateOnRationals(2, 0, 1);
		operateOnRationals(3, 0, 1);
		operateOnRationals(1, 5, 1);
	}
	
	/**
	 * Operate on the Rationals
	 * @param op 	0 addition
	 * 				1 subtraction
	 * 				2 multiplication
	 * 				3 division
	 * @param lhs
	 * @param rhs
	 */
	private static void operateOnRationals(int op, int lhsi, int rhsi) {
		System.out.printf("%15s%15s%n", "Operation", "Result");
		Rational lhs = rationals.get(lhsi);
		Rational rhs = rationals.get(rhsi);
		String opStr;
		if(op == 0) {
			opStr = lhs.toString() + " + " + rhs.toString();
			lhs.add(rhs);
		} else if(op == 1) {
			opStr = lhs.toString() + " - " + rhs.toString();
			lhs.sub(rhs);
		} else if(op == 2) {
			opStr = lhs.toString() + " * " + rhs.toString();
			lhs.mult(rhs);
		} else {
			opStr = lhs.toString() + " / " + rhs.toString();
			lhs.div(rhs);
		}
		System.out.printf("%15s%15s%n", opStr, lhs.toString());
	}

	private static void divStaticRationals() {
		System.out.println("\n\nAddition: \n\n");

		System.out.printf("%15s%15s%n", "Operation", "Result");
		/*
		 * Adds every other Rational objects to one another,
		 * and displays the sum.
		 */
		for(int i = 0; i < 10; i+=2) {
			Rational a = rationals.get(i);
			Rational b = rationals.get(i+1);
			Rational temp = Rational.div(a, b);
			String op = a.toString() + " / " + b.toString();
			String res = temp.toString();
			System.out.printf("%15s%15s%n", op, res);
		}
	}
	
	private static void multStaticRationals() {
		System.out.println("\n\nAddition: \n\n");

		System.out.printf("%15s%15s%n", "Operation", "Result");
		/*
		 * Adds every other Rational objects to one another,
		 * and displays the sum.
		 */
		for(int i = 0; i < 10; i+=2) {
			Rational a = rationals.get(i);
			Rational b = rationals.get(i+1);
			Rational temp = Rational.mult(a, b);
			String op = a.toString() + " * " + b.toString();
			String res = temp.toString();
			System.out.printf("%15s%15s%n", op, res);
		}
	}
	
	private static void subStaticRationals() {
		System.out.println("\n\nAddition: \n\n");

		System.out.printf("%15s%15s%n", "Operation", "Result");
		/*
		 * Adds every other Rational objects to one another,
		 * and displays the sum.
		 */
		for(int i = 0; i < 10; i+=2) {
			Rational a = rationals.get(i);
			Rational b = rationals.get(i+1);
			Rational temp = Rational.sub(a, b);
			String op = a.toString() + " - " + b.toString();
			String res = temp.toString();
			System.out.printf("%15s%15s%n", op, res);
		}
	}	
	
	private static void addStaticRationals() {
		System.out.println("\n\nAddition: \n\n");

		System.out.printf("%15s%15s%n", "Operation", "Result");
		/*
		 * Adds every other Rational objects to one another,
		 * and displays the sum.
		 */
		for(int i = 0; i < 10; i+=2) {
			Rational a = rationals.get(i);
			Rational b = rationals.get(i+1);
			Rational temp = Rational.add(a, b);
			String op = a.toString() + " + " + b.toString();
			String res = temp.toString();
			System.out.printf("%15s%15s%n", op, res);
		}
	}

	private static void displayRationals() {
		System.out.println("The Values: \n\n");
		System.out.printf("%15s%15s%15s%n", "Numerator", "Denominator", "Rational");

		/* Creates 10 random Rational objects using the randomly generated numbers */
		for(int i = 0; i < ARR_SIZE; i++) {
			rationals.add(new Rational(numerators.get(i), denominators.get(i)));
			System.out.printf("%15d", numerators.get(i));
			System.out.printf("%15d", denominators.get(i));
			System.out.printf("%15s%n", rationals.get(i).toString());
		}		
	}

	private static void createRationals() {
		Random random = new Random();
		
		/* Generate 10 random numerators and denominators in the range 0..50.
		 * Values have a 50% chance of being negative.
		 */
		for(int i = 0; i < 10; i++) {
			boolean topNeg = random.nextInt(10) > 5;
			boolean botNeg = random.nextInt(10) > 5;
			
			if(topNeg) numerators.add(random.nextInt(50) * -1);
			else numerators.add(random.nextInt(50));	
			
			if(botNeg) denominators.add(random.nextInt(50) * -1);
			else denominators.add(random.nextInt(50));
		}
	}

	private static void displaySomeConvertsions(ArrayList<Rational> rationals, int i) {
		String convert = "The Rational String: " + rationals.get(i).toString() + "INT: " + rationals.get(i).intValue()
				+ "   LONG: " + rationals.get(i).longValue() + "   FLOAT: " + rationals.get(i).floatValue() 
				+ "   DOUBLE: " + rationals.get(i).doubleValue();
		System.out.println(convert);
		System.out.printf("%15s%n", "The Rational String: " + rationals.get(i).toString(), "Denominator", "Rational");
		/*System.out.println("Rational: " + rationals.get(i).toString());
		System.out.println("int: " + rationals.get(i).intValue());
		System.out.println("long: " + rationals.get(i).longValue());
		System.out.println("float: " + rationals.get(i).floatValue());
		System.out.println("double: " + rationals.get(i).doubleValue());
	*/}

	private static void displayDefault() {
		Rational defaultRational = new Rational();
		System.out.println("Default Constructor:\n");
		System.out.printf("%15s%15s%15s%n", "Numerator", "Denominator", "Rational");
		System.out.printf("%15d", defaultRational.getNumerator());
		System.out.printf("%15d", defaultRational.getDenominator());
		System.out.printf("%15s%n", defaultRational.toString());
		System.out.println("\n-----------------------------------------------------------\n");
	}
	
	private static void displayDenomAsOne() {
		Random random = new Random();
		
		/* Generate 10 random numerators with denominator as 1 in the range 0..50. */
		for(int i = 0; i < 10; i++) {
			rationalsDenomOne.add(new Rational((long) random.nextInt(50)));
		}
		
		System.out.println("\nDenominator As One:\n");
		System.out.printf("%15s%15s%15s%n", "Numerator", "Denominator", "Rational");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%15d", rationalsDenomOne.get(i).getNumerator());
			System.out.printf("%15d", rationalsDenomOne.get(i).getDenominator());
			System.out.printf("%15s%n", rationalsDenomOne.get(i).toString());
		}
		System.out.println("\n-----------------------------------------------------------\n");

	}

}
