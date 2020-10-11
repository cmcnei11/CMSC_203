package rng;

import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RNG r1 = new RNG();
		RNG.scan = new Scanner(System.in);
		
		int magicNum ;
		int guess;
		int low =0;
		int high = 100;
		String prevGuess = "";
		boolean again = true;
		String playAgain = "";
		
		while(again == true) {
			
			magicNum = r1.rand();
			System.out.println("Enter first guess");
			guess = RNG.scan.nextInt();
			
			if(RNG.inputValidation(guess,low, high) == true) {
					while(guess != magicNum) {
						
							
							if(guess > magicNum) {
							high = guess;
							prevGuess = "Your guess is too high";
							}
							else if(guess < magicNum) {
							low = guess;
							prevGuess = "Your guess is too low";
							}
							
							
						
						System.out.print("Number of guesses is " + (r1.getCount() -1)+ "\n"+ prevGuess + "\nEnter your next guess between " + low + " and " + high+ "\n");
						guess = RNG.scan.nextInt();
						RNG.inputValidation(guess, low, high);
						
				}
			}
					System.out.print("Congratulations, you guessed correctly\nTry again? (yes or no)\n");
					playAgain = r1.scan.nextLine();
					playAgain =r1.scan.nextLine();
					if(playAgain.charAt(0)== 'y' ) {
						again = true;
					low = 0;
					high =100;
					}
					else if(playAgain.charAt(0) == 'n')
						again =false;
				
		
				
		}
		System.out.println("Thanks for playing...");
		
		
		
		
		
	}
	
	
	

}
