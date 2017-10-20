package CSC1021_Assignment;
import java.util.Scanner;

public class RatingApp_Tester {

	static Scanner in = new Scanner(System.in);
	
	//Main method
	public static void main(String[] args)
	{
		//Below is the initial menu that prints at the start of the program
		SeriesLibrary seriesLibrary = new SeriesLibrary();
			System.out.println("-------MENU------");
			System.out.println("1: List All Shows");
			System.out.println("2: Add New Show");
			System.out.println("3: Edit A Series");
			System.out.println("4: Rate A Series");
			System.out.println("5: Quit");	
			//The below boolean checks whether the user has selected the number 5 or not, and if they have it will exit the application.
			boolean exitApplication = false;
			while(exitApplication == false)
			{//The below bit of code checks the users input and then runs the corresponding method
				System.out.println("Select Option: ");
				int input = in.nextInt();
				switch(input) 
				{
					case 1: seriesLibrary.printAllTvShows();
							break;
					case 2: seriesLibrary.addTvSeries(in);
							break;
					case 3: seriesLibrary.editTvSeries(in);
							break;
					case 4: seriesLibrary.rateTvSeries(in);
							break;
					case 5: exitApplication = true;//This is where the boolean gets activated if the user selects 5
							break;
					default:
							printConsoleOptions();
							break;
				}
				printConsoleOptions();// after the user has finished with the method they selected it will call the menu method.
			}
			System.out.println("Exit Application");
			System.exit(0);
		
	}
	
	//this is the menu that is called after the end of each method
	private static void printConsoleOptions()
	{
		System.out.println("\n1: List All Shows");
		System.out.println("2: Add New Show");
		System.out.println("3: Edit A Series");
		System.out.println("4: Rate A Series");
		System.out.println("5: Quit");
	}
}
