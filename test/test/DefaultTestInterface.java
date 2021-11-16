package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface DefaultTestInterface {
	
	public void method1();
	public void method2();
	
	@Test
	default void test() {
		assertTrue(StringFunctions.isPlaindrome("OPPO"));
	}

}
