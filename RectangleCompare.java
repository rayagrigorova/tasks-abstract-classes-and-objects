package AbstractClassesAndObjects;

public class RectangleCompare extends GeometricObjectCompare {
	private double x, y;
	
	public RectangleCompare(){
		x = 1;
		y = 1;
	}
	public RectangleCompare(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double getArea() {
		return x * y;
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
	
	public void print() {
		System.out.println("Rectangle with x = " + x + ", y = " + y + " and area = " + this.getArea());
	}
}
