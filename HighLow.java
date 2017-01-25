import java.util.Scanner;

public class HighLow {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;
		String hl = "error";

		secret = 1 + (int)( 100*Math.random() );

		System.out.println( "I'm thinking of a number between 1-100." );
		System.out.println( "Try to guess it!" );
		System.out.print( "> " );
		guess = keyboard.nextInt();

		while ( secret != guess ) {

			if ( guess < secret )
				hl = "low";
			if ( guess > secret )
				hl = "high";

			System.out.print( "Sorry, your guess is too " + hl + ".\n");
			System.out.println( "Please try again!" );
			System.out.print( "> " );
			guess = keyboard.nextInt();

		}

		System.out.println( "You guessed it! What are the odds?!?" );
	}
}
