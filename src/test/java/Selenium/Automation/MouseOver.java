package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String[] args) throws InterruptedException {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get(baseUrl);        
                driver.manage().window().maximize();
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//tr[@class='mouseOut'][1]/td[1]"));    
                 
                Actions builder = new Actions(driver);
                Thread.sleep(2000);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                Thread.sleep(2000);
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                mouseOverHome.perform();        
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);
                driver.close();
        }

}
