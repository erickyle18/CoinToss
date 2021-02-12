import java.security.SecureRandom;
import java.util.Scanner;

public class CoinToss {
	
	//enum to represent coin which can be heads or tails
	private enum Coin{HEADS, TAILS};
	
	public static void main(String[] args) {
		
		
		//create scanner object
		Scanner input = new Scanner(System.in); 
		
		//Display the menu for the game and prompt user to choose an option
		System.out.println("1. Toss Coin");
		System.out.println("2. Exit");
		System.out.print("Choose an option: ");
		int option = input.nextInt();
		
		while(option != 2)
		{
			System.out.print(toss());
			
			System.out.println("\n\n1. Toss Coin");
			System.out.println("2. Exit");
			System.out.print("Choose an option: ");
			option = input.nextInt();
		}
		
		if(option == 2)
			System.out.println("Please come again...");
		
		
		
		
	}
	
	public static Coin toss()
	{
		//create secure random number object
		SecureRandom randomNum = new SecureRandom();
		
		Coin coinSide;
		
		int side = 1 + randomNum.nextInt(3);
		
		if(side == 1)
			coinSide = Coin.HEADS;
		else
			coinSide = Coin.TAILS;
		
		return coinSide;
		
	}

}
