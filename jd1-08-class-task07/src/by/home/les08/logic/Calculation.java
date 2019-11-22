package by.home.les08.logic;

import by.home.les08.entity.Point;

public class Calculation {
	
	public double perimeter(double side1, double side2, double side3) {
		double P = side1 + side2 + side3;
		return P;
	}
	
	public double area(double side1, double side2, double side3) {
		double p = perimeter(side1, side2, side3) / 2;
		double S = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return S;
	}
	
	public double[] mediansCenter(Point p1, Point p2, Point p3) {
		double[] coord = new double[2];
		coord[0] = ((double)p1.getX() + (double)p2.getX() + (double)p3.getX()) / 3;
		coord[1] = ((double)p1.getY() + (double)p2.getY() + (double)p3.getY()) / 3;
		return coord;
	}
}
