package action.com;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest3 {
	
	WebDriver driver;
  @Test
  public void login() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
/*{
	@Test(enabled=true)
	public void testMouse()
	{
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Actions action=new Actions(driver);
		WebElement draggable=driver.findElement(By.xpath("//div[id()='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//div[id()='droppable']"));
		action.dragAndDrop(draggable).perform();
		
}
}*/
  
 /* {
		@Test(enabled=true)
		public void testMouse()
		{
			driver.get("http://jqueryui.com/dialog/");
			Actions act=new Actions(driver);
			WebElement close=driver.findElement(By.xpath("//span[title()='close']"));
			act.moveToElement(close).perform();
		
			//if an element is inside a frame, on right click we'll see view frame source. SO iframe tag is the grandparent element of the mentioned frame.
	}
	}
  */
  {
	  //code for iframe
	  @Test(enabled=true)
		public void testMouse()
		/*driver.get("http://jqueryui.com/dialog/");
		driver.switchTo()frame(index of the frame); //switch to the frame in whoich element is present
	  driver.findElement(By.xpath(xpathExpression))// we go to the element in which we have to go
	  driver.switchTo().defaultContent();// we go out of the frame
	  
	 */
	  
	  //if we want to make the first frame as a diffewrent element and approach it by multiple elements
	  driver.get("http://jqueryui.com/dialog/");
	  WebElement frameElement=driver.findElement(By.xpath(xpathExpression));
			  driver.switchTo().frame(frameElement);
			  driver.findElement(By.xpath(xpathExpression));
	  driver.switchTo().defaultContent();
		
  }
  
  @AfterTest
  public void afterTest() {
  //driver.quit }
	
} }
  
	//*[@id="draggable"]/p
}