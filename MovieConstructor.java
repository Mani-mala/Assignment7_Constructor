package assignment7;
import java.util.List;
import java.util.ArrayList;
public class MovieConstructor {
	public static void main(String[] args) {
	 List<Movie> movies=new ArrayList<>();
	 movies.add(new Movie("Sachin","Vijay, Jenelia","Love, Comedy","John","14-04-2005",2.30f,9.5f));
	 movies.add(new Movie("Vikram", "Kamal Haasan, Vijay Sethupathi, Fahadh Faasil", "Action, Thriller", "Lokesh Kanagaraj", "03-06-2022", 2.55f, 9.0f));  
	 movies.add(new Movie("Thalapathi", "Rajinikanth, Mammootty, Shobana", "Action, Drama", "Mani Ratnam", "05-11-1991", 2.37f, 8.8f));  
	 movies.add(new Movie("Anniyan", "Vikram, Sada, Prakash Raj", "Action, Psychological Thriller", "S. Shankar", "17-06-2005", 3.01f, 8.5f));  
	 movies.add(new Movie("Kaithi", "Karthi, Narain, Arjun Das", "Action, Thriller", "Lokesh Kanagaraj", "25-10-2019", 2.27f, 8.9f));  
	 int i=1;
	 for(Movie movie : movies)
	 {
		 System.out.println("MOVIE : "+i++);
		 movie.display();
	 }
	}

}
class Movie
{
	private final static String language="Tamil";
	private String movie_name;
	private String starring;
	private String genres;
	private String director;
	private String releasing_date;
	private float duration;
	private float ratings;
	
	Movie(String movie_name,String starring,String genres,String director,String releasing_date,float duration,float ratings)
	{
		this.movie_name=movie_name;
		this.starring=starring;
		this.genres=genres;
		this.director=director;
		this.releasing_date=releasing_date;
		this.duration=duration;
		this.ratings=ratings;
	}
	public void display()
	{
		System.out.println("Movie-Name : "+movie_name);
    	System.out.println("Starring : "+starring);
    	System.out.println("Genres : "+genres);
    	System.out.println("Director : "+director);
    	System.out.println("Realising Date : "+releasing_date);
    	System.out.println("Duration : "+duration);
    	System.out.println("Ratings : "+ratings);
    	System.out.println("Language : "+language);
    	System.out.println();
    	
	}
}
