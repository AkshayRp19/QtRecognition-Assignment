package Qualitest.qtrecog;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecentContactsTestCases extends Base{
	
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
       public void fetchRecent() throws IOException, InterruptedException
       {
    	   mainLogin();
    	   RecentContacts rc=new RecentContacts(driver);
    	   
    	  rc.getRecentContacts().click();
    	  rc.getRecentPraise().click();
    	  rc.getRecentComment().sendKeys("Hello");;
    	  rc.getRecentSendMail().click();
    	  Thread.sleep(5000);
    	  String e= rc.getRecentError().getText();
    	  log.error("'Mailer Error: SMTP connect() failed.' while sending kudos to recent contacts");
    	  if(e.contains("Mailer Error: SMTP connect() failed."))
    	  {
    		  Assert.assertTrue(false);
			  
    	  }
       }
}
