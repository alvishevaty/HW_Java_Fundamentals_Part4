package by.home.les08.main;

import by.home.les08.entity.Point;
import by.home.les08.entity.Triangle;
import by.home.les08.logic.Calculation;
import by.home.les08.view.TriangleView;

public class Main {
	
	public static void main(String[] args) {
		
		Point point1 = new Point(2, 2);
		Point point2 = new Point(-2, 3);
		Point point3 = new Point(0, -5);
		
		Triangle side1 = new Triangle(point1, point2);
		Triangle side2 = new Triangle(point2, point3);
		Triangle side3 = new Triangle(point3, point1);
		
		Calculation calc = new Calculation();
		TriangleView triangleView = new TriangleView();
		
		triangleView.printSide("Сторона АВ: ", side1.getSide());
		triangleView.printSide("Сторона ВC: ", side2.getSide());
		triangleView.printSide("Сторона CA: ", side3.getSide());
		
		triangleView.printTriangleParameter("Площадь треугольника:", calc.area(side1.getSide(), side2.getSide(), side3.getSide()));
		triangleView.printTriangleParameter("Периметр треугольника:", calc.perimeter(side1.getSide(), side2.getSide(), side3.getSide()));
		
		triangleView.printMediansCenterCoord(calc.mediansCenter(point1, point2, point3));
	}
}
