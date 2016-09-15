
public class RationalTest {

	public static void main(String[] args) {
		Rational a = new Rational(3, 4);
		Rational b = new Rational(1, 4);
		
		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		
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
		
		Rational r1 = new Rational(10, 1);
		Rational r = new Rational(1, 5);
		Rational statR = Rational.add(r1, r);
		System.out.println(statR.toString());
		System.out.println(r.add(r1).toString());
		System.out.println();
		int[] list = new int[10];
		System.out.println(list.length);
		
		int[] oldList = {1,2,3};
		for(int i = 0; i < oldList.length; i++)
			System.out.print(oldList[i] + " ");
	}

}
