package jsonDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
@RunWith(MockitoJUnitRunner.class)
public class JsonDemoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGivenJsonHasUnknownValues_whenDeserializing_thenException() throws Exception{
		String jsonAsString = "{\n" +
				"  \"stringValue\":\"a\",\n" +
				"  \"intValue\":1,\n" +
				"  \"booleanValue\":true,\n" +
				"  \"stringValue2\":\"foo\"\n" +
				"}";
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
       // mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		
	}
	

}
