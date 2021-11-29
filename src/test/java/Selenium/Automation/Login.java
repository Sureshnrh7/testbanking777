package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
    	
        String baseUrl = "https://selfdrvn-qat-web-v2.azurewebsites.net/";
        String expectedTitle = "SelfDrvn Common Federation Provider | Sign In";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.findElement(By.xpath("//button[text()='Sign In to SelfDrvn']")).click();
        
        String parentWindow = driver.getWindowHandle();
     
     for(String winHandle : driver.getWindowHandles()){
         driver.switchTo().window(winHandle);
     }
     	Thread.sleep(3000);
        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(3000);
       
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed");
       }
       
       
       WebElement we=driver.findElement(By.xpath(".//input[@id='username']"));
       
       we.click();
       Thread.sleep(2000);
       we.sendKeys("abcd");
       Thread.sleep(2000);
       driver.findElement(By.id("checkButton")).click();
       Thread.sleep(2000);
        
        
       
        //close chrome
        driver.close();
        
        driver.switchTo().window(parentWindow);
        driver.close();
}
}
