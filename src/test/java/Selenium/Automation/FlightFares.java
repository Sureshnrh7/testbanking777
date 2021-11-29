package Selenium.Automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightFares {
	
	public static void main(String[] args) throws InterruptedException
	{
		String baseUrl, subStr, str;
		int actual, expected=398;
		try {
				baseUrl = "http://demo.guru99.com/test/newtours/";
				System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
				// launch chrome and direct it to the Base URL
				driver.get(baseUrl);
				Thread.sleep(2000);
				driver.manage().window().maximize();
				
				//Display the flight fares
				List<WebElement> listOfFlightFares=driver.findElements(By.xpath("//tr[3]/td/table/tbody/tr"));
				for(WebElement flightFare : listOfFlightFares)
				{
					System.out.println(flightFare.getText());
				}
				Thread.sleep(2000);
				
				WebElement flightFare=driver.findElement(By.xpath("//tr[3]/td/table/tbody/tr[1]/td[2]"));
				System.out.println(flightFare.getText());
				str=flightFare.getText();
				subStr=str.substring(1, 4);
				actual=Integer.parseInt(subStr);
				System.out.println(actual);
				if(actual==expected)
					System.out.println("Test Passed");
				else
					System.out.println("Test Failed");
				
				
				//Close the browser
				driver.close();
      
			}catch(Exception e){
				System.out.println("In main() Catch block");
			}   
	}

}
