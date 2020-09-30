/**
 * 
 */
package labs;
import java.util.Scanner;

/**
 * @author creep
 *
 */
public class MovieDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		Create a new object of type Scanner that reads from the keyboard
		Scanner keyboard = new Scanner(System.in);
		String str = "yes";
				
		while(str.charAt(0) == 'y'){
		
//		Create a new movie object
		Movie mv1 = new Movie();
//		Prompt the user to enter the title of a movie 
		System.out.println("Enter a movie title: ");
//		Read in the line that the user types	
//		Set the title in the movie object
		mv1.setTitle(keyboard.nextLine());
//		Prompt the user to enter the movie’s rating
		System.out.println("Enter a movie rating: ");
//		Read in the line that the user types
//		Set the rating in the movie object
		mv1.setRating(keyboard.nextLine());
//		Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter number of tickets sold: ");
//		Read in the integer that the user types
//		Set the number of tickets sold in the movie object
		mv1.setSoldTickets(keyboard.nextInt());
		
//		Print out the information using the movie’s toString method
		System.out.println(mv1);
		
		System.out.println("Do you want to continue? (y or n)");
		str = keyboard.next();
		keyboard.nextLine();
		
		
	}
		System.out.print("Goodbye");
		
	}

}
