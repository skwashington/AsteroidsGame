// Sade Washington
// 9/28/23
// Comp167 Section 1
// Extends  class "VectorShape", represents ship with specific attributes and methods related to its shape and bounds.

package Astr_pack;
import java.awt.Rectangle;
import java.awt.Shape;

public class Ship extends VectorShape {
	//class definition for Ship's attributes
	private int[] shipX = {-6,-3,0,3,6,0};// brackets in front of data type while declaring array
	private int[] shipY = {6,7,7,7,6,-7};
	
	public Ship() {
		// Constructor to initialize variables
		this.setShape(new Rectangle(0,0,1,1));
		this.setAlive(false);
	}
	//method to getBounds
	public Rectangle getBounds( ) {
		return new Rectangle((int)this.getX() - 6, (int)this.getY() - 6, 12, 12);
	}

}