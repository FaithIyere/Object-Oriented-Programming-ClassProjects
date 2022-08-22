//Faith Iyere
//April 10,2022
//BINS 5
		import java.util.List;
		import java.util.Random;
		import java.util.ArrayList;


		public class DELETE {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables and initialize array and list
		Random random = new Random();
		int randomNumber;
		String computerResult, playerResult;

		List<Integer> allComputerDice = new ArrayList<Integer>();
		List<Integer> allPlayerDice = new ArrayList<Integer>();



		int[]computer = new int [6];
		int[] player = new int [6];

		//use a for loop to generate 5 random numbers and record number count in array
		for(int i = 0; i<5; i++)
		{
		randomNumber = random.nextInt(6);
		computer[randomNumber] += 1;
		allComputerDice.add(randomNumber);
		}

		//use a for loop to generate 5 random numbers and record number count in array
		for(int i = 0; i<5; i++) {
		randomNumber = random.nextInt(6);
		player[randomNumber] += 1;
		allPlayerDice.add(randomNumber);
		}

		//get the maximum count for each player
		int maxValueForComputer = maximum(computer);
		int maxValueForPlayer = maximum(player);

		//Assigning names to each potential result for computer
		if (maxValueForComputer == 5)
		{
		computerResult = "Five of a kind";
		}

		else if (maxValueForComputer == 4)
		{
		computerResult = "Four of a kind";
		}

		else if (maxValueForComputer == 3)
		{
		computerResult = "Three of a kind";
		}

		else if (maxValueForComputer == 2)
		{
		computerResult = "A Pair";
		}

		else
		{
		computerResult = "All singles";
		}

		//Assigning names to each potential result of the player
		if (maxValueForPlayer == 5)
		{
		playerResult = "Five of a kind";
		}

		else if (maxValueForPlayer == 4)
		{
		playerResult = "Four of a kind";
		}

		else if (maxValueForPlayer == 3)
		{
		playerResult = "Three of a kind";
		}

		else if (maxValueForPlayer == 2)
		{
		playerResult = "A Pair";
		}

		else
		{
		playerResult = "All singles";
		}

		//display results

		System.out.println("Computer rolled: " + allComputerDice);
		System.out.println("Player rolled:   " + allPlayerDice);
		System.out.println("Computer has:   " + computerResult);
		System.out.println("Player has: " + playerResult);


		if(maxValueForComputer > maxValueForPlayer) {
		System.out.println("Computer wins");

		}

		else if(maxValueForPlayer > maxValueForComputer)
		{
		System.out.println("You win");
		}

		else
		{
		System.out.println("It's a tie");
		}


		}

		//create a method to determine the maximum dice count of dice rolled
		static int maximum(int [] arr)
		{
		int maxVal = 0;

		for(int i = 0; i < arr.length; i++)
		{
		maxVal = Math.max(maxVal, arr[i]);
		}

		return maxVal;
		  }

		}