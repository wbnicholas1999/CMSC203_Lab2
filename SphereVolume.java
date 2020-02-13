import java.util.Scanner;

public class SphereVolume
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner calculation = new Scanner (System.in);
		String diameter;
		float radius;
		double volume;
		
		System.out.print("Enter the diameter: ");
		diameter = calculation.next();
		double diam = Double.parseDouble(diameter);
		
		radius = (float) (diam / 2);
		
		volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("\nThe volume is " + volume);
	}
}
