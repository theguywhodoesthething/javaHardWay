import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi, ft, in, lb, m, kg;

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

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
