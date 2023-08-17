package week2testsrc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week2src.Car;
import week2src.Car2;

class Car2test {

	@Test
	void testSetOwner() {
		
	}

	@Test
	void testGetOwner() {
		
	}

	@Test
	void testGetFulln() {
		
	}

	@Test
	void testSetFulln() {
		
	}

	@Test
	void testSetModel() {
	     Car2 c = new Car2("Peugeot", 35, 1.2);

	        c.setModel("Audi");

	        //assertTrue(c.getModel() == "Peugeot");
	        assertEquals(c.getModel(), "Audi");
	}

	@Test
	void testGetModel() {
		  Car2 c = new Car2("Peugeot", 35, 1.2);
	        c.getModel();
	        assertTrue(c.getModel() == "Peugeot");
	        assertFalse(c.getModel() == "Audi");
	}

	@Test
	void testSetTankSize() {
		Car2 c = new Car2("Peugeot", 35, 1.2);
        assertEquals(c.getTankSize(), 35, 0.001);
	}

	@Test
	void testGetTankSize() {
		  Car2 c = new Car2("Peugeot", 35, 1.2);
	        assertEquals(c.getTankSize(), 35, 0.001);
	}

	@Test
	void testSetGPL() {
	
	}

	@Test
	void testGetGPL() {
		
	}

	@Test
	void testEstimateDistance() {
		Car2 c = new Car2("Peugeot", 35, 1.2);
        assertEquals(c.estimateDistance(),9.24, 0.001); 
	}

}
