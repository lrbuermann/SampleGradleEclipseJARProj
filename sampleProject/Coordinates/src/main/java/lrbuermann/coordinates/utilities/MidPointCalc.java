package lrbuermann.coordinates.utilities;
import java.util.ArrayList;

import lrbuermann.coordinates.beans.Coordinate;
/**
 * 
 * @author lrbuermann
 * @version 0.0.1 7/31/15
 * This class will be a utility class to isolate logic
 * for calculating midpoints of various numbers of coordinates
 * All coordinates are assumed to have equal weight.
 */
public class MidPointCalc {
	/**
	 * 
	 * @param coordinates the coordinates for which to find a mid point
	 * @return MidPoint the Coordinate that is the midpoint of all coordinates
	 */
	public static Coordinate getMidPoint(ArrayList<Coordinate> coordinates){
		if(coordinates.size() <=1){
			throw new IllegalArgumentException("The number of coordinates is less than 2, must have at least 2 points to find a midpoint.");
		}
		double x=0;
		double y=0;
		double weight = coordinates.size();
		for(Coordinate c:coordinates ){
			x+=c.getX();
			y+=c.getY();
		}
		x=x/weight;
		y=y/weight;
		return new Coordinate(x,y);
	}
}
