package at.fhj.itm;

import org.junit.Assert;
import org.junit.Test;
import at.fhj.itm.Point2d;

/**
 * 
 * @author Katrin Hoenekl
 * @version 1.0.
 * sets values to test the Point2d Class
 *
 */

public class Point2dTest {
	/**
	 * create a new Variable p1 from Type Point2d
	 */
	
	Point2d p1 = new Point2d(5, 7);
	
	/**
	 * set a X-value for the point p1
	 */
	
	@Test
	public void testSetX() {
		p1.setX(8);
		p1.getX();

		Assert.assertEquals(8, p1.getX(), 0.00001);

	}
	/**
	 * set a Y-value for the point p1
	 */
	
	@Test
	public void testSetY(){
		p1.setY(2);
		p1.getY();
		
		Assert.assertEquals(2, p1.getY(), 0.00001);
	}
	
	/**
	 * create 2 values a and b from type integer to test the distance between
	 */
	@Test
	public void testDistanceFrom() {
		int a = (int) Math.abs(p1.getX());
		int b = (int) Math.abs(p1.getY());

		Math.sqrt(Math.pow(a, 4) + Math.pow(b, 8));

	}
}

