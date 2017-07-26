package chooseAdventure;

import java.util.Scanner;

public class ChooseAdventure {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//page 1
		System.out.println("Where do you want to eat at: Chipotle (A) or Mediterranean Food (B)");
		String pageOneResp = input.nextLine();
		if(pageOneResp.equalsIgnoreCase("A")){
			//go to page 2 (chipotle selection)
			System.out.println("You choose Chipotle would you like a: Burrito (A) or Bowl (B)");
			String pageTwoResp = input.nextLine();
			if (pageTwoResp.equalsIgnoreCase("A")){
				//Choose a meat for the burrito: chicken or steak
				System.out.println("What meat would you like for your burrito? Chicken (A) or Steak (B)");
				String pageFourResp = input.nextLine();
				if (pageFourResp.equalsIgnoreCase("A")){
					// you have a chicken burrito
					System.out.println("You orderd a Chipotle Chicken Burriot");
				}else if (pageFourResp.equalsIgnoreCase("B")){
					//you have a steak burrito
					System.out.println("You ordered a Chipotle Steak Burrito");
				}
				else{
					System.out.println("you put in a wrong answer");
				}
			}else if (pageTwoResp.equalsIgnoreCase("B")){

				// choose a meat for bowl: veggie or pork
				System.out.println("What meat would you like for your bowl? Veggit (A) or Pork (B)");
				String pageFiveResp = input.nextLine();
				if (pageFiveResp.equalsIgnoreCase("A")){
					// you have a veggie bowl
					System.out.println("You ordered a Chipotle Veggie Bowl");
				}else if (pageFiveResp.equalsIgnoreCase("B")){
					//you have a Pork bowl
					System.out.println("You ordered a Chipotle Pork Bowl");
				}
				else{
					System.out.println("you put in a wrong answer");
				}
			}else{
				System.out.println("you put in a wrong answer");
			}

		}else if(pageOneResp.equalsIgnoreCase("B")){
			//go to page 3 Mediterranean selection
			System.out.println("You choose Mediterranean Food would you like a: (A) Kaboob or (B) Gyro");
			String pageThreeResp = input.nextLine();
			if (pageThreeResp.equalsIgnoreCase("A")){
				//Chose a meat chicken or lamb 
				System.out.println( "You choose (A) Chicken or (B) Lamb");
				String pageSixResp = input.nextLine();
				if (pageSixResp.equalsIgnoreCase( "A")){
					// under a we have chicken 
					System.out.println("You ordered a Mediterranean Chicken Kaboob");
				}else if (pageSixResp.equalsIgnoreCase("B")) {
					// under b we have lamb
					System.out.println("You ordered a Mediterranean Lamb Kaboob");
				}else {
					System.out.println("you put in a wrong answer");
				}

			}else if (pageThreeResp.equalsIgnoreCase("B")){

				// choose b steak or lamb
				System.out.println("You chooce (a) Steak or (b) Lamb");
				String pageSevenResp = input.nextLine();
				if (pageSevenResp.equalsIgnoreCase("A")){
					//you chose steak
					System.out.println("You ordered a Steak Gyro");
				}else if(pageSevenResp.equalsIgnoreCase("B")){
					// you chose lamb
					System.out.println("You ordered a Lamb Gyro");
				}else {
					System.out.println("you put the wrong answer");
				}
			}else{
				System.out.println("you put in a wrong answer");
			}

		}
		else{
			System.out.println("you put in a wrong answer");
		}
		System.out.println("You're done ordering");
	}
}