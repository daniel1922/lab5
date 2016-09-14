import java.util.Scanner;

public class Dice {
	       
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);	
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (yes/no):");
		String enteredName = input.nextLine();
			
		int die1;
		int die2;
		int roll = 0;
		String continueLoop;
		do{	
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) + 1;
		
		System.out.println("The first die comes up " + die1);
		System.out.println("The second die comes up " + die2);
		System.out.println("Your total roll is " + roll);
		
		System.out.println("Continue(yes/no): ");
		continueLoop = input.nextLine();
	}		
		while(continueLoop.equalsIgnoreCase("yes"));
		}
	}

          