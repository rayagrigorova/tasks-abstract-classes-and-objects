package AbstractClassesAndObjects;

public class Square extends GeometricObject {
	private double side;
	
	public Square(){
		side = 1;
	}
	
	public Square(double side){
		this.side = side;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all 4 sides");
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
