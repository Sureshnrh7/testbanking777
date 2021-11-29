package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountHistory {
	
	public static void main(String[] args) throws InterruptedException {
		try {
		String baseUrl, actual, expected="Hello Admin User";
		baseUrl = "https://demo.testfire.net/";
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		
		 // launch chrome and direct it to the Base URL
        driver.get(baseUrl);
        Thread.sleep(2000);
        
        //Entry
        System.out.println("Hello, Welcome to Automation Testing");
        
        //Login
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
        
        //Click on Go button
        driver.findElement(By.id("btnGetAccount")).click();
        System.out.println("Clicked on Go button");
        Thread.sleep(1000);
        
        //Select 800001 account from dropdown list
        driver.findElement(By.xpath("//*[@id='listAccounts']/option[2]")).click();
        System.out.println("Selected 800001 account");
        
        //Click on Select account button
        driver.findElement(By.id("btnGetAccount")).click();
        System.out.println("Clicked on Select account");
        Thread.sleep(2000);
        
        //Compare actual and expected account
        String actAccount, expAccount="Account History - 800001 Checking";
        actAccount=driver.findElement(By.xpath("//h1")).getText();
        if(actAccount.equals(expAccount))
        	System.out.println("Test Passed");
        else
        	System.out.println("Test Failed");
        
        driver.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("In Catch block");
		}
	}
}
	