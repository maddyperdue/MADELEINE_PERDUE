import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the side: ");
		side = kb.nextDouble();
		
		calcSurfaceArea();
		print();
	}
	
	public static void calcSurfaceArea()
	{
		sa = 
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %10.5f", sa);
	}
}