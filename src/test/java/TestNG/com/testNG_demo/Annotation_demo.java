package TestNG.com.testNG_demo;

import org.testng.annotations.Test;

public class Annotation_demo {
	
	@Test
	public void LaunchBrowser() throws Exception {
	 System.out.println("Luanching browser with selenium code");
	 throw new Exception("sads");
	 
	}
	@Test
	public void LoginToWebsite() {
		 System.out.println("Logged succesfully to broswer");
	}
	 
	
	 

}
