package twJava8Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RentalMovieMain {

	public static void main(String[] args) throws IOException{
		String fileName = "movies.csv";
		
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.skip(1)
			.filter(s->!s.contains("\""))
			.peek(System.out::println)
			.map(Movie :: new)
			//.filter(Movie -> Movie.getYear() == 2015)
			//.forEach(System.out :: println);
			.collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
