package suiteb;

import org.testng.annotations.Test;

public class TestB {
	@Test
	public void testB() throws InterruptedException {
		System.out.println("Starting B");
		Thread.sleep(2000);
		System.out.println("Ending B");
	}

}
