package at.fhj.itm;

/**
 * 
 * @author Katrin Hoenekl
 * @version 1.0.
 * create a class Point2d for distance between 2 points x and y
 *
 */
public class Point2d {
	
	public boolean debug;
	public double x;
	public double y;

	/**
	 * Constructor
	 * @param px value of x-coordinate
	 * @param py value of y-coordinate
	 */
	public Point2d (double px, double py) 
	{ 
		this.x = px;
		this.y = py;
	}

	/**
	 * Constructor
	 * nullpoint for x and y
	 */
	public Point2d () 
	{		
		x=0;
		y=0;
	}
	
	/**
	 * @param pt which coordinate is used
	 */
	public Point2d (Point2d pt) 
	{	
		this.x = pt.x;
		this.y = pt.y;
	}

	/**
	 * debug information in console
	 * @param s - String to print
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * set debug mode
	 * @param b 
	 */
	public void setDebug (boolean b) {
		debug = b;
	}

	/**
	 * set value for x
	 * @param px
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		x =px;
	}

	/**
	 * get the value of x
	 * @return x
	 */
	public double getX() {
		return x;
	}

	/**
	 * set value for y
	 * @param py
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		y= py;
	}

	/**
	 * get value of y
	 * @return y
	 */
	public double getY() {
		return y;
	}

	/**
	 * 
	 * @param px - value x
	 * @param py - value y
	 */
	public void setXY(double px, double py) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		x =px;
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		y= py;
	}

	/**
	 * Calculates the distance for Point2d
	 * @param pt- object to distance
	 * @return distance between a and b (pt)
	 */
	public double distanceFrom (Point2d pt) {
		
		double a = Math.abs(this.x -pt.x); 
		double b = Math.abs(this.y - pt.y);
		
		return Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2)); 
	}

	/**
	 * Calculates the distance for Point2d from nullpoint
	 * @return distance between a and b (pt)
	 */
	public double distanceFromOrigin () {
		double a = Math.abs(this.x - 0); 
		double b = Math.abs(this.y - 0);
		
		return Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2)); 
	}

	public String toString() {
		return "x-Wert: " + x + "y-Wert: " + y ;
	}
}
