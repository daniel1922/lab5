		/*Updates Needed
           *1. Explore random class instead of Math.random
           *2. Add user ability to enter # of sides on dice
           *3. Add special messages to use Dice Roller for other games
           *4. Remove "Your total roll is 0" from the console  */
           
import java.util.Scanner;

public class Dice {
	       
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);	
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (yes/no):");
		
		int die1; //die1 will deliver first value
		int die2; //die2 will deliver second value
		int roll = 0;
		
		String continueLoop;
		
		do{ //do-while loop initializes roll 	
		die1 = (int)(Math.random()*6) + 1; //Math.random used to generate random numbers on dice
		die2 = (int)(Math.random()*6) + 1;
		
		System.out.println("The first die comes up " + die1);
		System.out.println("The second die comes up " + die2);
		System.out.println("Your total roll is " + roll);
		
		System.out.println("Continue(yes/no): ");
		continueLoop = input.nextLine();
		
	}		
		while(continueLoop.equalsIgnoreCase("yes"));
		//close while loop
		System.out.println("Bye!");
		input.close(); 	
	
	}
}
          