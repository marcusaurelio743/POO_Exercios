package util;

public class Calculator {
	public static final double PI = 3.14159;
	
	public static Double circunference(double radius) {
		return 2.0 * PI*radius;
	}
	
	public static Double volume(double radius) {
		return 4.00 * PI * radius * radius * radius / 3.00;
	}
}
