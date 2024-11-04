package suitec;

import org.testng.annotations.Test;

public class TestC {
	@Test
	public void testC() throws InterruptedException {
		System.out.println("Starting C");
		Thread.sleep(2000);
		System.out.println("Ending C");
	}

}
