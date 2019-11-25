package by.home.les08.main;

import by.home.les08.entity.Point;
import by.home.les08.entity.Triangle;
import by.home.les08.logic.Calculation;
import by.home.les08.view.TriangleView;

public class Main {

	/*
	 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для
	 * создания объектов, вычисления площади, периметра и точки пересечения медиан.
	 */

	public static void main(String[] args) {

		Point point1 = new Point(0.0, 0.0);
		Point point2 = new Point(3.0, 0.0);
		Point point3 = new Point(0.0, 4.0);

		Calculation calculation = new Calculation();
		Triangle triangle = new Triangle();
		TriangleView triangleView = new TriangleView();

		triangle.setSide1(calculation.sideCalculation(point1, point2));
		triangle.setSide2(calculation.sideCalculation(point2, point3));
		triangle.setSide3(calculation.sideCalculation(point3, point1));

		triangleView.printSide("Сторона АВ: ", triangle.getSide1());
		triangleView.printSide("Сторона ВC: ", triangle.getSide2());
		triangleView.printSide("Сторона CA: ", triangle.getSide3());

		triangleView.printTriangleParameter("Периметр треугольника: ", calculation.perimeter(triangle));
		triangleView.printTriangleParameter("Площадь треугольника: ", calculation.area(triangle));
		triangleView.printMediansCenterCoord(calculation.mediansCenter(point1, point2, point3));
	}
}
