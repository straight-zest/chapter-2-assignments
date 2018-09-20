package week2_assignments;
import java.util.Scanner;
/*
 * Gabriel Carlile
 * 9/18
 * Radius and Area of a Circle
 */
public class Group_section {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double perimeter;
	double area;
	double radius;
	double pi;
	
	radius = 5.5;
	pi = 3.14;
	
	perimeter = 2*radius*pi;
	area = radius*radius*pi;
	System.out.println("A circle with a radius of 5.5 has a...\r\n" +
	"Perimeter of: " + perimeter + "\r\n" +
	"Area of: " + area);

	}

}
