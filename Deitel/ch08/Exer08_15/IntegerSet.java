package ch08.Exer08_15;

public class IntegerSet
{
	private boolean[] array;
	
	public IntegerSet()
	{
		array = new boolean[100];
		
		for (int i = 0; i < array.length; i++)
			array[i] = false;
	}
	
	public boolean getElement( int i )
	{
		if( i >= 0 & i < array.length )
			return array[i];
		else return false;
	}

	public void deleteElement( int i )
	{
		if( i >= 0 & i < array.length )
			array[i] = false;
	}
	
	public void insertElement( int i )
	{
		array[i] = true;
	}
	
	public IntegerSet union( IntegerSet integerSet )
	{
		IntegerSet iSet = new IntegerSet();
		
		for( int i = 0; i < array.length; i++ )
			if(this.getElement(i) || integerSet.getElement(i))
				iSet.insertElement(i);
		
		return iSet;
	}

	public IntegerSet intesection( IntegerSet integerSet )
	{
		IntegerSet iSet = new IntegerSet();
		
		for( int i = 0; i < array.length; i++ )
			if(this.getElement(i) && integerSet.getElement(i))
				iSet.insertElement(i);
		
		return iSet;
	}
	
	public String toSetString()
	{
		String set = new String("");
		
		for (int i = 0; i < array.length; i++)
			if( array[i] )
			{
				if( set.equals("") )
					set += i;
				else set += " " + i;
			}
		
		return set.equals("") ? "--" : set;
	}
	
	public boolean isEqualTo( IntegerSet integerSet )
	{
		int counter = 0;
		
		for (int i = 0; i < array.length; i++)
			if ( this.getElement(i) == integerSet.getElement(i) )
				counter++;
		
		return ( counter == array.length );
	}
}
