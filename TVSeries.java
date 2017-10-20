package CSC1021_Assignment;
import java.util.ArrayList;

public class TVSeries {
	
	//Genre Enum, This is where the genres are stored, instead of a seperate enum class
	public enum Genre {COMEDY, THRILLER, DRAMA, ACTION, ADVENTURE;}
	//Instance variables
	private String title;
	private String rating;
	private ArrayList<String> listOfEpisodes, listOfActors;
	private ArrayList<Integer> listOfReviews;
	private Genre genre;
	//Arrays
	public TVSeries()
	{
		listOfEpisodes = new ArrayList<String>();
		listOfActors = new ArrayList<String>();
		listOfReviews = new ArrayList<Integer>();
	}
	//Constructor
	public TVSeries(String title, String rating, ArrayList<String> listOfEpisodes, ArrayList<String> listOfActors,
					ArrayList<Integer> listOfReviews, Genre genre) {
		this.title = title;
		this.rating = rating;
		this.listOfEpisodes = listOfEpisodes;
		this.listOfActors = listOfActors;
		this.listOfReviews = listOfReviews;
		this.genre = genre;
	}
	
	//Getters
	public String getTitle() {
		return title;
	}
	public String getRating() {
		return rating;
	}
	public ArrayList<String> getListOfEpisodes() {
		return listOfEpisodes;
	}
	public ArrayList<String> getListOfActors() {
		return listOfActors;
	}
	public ArrayList<Integer> getListOfRatings() {
		return listOfReviews;
	}
	public Genre getGenre() {
		return genre;
	}
	//Setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setListOfEpisodes(ArrayList<String> listOfEpisodes) {
		this.listOfEpisodes = listOfEpisodes;
	}
	
	public void setListOfActors(ArrayList<String> listOfActors) {
		this.listOfActors = listOfActors;
	}
	
	public void setListOfRatings(ArrayList<Integer> listOfRatings) {
		this.listOfReviews = listOfRatings;
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public void addActor(String actor) {
		listOfActors.add(actor);
	}
	public void addEpisode (String episode) {
		listOfEpisodes.add(episode);
	}
	public void addRating (Integer rating) {
		listOfReviews.add(rating);
	}
	
	
	

}
