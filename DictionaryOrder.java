import java.util.Scanner;

public class DictionaryOrder {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String name, lowerCase;

		System.out.print( "Make up the name of a programming language! " );
		name = keyboard.nextLine();
		lowerCase = name.toLowerCase();

		if ( lowerCase.compareTo("c++") < 0 )
			System.out.println( name + " comes BEFORE c++" );
		if ( lowerCase.compareTo("c++") == 0 )
			System.out.println( "c++ isn't a made-up language!" );
		if ( lowerCase.compareTo("c++") > 0 )
			System.out.println( name + " comes AFTER  c++" );

		if ( lowerCase.compareTo("go") < 0 )
			System.out.println( name + " comes BEFORE go" );
		if ( lowerCase.compareTo("go") == 0 )
			System.out.println( "go isn't a made-up language!" );
		if ( lowerCase.compareTo("go") > 0 )
			System.out.println( name + " comes AFTER  go" );

		if ( lowerCase.compareTo("java") < 0 )
			System.out.println( name + " comes BEFORE java" );
		if ( lowerCase.compareTo("java") == 0 )
			System.out.println( "java isn't a made-up language!" );
		if ( lowerCase.compareTo("java") > 0 )
			System.out.println( name + " comes AFTER  java" );

		if ( lowerCase.compareTo("lisp") < 0 )
			System.out.println( name + " comes BEFORE lisp" );
		if ( lowerCase.compareTo("lisp") == 0 )
			System.out.println( "lisp isn't a made-up language!" );
		if ( lowerCase.compareTo("lisp") > 0 )
			System.out.println( name + " comes AFTER  lisp" );

		if ( lowerCase.compareTo("python") < 0 )
			System.out.println( name + " comes BEFORE python" );
		if ( lowerCase.compareTo("python") == 0 )
			System.out.println( "python isn't a made-up language!" );
		if ( lowerCase.compareTo("python") > 0 )
			System.out.println( name + " comes AFTER  python" );

		if ( lowerCase.compareTo("ruby") < 0 )
			System.out.println( name + " comes BEFORE ruby" );
		if ( lowerCase.compareTo("ruby") == 0 )
			System.out.println( "ruby isn't a made-up language!" );
		if ( lowerCase.compareTo("ruby") > 0 )
			System.out.println( name + " comes AFTER  ruby" );

		if ( lowerCase.compareTo("visualbasic") < 0 )
			System.out.println( name + " comes BEFORE visualbasic" );
		if ( lowerCase.compareTo("visualbasic") == 0 )
			System.out.println( "visualbasic isn't a made-up language!" );
		if ( lowerCase.compareTo("visualbasic") > 0 )
			System.out.println( name + " comes AFTER  visualbasic" );
	}
}
