package AbstractClassesAndObjects;

public class GeometricObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject [] arr = new GeometricObject[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = new Square(i * 2);
			if(i % 2 == 0) {arr[i].setIsColored(true);}
		}
		
		for(int i = 0; i < 5; i++) {
			if(arr[i].getIsColored()) {
				System.out.println("Area = " + (arr[i].getSide() * arr[i].getSide())
						+ " How to color: ");
				arr[i].howToColor();
			}
		}
		

	}

}
