package lrbuermann.coordinates.beans;
/**
 * 
 * @author lrbuermann
 * @version 0.0.1 7/31/15
 * This class will represent a GPS coordinate.
 * For simplicity, this will be a simple 2D point for now
 */
public class Coordinate {

	private double x;
	private double y;
	/**
	 * Default constructor sets x,y to 0,0
	 */
	public Coordinate(){
		x=0;
		y=0;
	}
	public Coordinate(double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
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
		Coordinate other = (Coordinate) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
}
