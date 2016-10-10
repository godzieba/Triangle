package pkgTriangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetPerimeter() {
		Triangle a = new Triangle();
		assertTrue(a.getPerimeter() == 3);
		
		Triangle b = new Triangle(3, 4, 5);
		assertTrue(b.getPerimeter() == 12);
		
		Triangle c = new Triangle(1, 2, 4);
		assertTrue(c.getPerimeter() == 0);
		
		Triangle d = new Triangle();
		d.setSide1(1);
		d.setSide2(2);
		d.setSide3(4);
		assertTrue(d.getPerimeter() == 0);
		
		Triangle e = new Triangle();
		d.setSide1(4);
		d.setSide2(7);
		d.setSide3(6);
		assertTrue(d.getPerimeter() == 17);
	}
	
	@Test
	public void testGetArea() {
		Triangle a = new Triangle();
		assertTrue(a.getArea() == Math.sqrt(3.0 / 16.0));
		
		Triangle b = new Triangle(3.0, 4.0, 5.0);
		assertTrue(b.getArea() == Math.sqrt(36.0));
		
		Triangle c = new Triangle(1.0, 2.0, 4.0);
		assertTrue(c.getArea() == 0);
		
		Triangle d = new Triangle();
		d.setSide1(1);
		d.setSide2(2);
		d.setSide3(4);
		assertTrue(d.getArea() == 0);
		
		Triangle e = new Triangle();
		d.setSide1(4);
		d.setSide2(7);
		d.setSide3(6);
		assertTrue(d.getArea() == Math.sqrt(2295.0 / 16.0));
	}


}
