import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, answer;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		System.out.print("Where are you learning to program?");
		answer = keyboard.next();
		
		System.out.print("You are learning to program at " + answer);
		
		//When entering an int when the program expects a double: the program adds a . to the int making it a double
		//When entering a number when the program expects a string: the program stores the number as a string ie "7"
		//How to blow up every question: name, age, weight, income just type any letter
	}
}
