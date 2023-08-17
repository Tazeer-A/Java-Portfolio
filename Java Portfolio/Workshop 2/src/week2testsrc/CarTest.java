package week2testsrc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week2src.Car;

class CarTest {

	@Test
	void testCar() {
	      Car c = new Car("Peugeot", 35, 1.2);
	      assertEquals(c.getModel(), "Peugeot");
	    
	}

	@Test
	void testSetModel() {
        Car c = new Car("Peugeot", 35, 1.2);

        c.setModel("Audi");

        //assertTrue(c.getModel() == "Peugeot");
        assertEquals(c.getModel(), "Audi");
	}

	@Test
	void testGetModel() {
        Car c = new Car("Peugeot", 35, 1.2);
        c.getModel();
        assertTrue(c.getModel() == "Peugeot");
        assertFalse(c.getModel() == "Audi");
	}

	@Test
	void testSetTankSize() {
	      Car c = new Car("Peugeot", 35, 1.2);
	        assertEquals(c.getTankSize(), 35, 0.001);
	}

	@Test
	void testGetTankSize() {
	       Car c = new Car("Peugeot", 35, 1.2);
	        assertEquals(c.getTankSize(), 35, 0.001);
	}

	@Test
	void testEstimateDistance() {
        Car c = new Car("Peugeot", 35, 1.2);
        assertEquals(c.estimateDistance(),9.24, 0.001); 
	}

}
