// Sade Washington
// 10/1/2023
// Comp 167 Section 1
// Extends  class "VectorShape", represents bullet with specific attributes and methods related to its shape and bounds.

package Astr_pack;
import java.awt.Rectangle;


public class Bullet extends VectorShape {
	// Class defintion for Bullet / Constructor to initialize variable
	public Bullet() {
		this.setShape(new Rectangle(0,0,1,1));
		this.setAlive(false);

	}
	//Method to getBounds
	public Rectangle getBounds( ) {
		return new Rectangle((int)this.getX(), (int)this.getY(), 1, 1);
	}
}
