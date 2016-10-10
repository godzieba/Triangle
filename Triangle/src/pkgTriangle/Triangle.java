package pkgTriangle;

public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/** Constructs default triangle.*/
	public Triangle() {
	}
	
	/** Constructs custom triangle. */
	public Triangle(double Side1, double Side2, double Side3) {
		this.side1 = Side1;
		this.side2 = Side2;
		this.side3 = Side3;
	}

	/** Return side1 of triangle. */
	public double getSide1() {
		return side1;
	}

	/** Set side1 of triangle. */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/** Return side2 of triangle. */
	public double getSide2() {
		return side2;
	}

	/** Set side2 of triangle. */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/** Return side3 of triangle. */
	public double getSide3() {
		return side3;
	}

	/** Set side3 of triangle. */
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	@Override
	/** Return area of valid triangle. Return 0 if triangle is invalid. */
	public double getArea() {
		if ((side1 < (side2 + side3)) && (side2 < (side1 + side3)) && (side3 < (side1 + side2))) {
			double s = getPerimeter() / 2.0;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
		else {
			return 0;
		}
	}

	@Override
	/** Return perimeter of valid triangle. Return 0 if triangle is invalid. */
	public double getPerimeter() {
		if ((side1 < (side2 + side3)) && (side2 < (side1 + side3)) && (side3 < (side1 + side2))) {
			return side1 + side2 + side3;
		}
		else {
			return 0;
		}
	}
	
	@Override
	/** Return description of triangle. */
	public String toString() {
		if ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2)) {
			return "Valid triangle with sides " + side1 + ", " + side2 + ", and " + side3 + ".";
		}
		else {
			return "Invalid triangle with sides " + side1 + ", " + side2 + ", and " + side3 + ".";
		}
	}
}
