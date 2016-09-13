

/**
 * 
 * Constructor should normalize
 * 
 * Constructor should fix signs
 * 
 * @author edward
 *
 */
public class Rational {

	private long numerator;
	private long denominator;
	
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Rational(long n) {
		this.numerator = n;
		this.denominator = 1;
	}
	
	public Rational(long n, long d) {
		if(d == 0) {
			this.numerator = 0;
			this.denominator = 1;
		} else {
			this.numerator = n;
			this.denominator = d;
		}
	}
	
	public long getNumerator() {
		return numerator;
	}
	
	public long getDenominator() {
		return denominator;
	}
	
	public Rational add(Rational rhs) {
		return this;
	}
	
	public Rational sub(Rational rhs) {
		return new Rational();
	}
	
	public Rational mult(Rational rhs) {
		return new Rational();
	}
	
	public Rational div(Rational rhs) {
		return new Rational();
	}
	
	public static Rational add(Rational lhs, Rational rhs) {
		return new Rational();
	}
	
	public static Rational sub(Rational lhs, Rational rhs) {
		return new Rational();
	}
	
	public static Rational mult(Rational lhs, Rational rhs) {
		return new Rational();
	}
	
	public static Rational div(Rational lhs, Rational rhs) {
		return new Rational();
	}
	
	public boolean equals(Rational rhs) {
		return false;
	}
	
	public boolean less(Rational rhs) {
		return false;
	}
	
	public boolean greater(Rational rhs) {
		return false;
	}
	
	/**
	 * Compares this object to another object
	 * 
	 * @param rhs The Rational number being compared
	 * @return 1 if this object is > than rhs
	 * @return -1 if this object is < than rhs
	 * @return if this ojbect is == to rhs
	 */
	public int compareTo(Rational rhs) {
		return -1;
	}
	
	public String toString() {
		String rationalString = null;
		
		int a = (int) numerator;
		int b = (int) denominator;
		
		if(a != 0) {
			if(b == 1) return Integer.toString(a);
			else if(b > 0) return a + "/" + b;
		}
		
		rationalString = a + "/" + b;
		
		return rationalString;
	}
	
	public int intValue() {
		return -1;
	}
	
	/**
	 * (long) <double-value>
	 * @return
	 */
	public long longValue() {
		return -1;
	}
	
	/**
	 * <long-value> * 1.0F
	 * @return
	 */
	public float floatValue() {
		return -1;
	}
	
	/**
	 * <long-value> * 1.0
	 * @return
	 */
	public double doubleValue() {
		return -1;
	}
	
	private void normalize() {
		
	}
	
	private void fixsigns() {
		
	}
	
	private void reduce() {
		
	}
	
	private long gcd(long m, long n) {
		if(n == 0) return m;
		else return gcd(n, m%n);
	}
		
}
