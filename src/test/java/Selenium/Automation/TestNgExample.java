package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgExample {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe";
    public WebDriver driver ; 
     
  @Test(priority=1)
  public void verifyHomepageTitle() throws InterruptedException {
       
	  String actualTitle, expectedTitle="Welcome: Mercury Tours"; 
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      driver.manage().window().maximize();
      Thread.sleep(2000);
      actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
       
  }
  
  @Test(priority=2)
  public void verifyLoginPage() throws InterruptedException {
	  
	  String actual, expected="Login Successfully";
	  
	  //Enter username
      driver.findElement(By.name("userName")).sendKeys("Mercury");
      Thread.sleep(1000);

      //Enter password
      driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("mercury");
      Thread.sleep(1000);
      
      //Click on Login button
      driver.findElement(By.name("submit")).click();
      Thread.sleep(2000);
      
      //Compare actual and expected result
      actual=driver.findElement(By.xpath("//h3")).getText();
     /* if(actual.equals(expected))
      	 System.out.println("Login Test Passed");
      else
      	System.out.println("Login Test Failed");
      		(or)*/
    //  Assert.assertEquals(actual, expected);
      Assert.assertEquals(actual, expected, "Both are not equal");
      		

      Thread.sleep(2000);

  }

  @Test(priority=3)
  public void verifyFlightReservation() throws InterruptedException {
	//Click on Flight link from left sidebar
      driver.findElement(By.xpath("//a[text()='Flights']")).click();
      System.out.println("Clicked on Flights link");
      
      //Click on One way radio button
      driver.findElement(By.xpath("(//input)[2]")).click();
      
      //Select passengers 
      driver.findElement(By.xpath("(//select/option)[2]")).click();
      
      //Departure
      driver.findElement(By.xpath("//tr[4]/td[2]/select/option[3]")).click();
      Thread.sleep(2000);
      
      //select service class
      driver.findElement(By.xpath("(//input)[4]")).click();
      
      //Select airline preferences
      driver.findElement(By.xpath("//select[@name='airline']/option[2]")).click();
      System.out.println("Selected Airline Preferences");
      Thread.sleep(2000);
      
      //Click on continue button
      driver.findElement(By.name("findFlights")).click();
      System.out.println("Clicked on Continue button");
      Thread.sleep(2000);
     
      driver.close();
  } 
}
