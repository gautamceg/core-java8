package twJava8Task1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Movie m = new Movie("1076	Innocents, The (1961)	Drama|Horror|Thriller");
		assertTrue(true);
	}

}
