package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(ParameterProvideClass.class)
public class JunitWithParamClass {
	
	@Test
	@DisplayName("Positive Test")
	public void test1(String param1) {
		
		assertTrue(StringFunctions.isPlaindrome(param1));
	}

}
