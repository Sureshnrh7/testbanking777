package Selenium.Automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

	public static void main(String[] args) throws InterruptedException {
	try {
		String baseUrl, actual, expected="Products";
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
        driver.findElement(By.xpath("//nav/ul/li[2]/a")).click();
        Thread.sleep(3000);
        
        //Product
        driver.findElement(By.xpath("//li[2]/ul/li[1]/a/p")).click();
        Thread.sleep(3000);
        
        //Compare actual and expected result
        actual=driver.findElement(By.cssSelector("h1.float-left")).getText();
        if(actual.equals(expected))
        	 System.out.println("Test Passed");
        else
        	System.out.println("Test Failed");

        Thread.sleep(2000);
        
        //Enter product name
        driver.findElement(By.xpath("//*[@id='SearchProductName']")).sendKeys("Mouse");
        Thread.sleep(1000);
        
        //Select category
        //driver.findElement(By.xpath("(//select/option)[2]")).click();
        List<WebElement> categoryLists=driver.findElements(By.xpath("//*[@id='SearchCategoryId']/option"));
        for(WebElement list : categoryLists)
        {
        	System.out.println(list.getText());
        }
        
        //Checkbox
        driver.findElement(By.xpath("//*[@id='SearchIncludeSubCategories']")).click();
        Thread.sleep(2000);
        
        //Manufacturer
        driver.findElement(By.xpath("//*[@id='SearchManufacturerId']/option[3]")).click();
        Thread.sleep(1000);
      
        //Vendor
        driver.findElement(By.xpath("//*[@id='SearchVendorId']/option[3]")).click();
        Thread.sleep(1000);
        
        //Warehouse
        driver.findElement(By.xpath("//*[@id='SearchWarehouseId']/option[2]")).click();
        Thread.sleep(1000);
        
        //Product Type
        driver.findElement(By.xpath("//*[@id='SearchProductTypeId']/option[2]")).click();
        Thread.sleep(1000);
        
        //Published
        driver.findElement(By.xpath("//select[@name='SearchPublishedId']/option[3]")).click();
        Thread.sleep(1000);
        
        //Published
        driver.findElement(By.xpath("//input[@name='GoDirectlyToSku']")).click();
        Thread.sleep(1000);
        
        //Product SKU
        driver.findElement(By.xpath("//input[@name='GoDirectlyToSku']")).sendKeys("Selenium");
        Thread.sleep(1000);
        
        //GO button
        driver.findElement(By.xpath("//*[@id='go-to-product-by-sku']")).click();
        Thread.sleep(2000);
        
        //Search button
        driver.findElement(By.xpath("//button[@id='search-products']")).click();
        System.out.println("Clicked on Search button");
        Thread.sleep(2000);
        
        driver.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("In Catch block");
		}
	}
	
}
