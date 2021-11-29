package Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximize {
	
	public static void main(String[] args) throws InterruptedException {
		try {
				String baseUrl="https://demo.testfire.net/";
				System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
				// launch Fire fox and direct it to the Base URL
				driver.get(baseUrl);
        
				//Window maximize
				driver.manage().window().maximize();
				Thread.sleep(2000);
				System.out.println("Window maximized");
       
				driver.close();
      
			}catch(Exception e) {
				
			System.out.println("In main()");
		}   
	}

}
