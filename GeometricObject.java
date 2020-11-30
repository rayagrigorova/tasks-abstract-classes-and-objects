package AbstractClassesAndObjects;

public abstract class GeometricObject implements Colorable  {
	@Override
	public abstract void howToColor();
	boolean isColored;
	
	GeometricObject(){
		isColored = false;
	}
	
	public void setIsColored(boolean isColored) {
		this.isColored = isColored;
	}
	
	public boolean getIsColored() {
		return this.isColored;
	}

	abstract double getSide();
}
