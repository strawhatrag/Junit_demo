package test;


import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunit {
	
	@BeforeAll
	public static void Method3() {
		System.out.println("Inside Before All");
	}
	
	@BeforeEach
	public void Method1() {
		System.out.println("Inside Before Each Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Inside Test1");
	}
	@Test
	public void test2() {
		
		boolean flag = true;
		Assert.assertTrue(flag);
		System.out.println("Inside Test2");
	}
	
	@AfterEach
	public void Method2() {
		System.out.println("Inside After Each Method");
	}
	
	@AfterAll
	public static void Method4() {
		System.out.println("Inside After All");
	}

}
