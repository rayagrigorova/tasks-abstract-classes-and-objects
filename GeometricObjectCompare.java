package AbstractClassesAndObjects;

public abstract class GeometricObjectCompare implements Comparable<GeometricObjectCompare>{

	public int compareTo(GeometricObjectCompare o) {
		return(Double.compare(this.getArea(),o.getArea()));
	}
	
	public abstract double getArea();
	public abstract void print();
	
	public static GeometricObjectCompare max(GeometricObjectCompare x, GeometricObjectCompare y) {
		//if both are equal, then it returns the first one.
		if(x.compareTo(y) == 1 || x.compareTo(y) == 0) return x;	
		return y;
	}

	/*
	 * Направете проучване за интерфейса Comparable и класа ArrayList. Потърсете как
	 * имплементирането на интерфейса би повлияло употребата на ArrayList от клас,
	 * създаден от нас. Променете класа GeometricObject и имплементирайте интерфейса
	 * Comparable, който да сравнява лицата на обектите. Дефинирайте статичен метод
	 * max в класа GeometricObject за намиране на по-големия от два обекта от класа
	 * GeometricObject.
	 */

}
