package AbstractClassesAndObjects;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class compareTest {
	
	public static double sumArea(ArrayList<GeometricObjectCompare>a) {
		double sum = 0;
		for(int i = 0; i < a.size(); i++) {
			sum += a.get(i).getArea();
			
		}
		return sum;
	}

	public static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Напишете  тестова програма, която 
//		Използва метода max, за да намери
//		по-големия от два кръга, по-големия от два правоъгълника.
//		Създава ArrayList от пет
//		правоъгълника, сортира ги и ги извежда в конзолата
		Random r = new Random();
		
		GeometricObjectCompare c1 = new CircleCompare(2);
		GeometricObjectCompare c2 = new CircleCompare(10);
		
		GeometricObjectCompare r1 = new RectangleCompare(3,4);
		GeometricObjectCompare r2 = new RectangleCompare(4,1);
		
	    ArrayList <GeometricObjectCompare> arr = new ArrayList <GeometricObjectCompare>();
		
		System.out.println(c1.compareTo(c2));
		GeometricObjectCompare.max(c1,c2).print();
		
		System.out.println(r1.compareTo(r2));
		GeometricObjectCompare.max(r1,r2).print();
		
		for(int i = 0; i < 5; i++) {
			arr.add(new RectangleCompare(Math.round(r.nextDouble() * 10000) / 100,Math.round(r.nextDouble() * 10000) / 100 ));
		}
		
		System.out.println("\nBefore sorting:");
		for(int i = 0; i < 5; i++) {
			arr.get(i).print();
		}
		
		System.out.println("\nAfter sorting:");
		GeometricObjectCompare temp = new RectangleCompare();
		for(int i = 0; i < arr.size() - 1; i++) {
			for(int j = 0; j < arr.size() - i - 1; j++) {
				if(arr.get(j).getArea() > arr.get(j + 1).getArea()) {
					temp = arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			arr.get(i).print();
		}
		
//		Напишете тестова програма, която
//		създава масив от четири обекта 
//		(два кръга и два правоъгълника)
//		и изчислява общата им площ
//		с помощта на метода sumArea.
	System.out.println();
	ArrayList <GeometricObjectCompare> arr2 = new ArrayList <GeometricObjectCompare>();
	
	for(int i = 0; i < 4; i++) {
		if(i < 2) {arr2.add(new CircleCompare(Math.round(r.nextDouble() * 10000) / 100));}
		else {arr2.add(new RectangleCompare(Math.round(r.nextDouble() * 10000) / 100,Math.round(r.nextDouble() * 10000) / 100 ));}
	}
	
	for(GeometricObjectCompare o : arr2) {
		o.print();
	}
	System.out.println("Total sum: " +sumArea(arr2));
	}
}
