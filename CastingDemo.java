package AbstractClassesAndObjects;

class CastingDemo {

	public static void main(String[] args) {
//		Разгледайте и тествайте следния код.
//		Какво според вас прави instanceof?
//		Какво според вас правят ((Circle)object).getArea())
//		и ((Rectangle)object).getArea())? Разгледайте досегашните
//		си програми, къде бихте използвали instanceof
//		и кастване на един обект към друг?
		
//Отговор: Операторът instanceof се използва, за да се провери дали 
//даден обект е инстанция на даден тип (клас, субклас или интерфейс)
//Сравнява се инстанция с тип и се връща или true, или false. 
//Ако се използва с променлива = null, се връща false.
		
//Със ((Circle)object).getArea()) cast-ваме object (който е инстанция на най-високия 
//superclass - Object, extend-ван от всички класове) до обект от клас Circle,
//ако object е инстанция на Circle.
		
//instanceof и кастване на един обект към друг
//може да се използва например с GeometricObject (както в примера), 
		Object object1 = new CircleCompare(1);
		Object object2 = new RectangleCompare(1, 1);
		// Display circle and rectangle
		displayObject(object1);
		displayObject(object2);

	}
	
	public static void displayObject(Object object) {
		if (object instanceof CircleCompare) {
		System.out.println("The circle area is " +
		((CircleCompare)object).getArea());
		System.out.println("The circle diameter is " +
		((CircleCompare)object).getRadius() * 2);
		}
		else if (object instanceof RectangleCompare) {
		System.out.println("The rectangle area is " +
		((RectangleCompare)object).getArea());
		}
	}
}



