package Selenium.Automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
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
				
				//Get all links
				List<WebElement> allLinks=driver.findElements(By.xpath("//td/ul/li"));
				int size=allLinks.size();
				System.out.println("No. of links available in webpage: "+size);
				int i=1;
				for(WebElement linkName : allLinks)
				{
					System.out.println("Link name "+ i + " is : "+linkName.getText());
					i=i+1;
				}
				
				
				//Close the browser
				driver.close();
      
			}catch(Exception e) {
				
			System.out.println("In main()");
		}   
	}

}



