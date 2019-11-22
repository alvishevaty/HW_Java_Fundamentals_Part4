package by.home.les08.view;

public class TriangleView {

	public void printSide(String name, double side) {
		System.out.println(name + side);
	}
	
	public void printTriangleParameter(String name, double parameter) {
		System.out.println(name + parameter);
	}	
	
	public void printMediansCenterCoord(double[] coordinates) {
		
		System.out.print("Координаты точки пересечения медиан:(");
		for (int i = 0; i < coordinates.length - 1; i++) {
			System.out.print(coordinates[i] + "; ");
		}
		System.out.print(coordinates[coordinates.length - 1]);
		System.out.println(")");
	}
	
}
