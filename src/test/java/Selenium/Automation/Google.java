package Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
		
		public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
	        String baseUrl = "https://www.google.com";
	        
	        // launch chorme browser and direct it to the Base URL
	        driver.get(baseUrl);
	        
	        //Maximize the chrome browser
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        System.out.println("Maximized chrome browser");

	        //Close the browser
	        driver.close();
	}
}



