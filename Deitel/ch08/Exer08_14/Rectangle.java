package ch08.Exer08_14;

public class Rectangle
{
	private double x1,x2,x3,x4;
	private double y1,y2,y3,y4;
	
	public Rectangle( double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4)
	{
		set(x1, x2, x3, x4, y1, y2, y3, y4);
	}
	
	public void set(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4)
	{
		this.x1 = (x1 > 20) ? 20 : (x1 < 0) ? 0 : x1;
		this.x2 = (x2 > 20) ? 20 : (x2 < 0) ? 0 : x2;
		this.x3 = (x3 > 20) ? 20 : (x3 < 0) ? 0 : x3;
		this.x4 = (x4 > 20) ? 20 : (x4 < 0) ? 0 : x4;
		
		this.y1 = (y1 > 20) ? 20 : (y1 < 0) ? 0 : y1;
		this.y2 = (y2 > 20) ? 20 : (y2 < 0) ? 0 : y2;
		this.y3 = (y3 > 20) ? 20 : (y3 < 0) ? 0 : y3;
		this.y4 = (y4 > 20) ? 20 : (y4 < 0) ? 0 : y4;
	}
}
