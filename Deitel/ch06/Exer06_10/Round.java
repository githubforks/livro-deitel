package ch06.Exer06_10;

public class Round
{
	public int roundToInteger( double number )
	{
		String s = Double.toString( Math.floor( number ) );
		return Integer.parseInt( s.substring( 0, s.indexOf( "." ) ) );
	}
	
	public double roundToTenths( double number )
	{
		return Math.floor( number * 10 + 0.5) / 10;
	}
	
	public double roundToHundredths( double number )
	{
		return Math.floor( number * 100 + 0.5) / 100;
	}
	
	public double roundToThousandths( double number )
	{
		return Math.floor( number * 1000 + 0.5) / 1000;
	}
}
