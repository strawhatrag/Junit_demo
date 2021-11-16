package packageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import test.StringFunctions;

public class ClassBTest {
	
	@Tag("Sanity")
	@Test
	@DisplayName("Test 2")
	public void test2() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

}
