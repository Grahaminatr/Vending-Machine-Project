import java.util.Scanner;


public class Cashier extends java.lang.Object
	{
	private static int toPennies;
	private static double currentTotal;
	private static int moneyAdded;
	private static double newMoney;
	private static boolean stillEntering = true;
	private static String yesOrNo;
	public static void insertMoney()
		{
		while (stillEntering)
			{
			System.out.println("Which coin would you like to insert?");
			System.out.println("(1)Quarter");
			System.out.println("(2)Dime");
			System.out.println("(3)Nickel");
			System.out.println("(4)Penny");
			Scanner userInput1 = new Scanner(System.in);
			moneyAdded = userInput1.nextInt();	
			if (moneyAdded == 1)
				{
				newMoney = .25;
				}
			else if (moneyAdded == 2)
				{
				newMoney = .1;
				}
			else if (moneyAdded == 3)
				{
				newMoney = .05;
				}
			else if (moneyAdded == 4)
				{
				newMoney = .01;
				}
			else
				{
				System.out.println("Whoops... You didn't select an existing option.");
				newMoney = .00;
				}
			currentTotal = currentTotal + newMoney;
			System.out.println("You have entered $" + currentTotal);
			System.out.println("Are you done entering money? Yes or No.");
			Scanner userInput2 = new Scanner(System.in);
			yesOrNo = userInput2.next();	
			switch (yesOrNo)
				{
				case "Yes":
				case "yes":
				case "YEs":
				case "YES":
				System.out.println("Ok.");
				stillEntering = false;
				break;
				case "NO":
				case "No":
				case "no":
				System.out.println("Ok.");
				}
			 
			}
		}
	}
