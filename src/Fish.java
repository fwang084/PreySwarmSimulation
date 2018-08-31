import java.awt.Point;
import java.awt.Polygon;

public class Fish {
	private int xPos;
	private int yPos;
	private int xPrev;
	private int yPrev;
	
	private double speed;
	
	private double xVel;
	private double yVel;
	
	private Polygon shape;
	
	public Fish(Point p) {
		xPos = (int) p.getX();
		yPos = (int) p.getY();
		xPrev = xPos; yPrev = yPos;
	}
	public Fish(Point p, double c) {
		xPos = (int) p.getX();
		yPos = (int) p.getY();
		xPrev = xPos; yPrev = yPos;
		speed = c;
	}
	
	public void move() {
		xPrev = xPos;
		yPrev = yPos;
		double distance = Math.sqrt(Math.pow(xVel, 2) + Math.pow(yVel, 2));
		int x = (int) (xVel * (speed/distance));
		int y = (int) (yVel * (speed/distance));
		xPos += x; 
		yPos += y;
	}
	
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public int getChangeX() {
		return xPos - xPrev;
	}
	public int getChangeY() {
		return yPos - yPrev;
	}
	public void setVel(double x, double y) {
		xVel = x; yVel = y;
	}
	
	public void setShape(Polygon p) {
		shape = p;
	}
	public Polygon getShape() {
		return shape;
	}
	public void setSpeed(int s) {
		speed = s;
	}
}
