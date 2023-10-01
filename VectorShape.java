// Sade Washington
// 9/21/2023
// Comp167 Section 1
// Program represents objects with shape and velocity properties along with others; will be used as foundation in asteroid game.

package Astr_pack;
import java.awt.Shape;

public class VectorShape { 
	// Class definition for VectorShape
	private Shape shape;
	private boolean alive;
	private double x;
	private double y;
	private double velX;
	private double velY;
	private double moveAngle;
	private double faceAngle;
	
	// Constructor to initialize variables
	public VectorShape() {
		setShape(null);
		setAlive(false);
		setX(0.0);
		setY(0.0);
		setVelX(0.0);
		setVelY(0.0);
		setFaceAngle(0.0);
		setMoveAngle(0.0);
	}
	
	//Methods
	// get and set Shape / Alive / X / Y / VelX / VelY
	public Shape getShape() {
		return shape; 
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getVelX() {
		return velX;
	}
	public void setVelX(double velX) {
		this.velX = velX;
	}
	
	// get and set VelY
	public double getVelY() {
		return velY;
	}
	public void setVelY(double velY) {
		this.velY = velY;
	}
	
	// get and set MoveAngle
	public double getMoveAngle() {
		return moveAngle;
	}
	public void setMoveAngle(double moveAngle) {
		this.moveAngle = moveAngle;
	}
	
	// get and set FaceAngle
	public double getFaceAngle() {
		return faceAngle;
	}
	public void setFaceAngle(double faceAngle) {
		this.faceAngle = faceAngle;
	}
	
	// incX / incY / incMoveAngle / incFaceAngle / incVelX / incVelY
	public void incX(double i) {
		this.x += i;
	}
	public void incY(double i) {
		this.y += i ;
	}
	public void incMoveAngle(double i) {
		this.moveAngle += i;
	}
	public void incFaceAngle(double i) {
		this.faceAngle += i; 
	}	
	public void incVelX(double i) {
		this.velX += i;
	}
	public void incVelY(double i) {
		this.velY += i;
	}

}
