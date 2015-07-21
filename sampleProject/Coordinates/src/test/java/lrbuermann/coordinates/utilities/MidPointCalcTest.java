package lrbuermann.coordinates.utilities;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import lrbuermann.coordinates.beans.Coordinate;
import lrbuermann.coordinates.utilities.MidPointCalc;
/**
 * 
 * @author lrbuermann
 * @version 0.0.1 7/20/15
 * This JUnit test validates that the MidPointCalc class
 * functions as expected
 */
public class MidPointCalcTest {
	ArrayList<Coordinate> coordinates;
	@Before
	public void setUp(){
		coordinates = new ArrayList<Coordinate>();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getMidPointFailsOnEmptyArray(){
		MidPointCalc.getMidPoint(coordinates);
	}
	@Test(expected=IllegalArgumentException.class)
	public void getMidPointFailsOnLessThan2Coordinates(){
		coordinates.add(new Coordinate(1,1));
		
		MidPointCalc.getMidPoint(coordinates);
	}
	@Test
	public void getMidPointCalculatesCorrectly(){
		coordinates.add(new Coordinate(1,1));
		coordinates.add(new Coordinate(2,2));
		coordinates.add(new Coordinate(1,3));
		
		Coordinate answer = new Coordinate(4.0/3.0,6.0/3.0);
		
		Coordinate result = MidPointCalc.getMidPoint(coordinates);
		assertEquals(answer,result);
	}

}
