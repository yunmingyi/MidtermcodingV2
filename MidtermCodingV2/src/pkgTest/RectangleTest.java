package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import pkgShapes.Rectangle;

class RectangleTest extends TestCase {
	
	@Test
	public void Construction_Test() {
		Rectangle o1 = new Rectangle(3,5);
		assertEquals(o1.getiWidth(), 3);
		assertEquals(o1.getiLength(), 5);
		
	}
	//Test construction
	
	@Test
	public void GetterSetter_Test() {
		pkgShapes.Rectangle o1 = new pkgShapes.Rectangle(1,2);
		assertEquals(o1.getiWidth(), 1);
		assertEquals(o1.getiLength(), 2);
		
		o1.setiWidth(3);
		o1.setiLength(5);
		
		assertEquals(o1.getiWidth(), 3);
		assertEquals(o1.getiLength(), 5);
	}
	//Test getter and setter
	
	@Test
	public void Area_Test() {
		Rectangle o1 = new Rectangle(3,3);
		assertEquals(o1.area(), 9.0);
	}
	//Test area
	
	@Test 
	public void Perimeter_Test() {
		Rectangle o1 = new Rectangle(3, 4);
		assertEquals(o1.perimeter(), 14.0);
	}
	//Test perimeter
	
	@Test
	public void compareTo_Test() {
		ArrayList<Rectangle> arr = new ArrayList<Rectangle>();
		Rectangle o1 = new Rectangle(1,3);
		Rectangle o2 = new Rectangle(2,2);
		Rectangle o3 = new Rectangle(1,1);
		arr.add(o1);
		arr.add(o2);
		arr.add(o3);
		
		Collections.sort(arr);
		
		assertEquals(arr.get(0), o3);
		assertEquals(arr.get(1), o1);
		assertEquals(arr.get(2), o2);
		
	}
	//Test compareTo
	
}
