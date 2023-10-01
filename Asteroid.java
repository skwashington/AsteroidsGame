// Sade Washington
// 9/28/23
// Comp167 Section 1
// Extends  class "VectorShape", represents asteroid with specific attributes and methods related to its shape and bounds.

package Astr_pack;
import java.awt.Rectangle;
import java.awt.Polygon;


public class Asteroid extends VectorShape{
	// Class definition for Asteroids
	private int[] astX = {-20,-13,0,20,22,20,12,2,-10,-22,-16};
	private int[] astY = {20,23,17,20,16,-20,-22,-14,-17,-20,-5};
	protected double rotVel;
	 
	
	public Asteroid() {
		//Constructor to initialize variables
		setRotationVelocity(0.0);
		setAlive(true);	
		setShape(new Polygon(astX,astY, astX.length));		
	}
	
	// Methods to get and set RotationVelocity, and getBounds
	public void setRotationVelocity(double rotVel) {
		this.rotVel = rotVel;
	}
	public double getRotationVelocity() {
		return this.rotVel;
	}
	public Rectangle getBounds( ) {
		return new Rectangle( (int)getX() - 20, (int)getY() - 20, 40, 40);
	}
	
}
