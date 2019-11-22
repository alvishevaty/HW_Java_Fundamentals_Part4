package by.home.les08.entity;

public class Triangle {

	Point point = new Point();

	private double side;

	public Triangle() {
		this.side = 0;
	}

	public Triangle(Point p1, Point p2) {
		int a = 0;
		int b = 0;

		if (p1.getX() <= 0 & p2.getX() >= 0 || p1.getX() >= 0 & p2.getX() <= 0) {
			a = Math.abs(p1.getX()) + Math.abs(p2.getX());
		} else if (p1.getX() <= 0 & p2.getX() <= 0 || p1.getX() >= 0 & p2.getX() >= 0) {
			if (Math.abs(p1.getX()) >= Math.abs(p2.getX())) {
				a = Math.abs(p1.getX()) - Math.abs(p2.getX());
			} else {
				a = Math.abs(p2.getX()) - Math.abs(p1.getX());
			}
		}

		if (p1.getY() <= 0 & p2.getY() >= 0 || p1.getY() >= 0 & p2.getY() <= 0) {
			b = Math.abs(p1.getY()) + Math.abs(p2.getY());
		} else if (p1.getY() <= 0 & p2.getY() <= 0 || p1.getY() >= 0 & p2.getY() >= 0) {
			if (Math.abs(p1.getY()) >= Math.abs(p2.getY())) {
				b = Math.abs(p1.getY()) - Math.abs(p2.getY());
			} else {
				b = Math.abs(p2.getY()) - Math.abs(p1.getY());
			}
		}
		this.side = Math.sqrt(a * a + b * b);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(side);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side))
			return false;
		return true;
	}

}
