package Qualitest.qtrecog;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageUrl extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
 
  public void mainLogin() throws IOException
  {
	     driver=driverInitialise();
	     driver.get(prop1.getProperty("url"));
	     LoginPage l=new LoginPage(driver);
	     l.getUserName().sendKeys("madhu.sudhan@qualitestgroup.com");
	  	 l.getPassword().sendKeys("P@ssw0rd");
	  	 l.getClick().click();
  }
  
   public void closeTab() throws IOException, InterruptedException
   {
  	 
  	 Thread.sleep(1000);
  	 driver.close();
   }
   
   @Test
   public void userValidLogin() throws IOException, InterruptedException
   {
	   mainLogin();
	   closeTab();
   }
   
   @Test
   public void invalidLogin() throws IOException
   {
	   driver=driverInitialise();
	   driver.get(prop1.getProperty("url"));
	   LoginPage l=new LoginPage(driver);
	   l.getUserName().sendKeys("akshay.19rp@gmail.com");
	   l.getPassword().sendKeys("chikku");
	   l.getClick().click();
	   l.getError();
	   log.error("Alert Message stating 'Invalid username or password' is displayed");
   }
   
   @Test
   public void title() throws IOException, InterruptedException
   {   driver=driverInitialise();
	   String title=driver.getTitle();
	   closeTab();
	   log.info("QTRecognition has been displayed");
	 
   }
   
   
   @Test
   public void getNavy() throws IOException, InterruptedException
   {
	   driver=driverInitialise();
	   driver.get(prop1.getProperty("url"));
	   LoginPage l=new LoginPage(driver);
	   String C1=l.getColor1().getCssValue("background-color");
	   String logColor=Color.fromString(C1).asHex().toUpperCase();
	   Assert.assertEquals(logColor, "#2A2559");
	   log.info("Navy color has been verified and it is according to Qualitest Standards");
	   closeTab();
	  
   }
   @Test
   public void getGold() throws IOException, InterruptedException
   {
	   driver=driverInitialise();
	   driver.get(prop1.getProperty("url"));
	   LoginPage l=new LoginPage(driver);
	   String C2=l.getColor2().getCssValue("background-color");
	   String backColor=Color.fromString(C2).asHex().toUpperCase();
	   Assert.assertEquals(backColor,"#FECC160");
	   log.error("Gold color is not according Qualitest approved standards");
	   closeTab();
	
	   
   }
   @Test
   public void getWhite() throws IOException, InterruptedException
   {
	   driver=driverInitialise();
	   driver.get(prop1.getProperty("url"));
	   LoginPage l=new LoginPage(driver);
	   String C3=l.getColor3().getCssValue("background-color");
	   String backColor1=Color.fromString(C3).asHex().toUpperCase();
	   Assert.assertEquals(backColor1,"#FECC160");
	   log.error("White color is not according Qualitest approved standards");
	   closeTab();
	   
   }
   
  
   
     
    
 
}
