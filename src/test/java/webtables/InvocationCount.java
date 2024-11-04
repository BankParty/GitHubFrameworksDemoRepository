package webtables;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=5)
	public void Test01() {
		System.out.println("I am in a repeated testing01");
	}

}
