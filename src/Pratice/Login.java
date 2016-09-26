package Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login {
	
	 WebDriver driver;

	@Test
	public void Browsersetup() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","D:\\F Drive\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.myntra.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 WebElement mm=driver.findElement(By.linkText("Men"));
		 WebElement sm=driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div[1]/a[1]"));
		 Actions act=new Actions(driver);
		 act.moveToElement(mm).click(sm).build().perform();
		 WebElement imgh=driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[5]/ul/li[1]/a/img"));
		 WebElement ho=driver.findElement(By.linkText("Add to Bag"));
		 WebElement size=driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[5]/ul/li[1]/div[2]/div/div[2]/button[2]"));
		 Actions act1=new Actions(driver);
		 Thread.sleep(4000);
	     act1.moveToElement(imgh).click(ho).click(size).build().perform();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/a[2]/span")).click();
	     driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[1]/button[2]")).click();
	     
		 //  Thread.sleep(5000);
	    //ct.click(sm).perform();
		 
//		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[4]/a[1]")).click();
         
	}
	
}
