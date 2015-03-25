package AreaOfCircle;
import java.math.*;

public class AreaOfCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(area(23.3));
		System.out.println(area(0));

	}

	public static double area(double radius) {
		double area;
		if(radius > 0){
			area = (Math.PI * Math.pow(radius, 2));
			return area;
		}else{
			throw new IllegalArgumentException("radius must be greater than zero");
		}
		
	}

}
