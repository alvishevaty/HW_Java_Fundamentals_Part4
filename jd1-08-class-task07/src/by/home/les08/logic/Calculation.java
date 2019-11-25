package by.home.les08.logic;

import by.home.les08.entity.Point;
import by.home.les08.entity.Triangle;

public class Calculation {

	public double sideCalculation(Point p1, Point p2) {

		double side = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
		return side;
	}

	public double perimeter(Triangle triangle) {

		double P = triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
		return P;
	}

	public double area(Triangle triangle) {

		double side1 = triangle.getSide1();
		double side2 = triangle.getSide2();
		double side3 = triangle.getSide3();
		double p = (side1 + side2 + side3) / 2;
		double S = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return S;
	}

	public double[] mediansCenter(Point p1, Point p2, Point p3) {
		
		double[] coord = new double[2];
		coord[0] = ((double) p1.getX() + (double) p2.getX() + (double) p3.getX()) / 3;
		coord[1] = ((double) p1.getY() + (double) p2.getY() + (double) p3.getY()) / 3;
		return coord;
	}

}
