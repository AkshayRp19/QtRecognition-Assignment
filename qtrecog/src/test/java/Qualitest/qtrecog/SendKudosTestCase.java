package Qualitest.qtrecog;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class SendKudosTestCase extends Base {
	
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
	
	public void closeKudosTab() throws IOException, InterruptedException
	   {
	  	 
	  	 Thread.sleep(1000);
	  	 driver.close();
	   }
	
	@Test
	 public void userKudosLogin() throws IOException, InterruptedException
	   {
		   mainLogin();
		   SendKudos sk= new SendKudos(driver);
		   sk.getClickKudos().click();
		   sk.getEmailId().sendKeys("akshay.ragotham@qualitestgroup.com");
		   sk.getSeletPraise().click();
		   sk.getComments().sendKeys("Hi madhu");
		   sk.getSendEmail().click();
		   log.info("Kudos has been sent to the preffered qualitest user");
		   closeKudosTab();
		  
	   }

}
