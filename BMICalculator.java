import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, ft, in, lb;

		System.out.print( "Your height in feet: " );
		ft = keyboard.nextDouble();
		
		System.out.print( "Your height in inches: " );
		in = keyboard.nextDouble();
		m = (ft*0.3048)+(in*0.0254);

		System.out.print( "Your weight in pounds: " );
		lb = keyboard.nextDouble();
		kg = lb*0.454;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}
