package TestNG.com.testNG_demo;

import org.testng.annotations.Test;

public class Priority_Demo {
	
	@Test(priority=2, enabled=true)
	public void aa1 () {
		System.out.println("m1");
	}
	@Test(priority=1)
	public void aa2 () {
		System.out.println("a2");
	}
	@Test(priority=4)
	public void AAa1 () {
		System.out.println("b1");
	}
	@Test(priority=3)
	public void A1a2 () {
		System.out.println("z2");
}

}
