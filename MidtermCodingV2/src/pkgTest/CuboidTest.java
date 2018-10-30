package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pkgShapes.Cuboid;

class CuboidTest {

	@Test
	public void Construction_Test() {
		Cuboid c = new Cuboid(1, 2, 3);
	}
	
	@Test
	public void SetterGetter_Test() {
		Cuboid c = new Cuboid(1, 3, 2);
		assertEquals(c.getiWidth(), 1);
		assertEquals(c.getiLength(), 3);
		assertEquals(c.getiDepth(), 2);
		
		c.setiWidth(4);
		c.setiLength(3);
		c.setiDepth(5);
		assertEquals(c.getiWidth(), 4);
		assertEquals(c.getiLength(), 3);
		assertEquals(c.getiDepth(), 5);
	}
	// Test getter and setter
	
	@Test 
	public void Area_Test() {
		Cuboid c = new Cuboid(1, 1, 1);
		assertEquals(c.area(), 6);

	}
	//Test  area
	
	@Test
	public void Volume_Test() {
		Cuboid c = new Cuboid(2, 2, 2);
		assertEquals(c.volume(), 8);

	}
	//Test Volume

	@Test
	public void Perimeter_Test() {
		Cuboid c = new Cuboid(1,2,2);
		boolean thrown = false;
		try {
			c.perimeter();
		}catch (UnsupportedOperationException e) {
			thrown = true;
		}
		assertEquals(thrown, true);
	}
	//Test perimeter
	
	@Test
	public void SortByArea_Test() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		Cuboid o1 = new Cuboid(1,2,3);
		Cuboid o2 = new Cuboid(1,1,1);
		Cuboid o3 = new Cuboid(3,2,3);
		ar.add(o1);
		ar.add(o2);
		ar.add(o3);
		Collections.sort(ar, ar.get(0).new SortByArea());
		
		assertEquals(ar.get(0), o2);
		assertEquals(ar.get(1), o1);
		assertEquals(ar.get(2), o3);
		
	}
	//Test SortByArea
	
	@Test 
	public void SortByVolume_Test() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		Cuboid o1 = new Cuboid(1,2,3);
		Cuboid o2 = new Cuboid(1,1,1);
		Cuboid o3 = new Cuboid(3,2,3);
		ar.add(o1);
		ar.add(o2);
		ar.add(o3);
		Collections.sort(ar, ar.get(0).new SortByVolume());
		
		assertEquals(ar.get(0), o2);
		assertEquals(ar.get(1), o1);
		assertEquals(ar.get(2), o3);
		
	}
	//Test SortByVolume
}
