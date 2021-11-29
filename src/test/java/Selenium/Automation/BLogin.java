package Selenium.Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BLogin {
	
	public static void main(String[] args) throws InterruptedException {
		try {
		String baseUrl, actual, expected="Hello Admin User", actResult, expResult="700.0 was successfully transferred";
		baseUrl = "https://demo.testfire.net/";
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
		// launch chrome and direct it to the Base URL
        driver.get(baseUrl);
        Thread.sleep(2000);
        
        //Entry
        System.out.println("Hello, Welcome to Automation Testing");
        
        //Sign in
        driver.findElement(By.id("LoginLink")).click();
        Thread.sleep(2000);
        
        //Enter username
        driver.findElement(By.xpath("//*[@id='uid']")).sendKeys("admin");
        Thread.sleep(2000);

        //Enter password
        driver.findElement(By.xpath("//*[@id='passw']")).sendKeys("admin");
        Thread.sleep(2000);
        
        //Click on Login button
        driver.findElement(By.name("btnSubmit")).click();
        Thread.sleep(2000);
        
        //Compare actual and expected result
        actual=driver.findElement(By.xpath("//h1")).getText();
        if(actual.equals(expected))
        	 System.out.println("Login Test Passed");
        else
        	System.out.println("Login Test Failed");

        Thread.sleep(2000);
       
   /*     //Transfer funds
        driver.findElement(By.linkText("Transfer Funds")).click();
       
        //select to account
        driver.findElement(By.xpath("//*[@id='toAccount']/option[2]")).click();
        Thread.sleep(2000);
       
        //enter transfer amount
        driver.findElement(By.cssSelector("#transferAmount")).sendKeys("700");
        Thread.sleep(1000);
       
        //click on button
        driver.findElement(By.xpath("//input[@value='Transfer Money']")).click();
        Thread.sleep(2000);
       
        //actual result
        actResult=driver.findElement(By.id("_ctl0__ctl0_Content_Main_postResp")).getText();
        if(actResult.contains(expResult))
        	System.out.println("Transfer funds Test Passed");
        else
        	System.out.println("Transfer funds Test Failed");*/
        
        //Exit
        System.out.println("Good Luck");
       
        driver.close();
      
		}catch(Exception e)
		{
			System.out.println("In main()");
		}   
	}
	
}
