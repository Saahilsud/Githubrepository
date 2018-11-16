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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

@Test
public class newtest4 {
	
	WebDriver driver;
  public void login() {
  }
  @BeforeTest
  public void beforeTest()
  {
	 
	 /* ChromeOptions chrome=new ChromeOptions();  // extension made
	  chrome.addExtensions(new File("C:\\Selenium Advance\\onedrive files\\Other softwres for selenium advanced\\ExtensionsFile\\KatalonChrome.crx"));    //this is the configuration part which is what we do before launching the chrome browser
	  
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver.exe");
	  driver= new ChromeDriver(chrome);  // add the extension here
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }  
  */
  /* {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\gecko\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  } */
  
  
  
  /* @Test(enabled=true)
  
  public void testMouse()
  {
  	driver.get("https://medialize.github.io/jQuery-contextMenu/demo.html");
  	Actions act=new Actions(driver);
  	*/
  	/*FirefoxProfile profile= new FirefoxProfile();
  	profile.addExtension(new File("C:\\Selenium Advance\\onedrive files\\Other softwres for selenium advanced\\ExtensionsFile\\adblock.xpi"));      // adding an extension to the firefox
	  
  	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\gecko\\geckodriver.exe");
	  driver= new FirefoxDriver(profile);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  */
	  
	  
	 //add extension to your own created profile.
	  /* ProfilesIni firefoxp=new ProfilesIni();
	  FirefoxProfile newfp= firefoxp.getProfile("Selenium3plusprofile");*/
	  
	  driver.get("https://www.google.com/");
	  	
	 FirefoxProfile profile= new FirefoxProfile();
	 profile.setPreference("general.useragent.override", "iPhone");   //preferences predefined in the pref file.  pref.js
	 System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\gecko\\geckodriver.exe"); 
	  driver= new FirefoxDriver(profile);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }	
  	 @AfterTest
  	  public void afterTest() {
  	  //driver.quit }
  		
  	} }
  	  