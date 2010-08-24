package ch08.Exer08_04;

public class Rectangle
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 1.0;
		width = 1.0;
	}
	
	public double getLength()
	{
		return  length;
	}
	
	public void setLength(double length)
	{
		if( length > 0.0 & length < 20.0 )
			this.length = length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		if( width > 0.0 & width < 20.0 )
			this.width = width;
	}
	
	public double getPerimeter()
	{
		return (length*2 + width*2);
	}
	
	public double getArea()
	{
		return (length * width);
	}

}
