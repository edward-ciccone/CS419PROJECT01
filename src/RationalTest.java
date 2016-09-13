
public class RationalTest {

	public static void main(String[] args) {
		Rational rat1 = new Rational();
		System.out.println("Rat1 Num: " + rat1.getNumerator());
		System.out.println("Rat1 Den: " + rat1.getDenominator());
		
		Rational rat2 = new Rational(243);
		System.out.println("Rat2 Num: " + rat2.getNumerator());
		System.out.println("Rat2 Den: " + rat2.getDenominator());
		System.out.println("toString: " + rat2.toString());
		
		Rational rat3 = new Rational(34, 58);
		System.out.println("Rat3: " + rat3.getNumerator() + "/" + rat3.getDenominator());
		System.out.println("toString: " + rat3.toString());
		
		Rational rat4 = new Rational(57, 0);
		System.out.println("Rat4 Num: " + rat4.getNumerator());
		System.out.println("Rat4 Den: " + rat4.getDenominator());
	}

}
