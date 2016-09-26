package Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAutovhc {
	
	 WebDriver driver;
	@Test 
	 public void browser() throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","D:\\F Drive\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://autovhc.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Utility.Capturescreenshot(driver, "Loginscreen");
		driver.findElement(By.id("inputType")).sendKeys("Site");
		driver.findElement(By.id("inputSitecode")).sendKeys("999922");
		driver.findElement(By.id("inputUsername")).sendKeys("ADMIN");
		driver.findElement(By.id("inputPassword")).sendKeys("HEMMIR");
		driver.findElement(By.xpath("//*[@id='login']/form/div[4]/div[1]/button[1]")).click();
		Thread.sleep(8000);
		Utility.Capturescreenshot(driver, "HomeScreen");
		WebElement ele= driver.findElement(By.xpath("//*[@id='menu']/li[2]/a/img"));
		WebElement ele1=driver.findElement(By.xpath("//*[@id='menu']/li[2]/a/span"));
            Actions act=new Actions(driver);
	     act.moveToElement(ele).click(ele1).build().perform();
		//driver.findElement(By.xpath("html/body/div[2]/ng-view/div[2]/div[2]/div[3]/div[1]/div")).click();
		Thread.sleep(6000L);
		Utility.Capturescreenshot(driver, "CurrentvhcScreen");
		
		   
	 }
	 
	

}
