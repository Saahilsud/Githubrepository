package action.com;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

@Test
public class NewTest {
	
	WebDriver driver;
  public void login() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
 /* @Test(enabled=true)
public void testMouse()
{
	driver.get("https://www.homeshop18.com/");
	Actions act=new Actions(driver);
	WebElement digital=driver.findElement(By.xpath("//a[text()='digital']"));         //most common statement used
	act.moveToElement(digital).perform();	//performing  mouse action -->  move to element
	
	WebElement digit=driver.findElement(By.xpath("//a[@onclick()='_izooto.closeDialog']")); //popup closed
	digit.click();
	
	
	WebElement digi=driver.findElement(By.xpath("//a[@title()='close']"));   //popup closed
	digi.click();

}
}*/

/*@Test(enabled=false)
public void testMouse()
{
	driver.get("https://www.google.com/");
	Actions act=new Actions(driver);
	WebElement digital=driver.findElement(By.xpath("//div[@id()='SivCob'][1]"));         //id from inspect element and then Index no of the wanted one
	act.moveToElement(digital).perform();
	
	WebElement guj=driver.findElement(By.xpath("//div[@id()='SivCob'][1]"));
		//open link in new window
			// build used to perform and combine 2 actions together
			//act.keyDown(Keys.Shift).click(guj).build().perform();
			//open link in new tab
			act.keyDown(Keys.Control).click(guj).build().perform();
			//generalise methos to be used with sikuli

}  */
	
	//contextclick--> right click operation

	  	




 @Test(enabled=true)
 
public void testMouse()
{
	driver.get("https://medialize.github.io/jQuery-contextMenu/demo.html");
	Actions act=new Actions(driver);
	WebElement rtclickbutton=driver.findElement(By.xpath("//*[text()='right click me']")) ;     
	act.contextClick(rtclickbutton).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	/*driver.get("http://jqueryui.com/dialog/");
		Actions act=new Actions(driver);
		WebElement close=driver.findElement(By.xpath("//span[title()='close']"));
		act.moveToElement(close).perform();  */
  
} 

 /*
 public void testMouse() throws IOException
 
 /*  {
 	/*driver.get("https://medialize.github.io/jQuery-contextMenu/demo.html");
 	Actions act=new Actions(driver);
 	WebElement rtclickbutton=driver.findElement(By.xpath("//*[text()='right click me']")) ;     
 	act.contextClick(rtclickbutton).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
 	
 	 driver.get("http://jqueryui.com/dialog/");
 		Actions act=new Actions(driver);
 		WebElement close=driver.findElement(By.xpath("//span[title()='close']"));
 		act.moveToElement(close).perform();
  
 }
 
 {
	 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	 
			
			 driver.switchTo().frame(0);//index of the frame that we want to operate
			 driver.switchTo().frame(1);// next frame index we wanr to operate.
			 WebElement close=driver.findElement(By.xpath("//span[title()='close']"));
			 
	 
 } */
	
 /* { 
	 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	 File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(srcFile, new File("C:\\Users\\training_d5.01.02\\Pictures\\Camera Roll\\ss.png"));   //file is a class directly creating an object here
	 
 } */
 
 
//Profile of any browser


 
 @AfterTest
  public void afterTest() {
  //driver.quit }
	
} }
  
  





