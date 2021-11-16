package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionExamples {
	
	@BeforeEach
	public void setup() {
		System.setProperty("ENV", "PROD");
	}
	@Test
	public void test1() {
		String ExpectedEnv = "DEV";
		String ActualEnv = System.getProperty("ENV");
		assumeFalse(ExpectedEnv.equals(ActualEnv)); //if assume fails it will skip  the test case
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}
}