package Qualitest.qtrecog;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;



public class InvalidSendKudosTest extends Base {
	
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
	   public void nonQtEmail() throws IOException, InterruptedException
	   {
		   mainLogin();
		   InvalidSendKudos isk=new InvalidSendKudos(driver);
		   isk.getClickKudos().click();
		   isk.getEmailId().sendKeys("akshay19rp@gmail.com");
		   isk.getSeletPraise().click();
		   isk.getComments().sendKeys("Hello");
		   isk.getSendEmail().click();
		   Thread.sleep(1000);
		   String errorMsg=isk.getError().getText();
		  log.error("An error message has been displayed'Please enter receiver email address.'");
		   if(errorMsg.contains("Please enter receiver email address."))
		   {
			   Assert.assertTrue(false);
			   
		   }
	   }
	   
	 @Test
	  public void noCitation() throws IOException, InterruptedException
	   {
		   mainLogin();
		   InvalidSendKudos isk=new InvalidSendKudos(driver);
		   isk.getClickKudos().click();
		   isk.getEmailId().sendKeys("P Akshay Raghottham  (akshay.ragotham@qualitestgroup.com,)");
		   isk.getSeletPraise().click();
		   isk.getSendEmail().click();
		   Thread.sleep(1000);
		   String errorMsg=isk.getError().getText();
		   log.error("An error message has been displayed saying'Please enter any comment.'");
		   if(errorMsg.contains("Please enter any comment."))
		   {
			   Assert.assertTrue(false);
			   System.out.println("Error Message is displayed");
		   }
	   }
	  @Test
	  public void noKudosImage() throws IOException, InterruptedException
	   {
		   mainLogin();
		   InvalidSendKudos isk=new InvalidSendKudos(driver);
		   isk.getClickKudos().click();
		   isk.getEmailId().sendKeys("Brian Crout  (brian.crout@qualitestgroup.com)");
		   isk.getComments().sendKeys("Hello");
		   isk.getSendEmail().click();
		   Thread.sleep(1000);
		   String errorMsg=isk.getError().getText();
		   log.error("An error message has been displayed'Please enter receiver email address.'");
		   if(errorMsg.contains("Please enter mandatory fields."))
		   {
			   Assert.assertTrue(false);
			    System.out.println("Error Message is displayed");
		   }
	   }
	  
	
	
}
