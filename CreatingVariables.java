public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title;
		int height = 70;
		double randomNum = 8.3873493;
		String favAppliance = "Rice Cooker";
		String favPokerHand = "AK";

		x = 10;
		y = 400;
		age = 34;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;

		firstName = "Matthew";
		lastName = "Gmur";
		title = "Mr.";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "My favorite appliance is the " + favAppliance + " and my favorite poker hand is " + favPokerHand + ".");
		System.out.println( "I am " + height + " inches tall. Random number: " + randomNum );
	}
}
