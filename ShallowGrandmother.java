import java.util.Scanner;

public class ShallowGrandmother {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age, yourAnswer;
		double income, cute;
		boolean allowed, allowed2;

		System.out.print( "Enter your age: " );
		age = keyboard.nextInt();

		System.out.print( "Enter your yearly income: " );
		income = keyboard.nextDouble();

		System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );

		System.out.println( "Allowed to date my grandchild? " + allowed );

		System.out.print( "How happy does she make you on a scale from 1 to 10?" );
		yourAnswer = keyboard.nextInt();
		allowed2 = ( age > 25 && age < 40 && yourAnswer > 7 );

		System.out.println( "Allowed to date my grandchild? " + allowed2 );
	}
}
