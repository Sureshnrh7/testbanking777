package Selenium.Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login1 {
public static void main(String[] args) throws InterruptedException {
try {
	

System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh.nampalli\\eclipse-workspace\\SelfDrvn2.0\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();

String baseUrl = "https://selfdrvn-qat-web-v2.azurewebsites.net/";
String actualTitle = "";
// launch Fire fox and direct it to the Base URL
driver.get(baseUrl);
driver.manage().window().maximize();
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

/*if (actualTitle.contentEquals(expectedTitle)){
System.out.println("Test Passed!");
} else {
System.out.println("Test Failed");
}*/


WebElement we=driver.findElement(By.xpath("//*[@id='username']"));

we.click();
Thread.sleep(2000);
we.sendKeys("sravanthi@selfdrvn.com");
Thread.sleep(2000);
driver.findElement(By.id("checkButton")).click();
Thread.sleep(3000);


driver.findElement(By.xpath("//*[@id='form-container']//div[1]/a/div/img")).click();
Thread.sleep(2000);
WebElement pw=driver.findElement(By.xpath("//input[@type='password']"));
pw.click();
Thread.sleep(2000);
pw.sendKeys("Abcd1234");
driver.findElement(By.id("submitButton")).click();
Thread.sleep(3000);

driver.switchTo().window(parentWindow);
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id='toggle']/a[1]/p")).click();
System.out.println("Dashboard module clicked");
Thread.sleep(2000);


}catch(Exception e)
{
e.printStackTrace();	
}

}

}