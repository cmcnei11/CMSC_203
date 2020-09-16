package wifiDiagnosis;

import java.util.Scanner;

public class WiFiDiagnosis{


	public static void main(String[] args) {
		
		String response;
		
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("First Step: Reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		response = stdin.nextLine();
		if( response.charAt(0) == 'y') 
			System.out.println("Rebooting your computer seemed to work");
		else {
			
		
			System.out.println("Second Step: Reboot your router");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			response = stdin.nextLine();
			if( response.charAt(0) == 'y') 
				System.out.println("Rebooting your router seemed to work");
			else {
				
				System.out.println("Third Step: Make sure the cables connecting your router are firmly plugged in and power is getting to the router");
				System.out.println("Are you able to connect with the internet? (yes or no)");
				response = stdin.nextLine();
				if( response.charAt(0) == 'y') 
					System.out.println("Checking your cables seemed to work");
				else {
					
					System.out.println("Forth Step: Move the computer closer to the router");
					System.out.println("Are you able to connect with the internet? (yes or no)");
					response = stdin.nextLine();
					if( response.charAt(0) == 'y') 
						System.out.println(" Moving the computer closer to the router seemed to work");
					else
						System.out.println("Fifth Step: contact your ISP\nMake sure your ISP is hooked up to your router.");
				}
			}	
		
		}
		

	}
}
	

