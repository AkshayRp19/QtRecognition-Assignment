package Qualitest.qtrecog;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

public class SearchKudosTest extends Base{
	
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
	public void searchKudos() throws IOException
	{
		mainLogin();
		KudosSearch ks1=new KudosSearch(driver);
		boolean ks=ks1.getSearchKudos().isDisplayed();
		Assert.assertTrue(ks);
		log.info("Kudos Search has been displayed and verfied");
	}
	@Test
	public void searchKudos1() throws IOException
	{
		mainLogin();
		KudosSearch ks1=new KudosSearch(driver);
		ks1.getSearchKudos().click();
		ks1.getSentKudos().click();
		ks1.getSentKudos().sendKeys("Ann M Pierce  (ann.pierce@qualitestgroup.com)");
		ks1.getClickSentKudos().click();
		boolean h=ks1.getKudosHistory().isDisplayed();
		Assert.assertTrue(h);
		log.info("Kudos Search History has been displayed and verfied");
		
	}
	
	
}
