package Qualitest.qtrecog;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ActivityPage extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	public void loginCred() throws IOException
	  {
		  driver=driverInitialise();
		  driver.get(prop1.getProperty("url"));
		  LoginPage l=new LoginPage(driver);
		
		  l.getUserName().sendKeys("madhu.sudhan@qualitestgroup.com");
		  l.getPassword().sendKeys("P@ssw0rd");
		  l.getClick().click();
	  }
	public void closeWindow() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void validLogin() throws IOException, InterruptedException
	{
		loginCred();
		log.info("User has logged in using valid credentials");
		closeWindow(); 
	}
	
	@Test
	public void getNameOnScreen() throws IOException 
	{
		  loginCred();
		  HomePageObj hp=new HomePageObj(driver);
	      String n= hp.getName().getText();
	      Assert.assertEquals(n,"P Akshay Raghotham");
	      log.info("User name has been displayed on left side of screen");
	}
	
	@Test
	public void getImageOnScreen() throws IOException
	{
		 loginCred();
		 HomePageObj hp=new HomePageObj(driver); 
	  	 String image1= hp.getImage().getAttribute("alt");
	  	 if(image1.equalsIgnoreCase("Sample Image"))
	  	 {
	  		Assert.assertTrue(false);
	  		log.error("Sample image is not displayed");
	  	 }
	 
	  	  
	}
	@Test
	public void titleName() throws IOException 
  	{
		   driver=driverInitialise();
		   String title=driver.getTitle();
		   Assert.assertEquals(title, "QTRecognition");
		   log.info("QTRecognition has been displayed");
		  
  	}
	

}
