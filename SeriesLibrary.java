package CSC1021_Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class SeriesLibrary {

	ArrayList<TVSeries> seriesLibrary;

	public SeriesLibrary() 
	{
		seriesLibrary = new ArrayList<TVSeries>();
		ArrayList<String> tvActors = new ArrayList<String>();//this is the array for the actors
		tvActors.add("John Snow");//this is the method used to add a method to the actor array list
		tvActors.add("Sansa Stark");
		ArrayList<String> tvEpisodes = new ArrayList<String>();//this is the array list for the episodes
		tvEpisodes.add("Winter is coming");//this is the method used to add an episode to the arrayList of episodes
		tvEpisodes.add("Winter has come");
		ArrayList<Integer> tvReview = new ArrayList<Integer>();//this is the arrayList that stores the reviews for the tv show
		tvReview.add(10);//this is the method to add the reviews
		tvReview.add(9);
		
		seriesLibrary.add(new TVSeries("Game of Thrones", "18", tvEpisodes, tvActors, tvReview, TVSeries.Genre.ADVENTURE));//this is the object that creates the tv show using all the variables
	}
	
	//this is the method that adds the tv shows that the user has provided information for
	public void addTvSeries(Scanner in) 
	{
		
		
		boolean finishedAddingTvShow = false;
		in.nextLine();
		//Title
		System.out.print("Enter a title: ");
		String title = in.nextLine();
		//Rating
		System.out.print("Enter a rating: ");
		String rating = in.nextLine();
		//Genre
		System.out.print("Select a Genre: 1: COMEDY\t2: THRILLER\n\t\t3: ACTION\t4: ADVENTURE\n\t\t5: DRAMA ");//I added \t and \n to make it neat
		String genre = in.nextLine();
		TVSeries.Genre genretv;
		//if statement to determine what the user has inputted and then as assign the input to its required enum genre
		if(genre.equals("1"))
		{
			genretv = TVSeries.Genre.COMEDY;
		}
		else if(genre.equals("2"))
		{
			genretv = TVSeries.Genre.THRILLER;
		}
		else if(genre.equals("3"))
		{
			genretv = TVSeries.Genre.ACTION;
		}
		else if(genre.equals("4"))
		{
			genretv = TVSeries.Genre.ADVENTURE;
		}
		else if(genre.equals("5"))
		{
			genretv = TVSeries.Genre.DRAMA;
		}
		else
		{
			genretv = null;
		}
		
		//method to add an actor
		ArrayList<String> actors = new ArrayList<String>();//ArrayList to store the new actors 
		//boolean was used along side a while loop therefore the loop would run until the variable was changed to true which happens at the end of the method
		boolean finisedAddingActors = false;
		while(finisedAddingActors == false)
		{
			System.out.println("Add List of actors");
			String actorName = in.nextLine();
			actors.add(actorName);//adds to the array above
			System.out.println("Do you want to add extra actor: Y:Yes - N:No");
			String decsion = in.nextLine();
			if(decsion.equalsIgnoreCase("N"))/*if statement that checks if the user has entered in "n" and if they have changes the boolean to true which finishes the method
												, if the user enters "y" then the method will run again**/
			{
				finisedAddingActors = true;
			}//end of the method to add an actor
		}
		//method to add an episode
		ArrayList<String> episodes = new ArrayList<String>();//ArrayList to store the new episodes
		//boolean was used along side a while loop therefore the loop would run until the variable was changed to true which happens at the end of the method
		boolean finisedAddingEpisodes = false;
		while(finisedAddingEpisodes == false)
		{
			System.out.println("Add List of episodes");
			String episodeName = in.nextLine();
			episodes.add(episodeName);//adds to the array above
			System.out.println("Do you want to add an extra episode?: Y:Yes - N:No");
			String decsion = in.nextLine();
			if(decsion.equalsIgnoreCase("N"))/*if statement that checks if the user has entered in "n" and if they have changes the boolean to true which finishes the method
												, if the user enters "y" then the method will run again**/
			{
				finisedAddingEpisodes = true;
			}//end of method to add an episode
		}

		
		//method to add a rating
		ArrayList<Integer> ratings = new ArrayList<Integer>();//ArrayList to store the new ratings
		//boolean was used along side a while loop therefore the loop would run until the variable was changed to true which happens at the end of the method
		boolean finisedAddingRatings = false;
		while(finisedAddingRatings == false)
		{
			System.out.println("Add List of Ratings, please ensure the input is an integer and less than or equal to 10.");
			int ratingName = in.nextInt();
			ratings.add(ratingName);//adds to the array above
			in.nextLine();
			System.out.println("Do you want to add extra Ratings: Y:Yes - N:No");
			String decsion = in.nextLine();
			if(decsion.equalsIgnoreCase("N"))/*if statement that checks if the user has entered in "n" and if they have changes the boolean to true which finishes the method
												, if the user enters "y" then the method will run again**/
			{
				finisedAddingRatings = true;
			}//end of the rating method
		}
		
		//this adds the newly created object filled with the users input into the serisLibrary array, therefore it gets added tot he array and added to the system
		seriesLibrary.add(new TVSeries(title, rating, episodes, actors, ratings, genretv ));
		
		System.out.println("Tv Show added!");
		return;
				//end of add a tv show method
	}
	
	//edit tv series method
	public void editTvSeries(Scanner in)
	{
		in.nextLine();
		//Title
		System.out.print("Enter a Title of TV show you want to edit: ");
		String tvShowName = in.nextLine();
		
		for(int i=0; i<seriesLibrary.size(); i++)//this for loop checks against ever pre exsisting instance in the array to find the one the user entered
		{
			if(tvShowName.equalsIgnoreCase(seriesLibrary.get(i).getTitle()))/*this makes sure when the user enters in the input it wont matter if it has 
																			the wrong case i.e its not case sensitive, it also makes sure the show the 
																			user entered is in the arrayList**/
			{
				System.out.println("TV Show Found!");
				System.out.println("\nWhat do you want to edit: \n1. TV Show Title\n2. Rating\n3. Tv Show Genre");
				String option = in.nextLine();
				if(option.equals("1"))//if statement that checks what the user has inputted then calls the corresponding method
				{//the below code allows the user to edit the name of the tv show
					System.out.println("1");
					System.out.println("Enter new Title for "+seriesLibrary.get(i).getTitle()+":");//
					String title = in.nextLine();
					seriesLibrary.get(i).setTitle(title);
				}
				else if(option.equals("2"))
				{//the below code allows the user to edit the rating of the tv show
					System.out.println("2");
					System.out.println("Replace this rating: "+seriesLibrary.get(i).getRating());
					String rating = in.nextLine();
					seriesLibrary.get(i).setRating(rating);
				}
				else if(option.equals("3"))
				{//the below code allows the user to edit the rating of the tv show
					System.out.println("Replace this genre: "+seriesLibrary.get(i).getGenre().toString());
					System.out.print("Select a Genre: 1: COMEDY\t2: THRILLER\n\t\t3: ACTION\t4: ADVENTURE\n\t\t5: DRAMA ");
					String genre = in.nextLine();
					TVSeries.Genre genretv;
					if(genre.equals("1"))//if statement that checks what the user has inputted and then changes the genre to the corresponding one
					{
						genretv = TVSeries.Genre.COMEDY;
						seriesLibrary.get(i).setGenre(TVSeries.Genre.COMEDY);;
					}
					else if(genre.equals("2"))
					{
						genretv = TVSeries.Genre.THRILLER;
						seriesLibrary.get(i).setGenre(TVSeries.Genre.THRILLER);;
					}
					else if(genre.equals("3"))
					{
						genretv = TVSeries.Genre.ACTION;
						seriesLibrary.get(i).setGenre(TVSeries.Genre.ACTION);;
					}
					else if(genre.equals("4"))
					{
						genretv = TVSeries.Genre.ADVENTURE;
						seriesLibrary.get(i).setGenre(TVSeries.Genre.ADVENTURE);;
					}
					else if(genre.equals("5"))
					{
						genretv = TVSeries.Genre.DRAMA;
						seriesLibrary.get(i).setGenre(TVSeries.Genre.DRAMA);;
					}
					else
					{
						genretv = null;
					}
				}
				else
				{
					System.out.println("error");//validation that checks if the user enters the anything but a number between 1 and 5
				}
			}
		}
		//end of the edit method
	}
	
	//rate a method
	public void rateTvSeries(Scanner in)
	{
		in.nextLine();
		//Title
		System.out.print("Enter a Title of TV show you want to rate: ");
		String tvShowName = in.nextLine();
		
		for(int i=0; i<seriesLibrary.size(); i++)//for loop that checks against all pre exsisting instances of tv shows within the arrayList
		{
			if(tvShowName.equalsIgnoreCase(seriesLibrary.get(i).getTitle()))//ignores case sensitive check
			{
				System.out.println("Tv Show found. Please enter a rating.");
				int rating = in.nextInt();
				seriesLibrary.get(i).getListOfRatings().add(rating);//adds the rating to the arrayList
				System.out.println("Tv Show has been rated and added to the list of ratings for: " + tvShowName);
					
			}
		}
	}//End of rateTvSeries Method
	
	//list the tv shows method
	public void printAllTvShows() 
	{
		for(int i=0; i<seriesLibrary.size(); i++) 
		{
			System.out.println("---------------TV SHOWS-----------------");
			System.out.println("Title: " + seriesLibrary.get(i).getTitle());
			System.out.println("Rating: " + seriesLibrary.get(i).getRating());
			System.out.println("Genre: " + seriesLibrary.get(i).getGenre());
			System.out.println("Eisodes: " + seriesLibrary.get(i).getListOfEpisodes());
			System.out.println("Actors: " + seriesLibrary.get(i).getListOfActors());
			System.out.println("Ratings: " + seriesLibrary.get(i).getListOfRatings());
			System.out.println();
			}
	}//end of list tv show method
	
	
	
}
