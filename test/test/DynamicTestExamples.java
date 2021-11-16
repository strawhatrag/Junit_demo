package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DynamicTestExamples {

	@TestFactory
	public Collection<DynamicTest> method1(){
		return Arrays.asList(DynamicTest.dynamicTest("Possitive Test", () -> assertTrue(StringFunctions.isPlaindrome("OPPO"))),
				DynamicTest.dynamicTest("Negetive Test", () -> assertFalse(StringFunctions.isPlaindrome("abcd"))),
				DynamicTest.dynamicTest("Possitive Test", () -> assertTrue(StringFunctions.isPlaindrome("abaaaa")))
				);
	}

}
