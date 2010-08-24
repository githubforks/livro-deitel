package ch08.Exer08_17;

public class Rational
{
	private double numerator, denominator;
	
	public Rational()
	{
		numerator = 0;
		denominator = 0;
	}
	
	public Rational(int num, int den)
	{
		numerator = num;
		denominator = den;
	}
	
	public double getNumerator()
	{
		return numerator;
	}
	
	public void setNumerator( double n )
	{
		numerator = n;
	}
	
	public double getDenominator()
	{
		return denominator;
	}
	
	public void setDenominator( double d )
	{
		denominator = d;
	}
	
/*	public Rational sum()
	{
		
	}
	
	public Rational sub()
	{
		
	}
*/	
	public Rational multiply( Rational rational )
	{
		Rational r = new Rational();
		
		r.setNumerator(numerator * rational.getNumerator());
		r.setDenominator(denominator * rational.getDenominator());
		
		return r;
	}
	
	public Rational devide( Rational rational )
	{
		Rational r = new Rational();
		
		r.setNumerator(numerator * rational.getDenominator());
		r.setDenominator(denominator * rational.getNumerator());
		
		return r;
	}
	
	public void print()
	{
		System.out.printf("%2.2f/%2.2f", numerator, denominator);
	}
	
	public void print(int precision)
	{
		System.out.printf("%."+precision+"f", numerator/denominator);
	}
}
