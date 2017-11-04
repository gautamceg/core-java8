package twJava8Task1;

import java.util.Arrays;
import java.util.List;

public class Movie {

	private long movieId;
	private String title;
	private int year; 
	private List<String> genres;
	
	public Movie(String input) {
		String[] columnIndex = input.split(",");
		this.movieId = Integer.parseInt(columnIndex[0]);
		this.title= getTitle(columnIndex[1]);
		this.year = getYear(columnIndex[1]);
		this.genres = getGenres(columnIndex[2]);
	}

	private List<String> getGenres(String string) {
		return Arrays.asList(string.split("\\|"));
	}

	private int getYear(String string) {
		int length = string.trim().length();
		return Integer.parseInt(string.trim().substring(length-5, length-1));
	}

	private String getTitle(String string) {
		return string.substring(0, string.length()-6);
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", year=" + year + ", genres=" + genres + "]";
	}
	
	
	
}
