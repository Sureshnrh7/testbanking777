package Selenium.Automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomersCheckbox {
	
	public static void main(String[] args) throws InterruptedException {
		try {
			String baseUrl;
			baseUrl = "https://admin-demo.nopcommerce.com/";
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
			
			 // launch chrome and direct it to the Base URL
	        driver.get(baseUrl);
	        Thread.sleep(2000);
	        
	        //Maximize URL
	        driver.manage().window().maximize();
	        
	        //Entry
	        System.out.println("Hello, Welcome to Automation Testing");
	        
	        //Login
	        driver.findElement(By.xpath("//button[text()='Log in']")).click();
	        Thread.sleep(2000);

	        //Category
	        driver.findElement(By.xpath("//nav/ul/li[4]/a/p")).click();
	        Thread.sleep(2000);
	        
	        //Product
	        driver.findElement(By.xpath("//li[4]/ul/li[1]/a/p")).click();
	        Thread.sleep(2000);
	        
	        //Checkboxs
	        List<WebElement> checkBoxes=driver.findElements(By.name("checkbox_customers"));
	        System.out.println("Size of the checkboxes: " + checkBoxes.size());
	        
	        int i=1;
	        for(WebElement checkBox : checkBoxes)
	        {
	        	checkBox.click();
	        	System.out.println("Checkbox "+ i +" is clicked");
	        	Thread.sleep(1000);
	        	i=i+1;
	        }
	        
	        driver.close();
			
		}catch(Exception e) {
				e.printStackTrace();
				System.out.println("In Catch block");
			}
		}


}
