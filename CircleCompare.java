package AbstractClassesAndObjects;

public class CircleCompare extends GeometricObjectCompare{
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	CircleCompare(){
		radius = 1;
	}
	
	CircleCompare(double radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
	public void print(){
		System.out.println("Circle with radius = " + radius + " and area = " + this.getArea());
	}
}
