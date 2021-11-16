package packageA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import test.StringFunctions;

public class ClassATest {
	
	@Tag("Sanity")
	@Test
	@DisplayName("Test 1")
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

}
